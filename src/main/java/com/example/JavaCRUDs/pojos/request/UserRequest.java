package com.example.JavaCRUDs.pojos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
public class UserRequest {
    private String firstName;
    private String lastName;
    private Long age;
}
