package com.bugstack.domain.activity.service;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;
import com.bugstack.domain.activity.service.trial.factory.DefaultActivityStategyStrategyFactory;
import com.bugstack.types.design.framework.tree.StrategyHandler;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 23:21
 * @Description: TODO
 */
@Service
public class IIndexGroupBuyMarketServiceimpl implements IIndexGroupBuyMarketService {

    @Resource
    private DefaultActivityStategyStrategyFactory activityStategyStrategyFactory;

    @Override
    public TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception {

        StrategyHandler<MarketProductEntity, DefaultActivityStategyStrategyFactory.DynamicContext, TrialBalanceEntity> strategyHandler = activityStategyStrategyFactory.strategyHandler();
        TrialBalanceEntity trialbalanceEntity = strategyHandler.apply(marketProductEntity, new DefaultActivityStategyStrategyFactory.DynamicContext());

        return trialbalanceEntity;
    }
}
