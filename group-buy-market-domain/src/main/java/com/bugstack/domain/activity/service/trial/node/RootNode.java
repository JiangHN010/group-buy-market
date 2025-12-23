package com.bugstack.domain.activity.service.trial.node;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;
import com.bugstack.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.bugstack.domain.activity.service.trial.factory.DefaultActivityStategyStrategyFactory;
import com.bugstack.types.design.framework.tree.StrategyHandler;
import org.springframework.stereotype.Service;


/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 23:07
 * @Description: TODO
 */
@Service
public class RootNode extends AbstractGroupBuyMarketSupport <MarketProductEntity, DefaultActivityStategyStrategyFactory.DynamicContext,TrialBalanceEntity>{

    private SwitchRoot switchRoot;

    @Override
    public TrialBalanceEntity apply(MarketProductEntity requestParameter, DefaultActivityStategyStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return null;
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStategyStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStategyStrategyFactory.DynamicContext dynamicContext) {
        return switchRoot;
    }
}
