package com.fetch.skilltest.entities;

import lombok.Data;

@Data
public class ApiResponse<T> {

    private int status;
    private String message;
    private T data;

    public ApiResponse(){
        status = 200;
    }
}
