package com.example.todoapp.model.DTO;

import com.example.todoapp.model.Task;

import java.time.LocalDateTime;

public class TaskDTO {

    private String description;
    private boolean done;
    private LocalDateTime deadline;

    public TaskDTO(Task task){
        setDescription(task.getDescription());
        setDone(task.isDone());
    }

    public Task toTask(){
        return new Task(description, deadline);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}
