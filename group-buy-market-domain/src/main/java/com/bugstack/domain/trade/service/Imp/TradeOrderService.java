package com.bugstack.domain.trade.service.Imp;

import com.bugstack.domain.trade.adapter.repository.ITradeRepository;
import com.bugstack.domain.trade.model.aggregate.GroupBuyOrderAggregate;
import com.bugstack.domain.trade.model.entity.MarketPayOrderEntity;
import com.bugstack.domain.trade.model.entity.PayActivityEntity;
import com.bugstack.domain.trade.model.entity.PayDiscountEntity;
import com.bugstack.domain.trade.model.entity.UserEntity;
import com.bugstack.domain.trade.model.valobj.GroupBuyProgressVO;
import com.bugstack.domain.trade.service.ITradeOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/26 14:59
 * @Description: TODO
 */
@Service
public class TradeOrderService implements ITradeOrderService {

    @Resource
    private ITradeRepository tradeRepository;

    @Override
    public MarketPayOrderEntity queryNoPayMarketPayOrderByOutTradeNo(String userId, String outTradeNo) {
        return tradeRepository.queryMarketPayOrderEntityByOutTradeNo(userId,outTradeNo);
    }

    @Override
    public GroupBuyProgressVO queryGroupBuyProgress(String teamId) {
        return tradeRepository.queryGroupBuyProgress(teamId);
    }

    @Override
    public MarketPayOrderEntity lockMarketPayOrder(UserEntity userEntity, PayActivityEntity payActivityEntity, PayDiscountEntity payDiscountEntity) {

        GroupBuyOrderAggregate groupBuyOrderAggregate = GroupBuyOrderAggregate.builder()
                .userEntity(userEntity)
                .payActivityEntity(payActivityEntity)
                .payDiscountEntity(payDiscountEntity)
                .build();

        return tradeRepository.lockMarketPayOrder(groupBuyOrderAggregate);
    }


}
