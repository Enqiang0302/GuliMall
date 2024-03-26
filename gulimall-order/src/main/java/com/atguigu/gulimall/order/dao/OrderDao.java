package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Enqiang
 * @email 17685683072@163.com
 * @date 2024-03-26 16:17:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
