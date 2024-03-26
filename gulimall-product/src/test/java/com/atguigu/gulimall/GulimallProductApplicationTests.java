package com.atguigu.gulimall;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setDescript("爱国者品牌");
//        brandEntity.setBrandId(1L);
//        System.out.println("-----------TESTTESTESTESTESTEST::::::::"+brandService.updateById(brandEntity));

//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");

        brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L)).forEach(x-> System.out.println(x));

    }

}
