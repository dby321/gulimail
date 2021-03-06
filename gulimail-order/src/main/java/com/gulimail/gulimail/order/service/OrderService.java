package com.gulimail.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gulimail.common.utils.PageUtils;
import com.gulimail.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author binyu
 * @email 1017834057@qq.com
 * @date 2020-05-14 22:50:18
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

