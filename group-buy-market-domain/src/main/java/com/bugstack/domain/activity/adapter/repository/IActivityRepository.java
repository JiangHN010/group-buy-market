package com.bugstack.domain.activity.adapter.repository;

import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.bugstack.domain.activity.model.valobj.SkuVO;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 11:20
 * @Description: TODO
 */
public interface IActivityRepository {

    GroupBuyActivityDiscountVO groupBuyActivityDiscountVO(String source ,String channel);

    SkuVO querySkuByGoodsId(String skuId);
}
