package com.bjming.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Data setter, getter, toString, hash, equals, 会生成一个有参数的构造方法, 需要显式的创建无参构造方法
 * @AllArgsConstructor 全参数构造方法
 * @NoArgsConstructor 无参数构造方法
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = -8199756258935027503L;
    private Long id;
    private String serial;

}
