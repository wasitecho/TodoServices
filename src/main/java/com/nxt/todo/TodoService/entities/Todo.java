package com.nxt.todo.TodoService.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "todolist")

public class Todo {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TODO")
    private String todo;

    @Column(name = "STATUS")

    private String status;
    @Column(name = "PRIORITY")
    private String priority;


    //other user properties that you want


}
