package com.example.JavaCRUDs.pojos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@ToString
public class UserResponse {
    private Integer statusCode;
    private String statusMessage;
    private Long id;
}
