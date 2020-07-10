package com.ucxmarket.todo.controller;

import com.ucxmarket.todo.repository.entity.Task;
import com.ucxmarket.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAll() {
        return this.taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getAll(@PathVariable Integer id) {
        return this.taskService.getById(id);
    }

    @PostMapping
    public Task createTask(Task task) {
        return this.taskService.createTask(task);
    }

    @PutMapping
    public Task updateTask(Task task) {
        return this.taskService.updateTask(task);
    }

    @DeleteMapping("/{id}")
    public void updateTask(@PathVariable Integer id) {
        this.taskService.deleteById(id);
    }
}
