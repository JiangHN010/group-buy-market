package com.bugstack.domain.activity.service.trial.thread;

import com.bugstack.domain.activity.adapter.repository.IActivityRepository;
import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.bugstack.domain.activity.model.valobj.SkuVO;

import java.util.concurrent.Callable;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 13:01
 * @Description: TODO
 */
public class QuerySkuVOFromDBThreadTask implements Callable<SkuVO> {

    private final String goodsId;

    private final IActivityRepository activityRepository;

    public QuerySkuVOFromDBThreadTask(String goodsId, IActivityRepository activityRepository) {
        this.goodsId = goodsId;
        this.activityRepository = activityRepository;
    }


    //查询商品
    @Override
    public SkuVO call() throws Exception {
        return activityRepository.querySkuByGoodsId(goodsId);
    }
}
