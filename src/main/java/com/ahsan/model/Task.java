package com.ahsan.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "Tasks")
public class Task
{
    @Id
    @JsonProperty("tid")
    private String taskId;
    private String description;
    private String priority; //--- P1, P2, P3
    private String assignee;
    private int storyPoint; //--- 1 or 2 or 3

}
