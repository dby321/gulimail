package com.gulimail.gulimail.order.dao;

import com.gulimail.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author binyu
 * @email 1017834057@qq.com
 * @date 2020-05-14 22:50:18
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
