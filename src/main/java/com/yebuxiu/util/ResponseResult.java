package com.yebuxiu.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    private int code;
    private String msg;
    private T data;


}

