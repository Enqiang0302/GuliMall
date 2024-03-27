package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Enqiang
 * @date 2024/03/26 21:56
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping(value = "/coupon/coupon/member/memberList", method = RequestMethod.GET)
    public R memberCoupons();
}
