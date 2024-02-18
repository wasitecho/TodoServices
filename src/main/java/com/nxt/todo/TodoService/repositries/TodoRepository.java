package com.nxt.todo.TodoService.repositries;

import com.nxt.todo.TodoService.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo,Integer> {


    Todo findById(long id);
}
