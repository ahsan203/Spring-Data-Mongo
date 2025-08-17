package com.ahsan.repository;

import com.ahsan.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task,String>
{

}
