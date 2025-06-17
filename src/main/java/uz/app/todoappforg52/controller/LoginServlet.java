package uz.app.todoappforg52.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uz.app.todoappforg52.entity.UserEntity;
import uz.app.todoappforg52.sevice.UserService;

import java.io.IOException;


@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    UserService userService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        UserEntity login = userService.login(username, password);
        if (login == null) {
            req.setAttribute("error", "Invalid username or password");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }else{
            req.setAttribute("user", login);
            req.setAttribute("users",userService.getAll());
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }
    }
}
