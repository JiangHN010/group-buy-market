package com.bugstack.domain.trade.adapter.repository;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.trade.model.aggregate.GroupBuyOrderAggregate;
import com.bugstack.domain.trade.model.entity.GroupBuyActivityEntity;
import com.bugstack.domain.trade.model.entity.MarketPayOrderEntity;
import com.bugstack.domain.trade.model.valobj.GroupBuyProgressVO;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/26 15:00
 * @Description: TODO
 */
public interface ITradeRepository {
    MarketPayOrderEntity queryMarketPayOrderEntityByOutTradeNo(String userId, String outTradeNo);

    GroupBuyProgressVO queryGroupBuyProgress(String teamId);

    MarketPayOrderEntity lockMarketPayOrder(GroupBuyOrderAggregate groupBuyOrderAggregate);

    GroupBuyActivityEntity queryGroupBuyActivityEntityByActivityId(Long activityId);

    Integer queryOrderCountByActivityId(Long activityId, String userId);
}
