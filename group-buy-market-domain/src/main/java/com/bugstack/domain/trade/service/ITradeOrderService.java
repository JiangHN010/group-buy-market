package com.bugstack.domain.trade.service;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.trade.model.entity.MarketPayOrderEntity;
import com.bugstack.domain.trade.model.entity.PayActivityEntity;
import com.bugstack.domain.trade.model.entity.PayDiscountEntity;
import com.bugstack.domain.trade.model.entity.UserEntity;
import com.bugstack.domain.trade.model.valobj.GroupBuyProgressVO;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/25 22:28
 * @Description: TODO
 */
















public interface ITradeOrderService {

    MarketPayOrderEntity queryNoPayMarketPayOrderByOutTradeNo(String userId,String outTradeNo);

    GroupBuyProgressVO queryGroupBuyProgress(String teamId);

    MarketPayOrderEntity lockMarketPayOrder(UserEntity userEntity, PayActivityEntity payActivityEntity, PayDiscountEntity payDiscountEntity);


}
