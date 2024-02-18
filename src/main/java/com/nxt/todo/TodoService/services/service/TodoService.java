package com.nxt.todo.TodoService.services.service;

import com.nxt.todo.TodoService.entities.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TodoService {

    //create
    Todo saveTodoList(Todo list);


    //get all List
    List<Todo> getAllTodoLIst();


    //get single list of given Id
    Todo getSingleList(int id);

//update list
    Todo updateTodoList(Todo list , int id);
// delete list
    void deleteTodo(int id);



}
