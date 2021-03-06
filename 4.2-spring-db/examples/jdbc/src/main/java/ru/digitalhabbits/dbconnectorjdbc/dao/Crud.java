package ru.digitalhabbits.dbconnectorjdbc.dao;

public interface Crud<T> {
    T create(T object);
    T read(T object);
    T update(T object);
    T delete(T object);
}
