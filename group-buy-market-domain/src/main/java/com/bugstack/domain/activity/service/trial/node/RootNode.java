package com.bugstack.domain.activity.service.trial.node;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;
import com.bugstack.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.bugstack.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.bugstack.types.design.framework.tree.StrategyHandler;
import com.bugstack.types.enums.ResponseCode;
import com.bugstack.types.exception.AppException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 23:07
 * @Description: TODO
 */
@Service
public class RootNode extends AbstractGroupBuyMarketSupport <MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext,TrialBalanceEntity>{

    @Resource
    private SwitchRoot switchRoot;

    @Override
    public TrialBalanceEntity doApply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        if (StringUtils.isBlank(requestParameter.getUserId())||
            StringUtils.isBlank(requestParameter.getGoodsId())||
            StringUtils.isBlank(requestParameter.getSource())||
            StringUtils.isBlank(requestParameter.getChannel())) {
            throw new AppException(ResponseCode.ILLEGAL_PARAMETER.getCode(),ResponseCode.ILLEGAL_PARAMETER.getInfo());
        }
        return router(requestParameter, dynamicContext);
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {
        return switchRoot;
    }
}
