package Shablon_crud_todolist.todolist.dao;

import Shablon_crud_todolist.todolist.model.Task;

import java.util.List;

public class ToDoListImpl implements ToDoList {


    @Override
    public boolean addTask(Task task) {
        return false;
    }

    @Override
    public Task removeTask(int taskNumber) {
        return null;
    }

    @Override
    public void viewTasks() {

    }

    @Override
    public List<Task> getAllTasks() {
        return List.of();
    }

    @Override
    public int quantity() {
        return 0;
    }
}
