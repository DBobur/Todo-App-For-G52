package uz.app.todoappforg52.sevice;

import uz.app.todoappforg52.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class BaseService<T extends BaseEntity> {
    protected List<T> entities = new ArrayList<>();
    public boolean addEntity(T entity) {
        if(checkEntity(entity)) return false;
        return entities.add(entity);
    }

    public T getById(UUID id) {
        for(T entity : entities) {
            if(entity.getId().equals(id)) return entity;
        }
        return null;
    }

    public List<T> getAll() {
        return entities;
    }

    protected abstract boolean checkEntity(T entity);
}
