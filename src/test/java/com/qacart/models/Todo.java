package com.qacart.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Todo {
    //Request
    private String item;
    private Boolean isCompleted;
    //Response
    private String createdAt;
    private String userID;
    @JsonProperty("__v")
    private int v;
    @JsonProperty("_id")
    private String id;
    private String message;
}
