package com.gulimail.gulimail.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * spu信息介绍
 * 
 * @author binyu
 * @email 1017834057@qq.com
 * @date 2020-05-13 12:06:06
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品id
	 */
	@TableId(type= IdType.AUTO)
	private Long spuId;
	/**
	 * 商品介绍
	 */
	private String decript;

}
