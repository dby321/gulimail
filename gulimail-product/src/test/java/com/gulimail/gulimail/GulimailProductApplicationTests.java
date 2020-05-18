package com.gulimail.gulimail;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulimail.gulimail.product.entity.BrandEntity;
import com.gulimail.gulimail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity ();
//        brandEntity.setDescript ( "测试" );
//        brandEntity.setName ( "测试品牌" );
//        brandService.save ( brandEntity );
//        System.out.println ("保存成功");

//        brandEntity.setBrandId ( 1L );
//        brandEntity.setDescript ("描述");
//        brandService.updateById ( brandEntity );

        List<BrandEntity> list = brandService.list ( new QueryWrapper<BrandEntity> ().eq ( "brand_id", 1L )) ;
        list.forEach ( (item)->{
            System.out.println (item);
        });

    }

}
