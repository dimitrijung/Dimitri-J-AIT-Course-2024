package Shablon_crud_todolist.todolist.dao;

import Shablon_crud_todolist.todolist.model.Task;

import java.util.List;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);
    // remove Task
    Task removeTask(int taskNumber);
    // print list of Tasks
    void viewTasks();
    List<Task> getAllTasks(); // взять весь список
    // quantity of tasks
    int quantity();

}
