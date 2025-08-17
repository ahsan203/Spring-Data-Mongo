package com.ahsan.service;

import com.ahsan.model.Task;
import com.ahsan.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService
{
    @Autowired
    private TaskRepository repository;

    //---------- Performing CRUD operations: --------------

    public Task saveTask(Task task)
    {
        task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(task);
    }

    public List<Task> getAllTask()
    {
        return repository.findAll();
    }


    public Task getTask(String taskId)
    {
        return repository.findById(taskId).get();
    }

    public Task updateTask(Task task)
    {
        //--- step-1 : first get the Task by taskID
        Task existingTask = getTask(task.getTaskId());

        //--- step-2 : update the existingTask
        existingTask.setDescription(task.getDescription());
        existingTask.setAssignee(task.getAssignee());
        existingTask.setPriority(task.getPriority());
        existingTask.setStoryPoint(task.getStoryPoint());

        //--- step-3 : Save the Task
        return repository.save(existingTask);
    }

    public String  deleteTask(String taskId)
    {
        Task existingTask = getTask(taskId);

        repository.delete(existingTask);

        return "TaskId : " + taskId + " got successfully deleted!";

    }
}
