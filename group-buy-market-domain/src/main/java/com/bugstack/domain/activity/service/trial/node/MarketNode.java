package com.bugstack.domain.activity.service.trial.node;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;
import com.bugstack.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.bugstack.domain.activity.service.trial.factory.DefaultActivityStategyStrategyFactory;
import com.bugstack.types.design.framework.tree.StrategyHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 23:17
 * @Description: TODO
 */

@Slf4j
@Service
public class MarketNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStategyStrategyFactory.DynamicContext, TrialBalanceEntity> {
    @Override
    public TrialBalanceEntity apply(MarketProductEntity requestParameter, DefaultActivityStategyStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStategyStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStategyStrategyFactory.DynamicContext dynamicContext) {
        return null;
    }
}
