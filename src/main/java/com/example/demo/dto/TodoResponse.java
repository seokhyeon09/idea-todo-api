package com.example.demo.dto;

import com.example.demo.domain.Todo;
import lombok.Getter;

@Getter
public class TodoResponse {
    private Long id;
    private String title;
    private String content;
    private Boolean completed;

    public TodoResponse(Todo todo){
        this.id = todo.getId();
        this.title = todo.getTitle();
        this.content = todo.getContent();
        this.completed = todo.getCompleted();
    }
}
