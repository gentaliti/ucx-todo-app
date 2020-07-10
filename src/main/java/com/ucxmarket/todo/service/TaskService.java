package com.ucxmarket.todo.service;

import com.ucxmarket.todo.repository.TaskRepository;
import com.ucxmarket.todo.repository.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task getById(Integer id) {
        return this.taskRepository.getOne(id);
    }

    public List<Task> getAllTasks() {
        return this.taskRepository.findAll();
    }

    public void deleteById(Integer id) {
        this.taskRepository.deleteById(id);
    }

    public Task updateTask(Task task) {
        return this.taskRepository.save(task);
    }

    public Task createTask(Task task) {
        return this.taskRepository.save(task);
    }
}
