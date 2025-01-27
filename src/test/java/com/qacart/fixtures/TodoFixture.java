package com.qacart.fixtures;


import com.qacart.models.Todo;

public final class TodoFixture {
    private TodoFixture(){}

    public static Todo generateTodo(){
        return Todo.builder()
                .item("Learn RestAssured")
                .isCompleted(false)
                .build();
    }
}
