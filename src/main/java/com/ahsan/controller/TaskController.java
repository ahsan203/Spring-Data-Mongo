package com.ahsan.controller;

import com.ahsan.model.Task;
import com.ahsan.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController
{
    @Autowired
    private TaskService taskService;


    @PostMapping
    public Task addNewTask(@RequestBody  Task task)
    {
        return taskService.saveTask(task);
    }


    @GetMapping
    public List<Task> findAllTask()
    {
        return taskService.getAllTask();
    }


    @GetMapping("/{taskId}")
    public Task findTask(@PathVariable String taskId)
    {
        return taskService.getTask(taskId);
    }


    @PutMapping()
    public Task updateTask(@RequestBody  Task task)
    {
        return taskService.updateTask(task);
    }


    @DeleteMapping("/{taskId}")
    public String  deleteTask(@PathVariable String taskId)
    {
        taskService.deleteTask(taskId);

        return "TaskId : " + taskId + " got successfully deleted!";

    }
}
