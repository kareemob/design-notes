package com.qacart.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
