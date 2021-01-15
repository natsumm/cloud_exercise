package com.bjming.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //状态码, 200成功
    private Integer code;
    //成功或者错误的提示信息
    private String message;
    //与泛型一致的返回数据
    private T data;

    /**
     * 自定义一个带有两个参数的构造方法, 方便使用
     * @param code 状态码
     * @param message 提示信息
     */
    public CommonResult (Integer code, String message){
        this(code,message, null);
    }
}
