package com.bugstack.domain.activity.adapter.repository;

import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.bugstack.domain.activity.model.valobj.SCSkuActivityVO;
import com.bugstack.domain.activity.model.valobj.SkuVO;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 11:20
 * @Description: TODO
 */
public interface IActivityRepository {

    GroupBuyActivityDiscountVO queryGroupBuyActivityDiscountVO(Long activityId);

    SkuVO querySkuByGoodsId(String goodsId);

    SCSkuActivityVO querySCSkuActivityBySCGoodsId(String source, String channel, String goodsId);

}
