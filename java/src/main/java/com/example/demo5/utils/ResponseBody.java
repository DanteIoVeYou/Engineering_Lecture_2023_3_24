package com.example.demo5.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBody<T> {
    private Integer status;
    private String message;
    private T data;
}
