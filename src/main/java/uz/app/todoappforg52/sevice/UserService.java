package uz.app.todoappforg52.sevice;

import uz.app.todoappforg52.entity.UserEntity;

public class UserService extends BaseService<UserEntity> {
    private static UserService instance;
    private UserService() {}
    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    @Override
    protected boolean checkEntity(UserEntity entity) {
        for (UserEntity userEntity : entities) {
            if (userEntity.getUsername().equals(entity.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public UserEntity login(String username, String password) {
        for (UserEntity userEntity : entities) {
            if (userEntity.getUsername().equals(username) &&
                    userEntity.getPassword().equals(password)) {
                return userEntity;
            }
        }
        return null;
    }
}
