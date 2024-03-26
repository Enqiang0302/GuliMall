package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Enqiang
 * @email 17685683072@163.com
 * @date 2024-03-26 15:49:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
