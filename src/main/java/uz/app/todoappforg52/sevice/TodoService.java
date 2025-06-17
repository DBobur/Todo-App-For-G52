package uz.app.todoappforg52.sevice;

import uz.app.todoappforg52.entity.TodoEntity;

public class TodoService extends BaseService<TodoEntity> {
    @Override
    protected boolean checkEntity(TodoEntity entity) {
        for (TodoEntity todoEntity : entities) {
            if(todoEntity.getUserId().equals(entity.getUserId()) &&
                    todoEntity.getTodo().equals(entity.getTodo())
            ) return true;
        }
        return false;
    }
}
