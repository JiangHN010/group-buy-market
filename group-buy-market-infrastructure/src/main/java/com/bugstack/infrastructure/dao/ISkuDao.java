package com.bugstack.infrastructure.dao;

import com.bugstack.infrastructure.dao.po.Sku;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 12:17
 * @Description: TODO
 */
@Mapper
public interface ISkuDao {

    Sku querySkuByGoodsId(String goodsId);
}
