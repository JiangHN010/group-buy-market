package com.bugstack.domain.activity.service.trial.node;

import com.alibaba.fastjson2.JSON;
import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;
import com.bugstack.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.bugstack.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.bugstack.types.design.framework.tree.StrategyHandler;
import com.bugstack.types.enums.ResponseCode;
import com.bugstack.types.exception.AppException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/24 16:07
 * @Description: TODO
 */
@Slf4j
@Service
public class ErrorNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

    @Override
    protected TrialBalanceEntity doApply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        log.info("拼团商品查询试算服务-NoMarketNode userId:{} requestParameter:{}", requestParameter.getUserId(), JSON.toJSONString(requestParameter));

        // 无营销配置
        if (null == dynamicContext.getGroupBuyActivityDiscountVO() || null == dynamicContext.getSkuVO()) {
            log.info("商品无拼团营销配置 {}", requestParameter.getGoodsId());
            throw new AppException(ResponseCode.E0002.getCode(), ResponseCode.E0002.getInfo());
        }

        return TrialBalanceEntity.builder().build();
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return defaultStrategyHandler;
    }

}