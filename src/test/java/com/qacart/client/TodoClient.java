package com.qacart.client;


import com.qacart.models.Todo;
import io.restassured.response.Response;

public final class TodoClient {
    private TodoClient(){}

    public static Response addTask(String token, Todo todo){

        return
                BaseClient.getAuthRequestSpec(token)
                        .body(todo)
                        .when()
                        .post("/tasks");
    }

    public static Response deleteTask(String token, String taskId){
        return
                BaseClient.getAuthRequestSpec(token)
                        .when().delete("/tasks/" + taskId);
    }
}
