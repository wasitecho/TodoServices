package com.nxt.todo.TodoService.services.service.impl;

import com.nxt.todo.TodoService.entities.Todo;
import com.nxt.todo.TodoService.exception.ResourceNotFoundException;
import com.nxt.todo.TodoService.repositries.TodoRepository;
import com.nxt.todo.TodoService.services.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class TodoJpaService implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo saveTodoList(Todo list) {
        return todoRepository.save(list) ;
    }

    @Override
    public List<Todo> getAllTodoLIst() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getSingleList(int id) {

        Todo todoList = todoRepository.findById(id);
        return todoList;
    }

    @Transactional
    @Override
    public Todo updateTodoList(Todo list , int id) {
        Todo todoList2 = todoRepository.findById(id);
        return todoRepository.save(todoList2) ;
    }


    @Transactional
    @Override
    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
}
