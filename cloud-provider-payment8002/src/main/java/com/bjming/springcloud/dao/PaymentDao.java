package com.bjming.springcloud.dao;

import com.bjming.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 表Payment对应的 PaymentDao
 * @Mapper 是ibatis提供的注解, 用于创建dao接口的代理对象
 */
@Mapper
public interface PaymentDao {
    /**
     * 创建一条记录
     * @param payment
     * @return int
     */
    public int create(Payment payment);

    /**
     * 根据主键查询记录
     * @param id
     * @return Payment
     */
    public Payment getPaymentById(@Param("id") Long id);
}
