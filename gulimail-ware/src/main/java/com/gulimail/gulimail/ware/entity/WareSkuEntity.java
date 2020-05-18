package com.gulimail.gulimail.ware.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品库存
 * 
 * @author binyu
 * @email 1017834057@qq.com
 * @date 2020-05-14 22:53:50
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId(type= IdType.AUTO)
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 仓库id
	 */
	private Long wareId;
	/**
	 * 库存数
	 */
	private Integer stock;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * 锁定库存
	 */
	private Integer stockLocked;

}
