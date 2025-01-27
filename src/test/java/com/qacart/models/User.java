package com.qacart.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("userID")
    private String userId;
}
