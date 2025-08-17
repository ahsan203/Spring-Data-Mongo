package com.ahsan.repository;

import com.ahsan.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String>
{

    List<Task> findByAssigneeAndPriority(String assignee, String priority);
}
