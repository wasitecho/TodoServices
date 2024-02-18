package com.nxt.todo.TodoService.controller;

import com.nxt.todo.TodoService.entities.Todo;
import com.nxt.todo.TodoService.services.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;


    //create
    @PostMapping
    public ResponseEntity<Todo> createUser(@RequestBody Todo todoList) {
        Todo todoList1 = todoService.saveTodoList(todoList);
        return ResponseEntity.status(HttpStatus.CREATED).body(todoList1);
    }

    //single user get


    //    @CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratingHotelFallback")
//    @Retry(name = "ratingHotelService", fallbackMethod = "ratingHotelFallback")
    @GetMapping("todos/{id}")
    public ResponseEntity<Todo> getSingleList(@PathVariable int id) {

//        logger.info("Retry count: {}", retryCount);

        Todo todoList = todoService.getSingleList(id);
        return ResponseEntity.ok(todoList);
    }

    //creating fall back  method for circuitbreaker


    //all user get
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodoLIst() {
        List<Todo> allTodoLIst = todoService.getAllTodoLIst();
        return ResponseEntity.ok(allTodoLIst);

    }

    @PutMapping("todos/{id}")
    public ResponseEntity<Todo> updateTodoList(Todo list , int id){
        Todo updateList = todoService.updateTodoList(list , id);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(updateList);
    }


    @DeleteMapping("todos/{id}")
    public void deletetodoList(@PathVariable  int id){

        todoService.deleteTodo(id);
        ResponseEntity.status(HttpStatus.NOT_FOUND);
    }
}
