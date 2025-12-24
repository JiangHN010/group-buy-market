package com.bugstack.domain.activity.service.trial;

import com.bugstack.domain.activity.adapter.repository.IActivityRepository;
import com.bugstack.types.design.framework.tree.AbstractMultiThreadStrategyRouter;
import com.bugstack.types.design.framework.tree.AbstractStrategyRouter;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 23:01
 * @Description: TODO
 */
public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity,DynamicContext,TrialBalanceEntity> extends AbstractMultiThreadStrategyRouter<MarketProductEntity,DynamicContext,TrialBalanceEntity> {

    protected long timeout = 500;

    @Resource
    protected IActivityRepository activityRepository;

    @Override
    protected void mutiThrad(MarketProductEntity requestParameter, DynamicContext dynamicContext) throws ExecutionException, InterruptedException, TimeoutException {

    }
}
