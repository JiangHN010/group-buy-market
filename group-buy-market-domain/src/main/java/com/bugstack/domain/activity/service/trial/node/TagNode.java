package com.bugstack.domain.activity.service.trial.node;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;
import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.bugstack.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.bugstack.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.bugstack.types.design.framework.tree.StrategyHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/25 10:02
 * @Description: 人群标签节点处理
 */

@Slf4j
@Service
public class TagNode extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {

    @Resource
    private EndNode endNode;

    @Override
    protected TrialBalanceEntity doApply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {

        GroupBuyActivityDiscountVO groupBuyActivityDiscountVO = dynamicContext.getGroupBuyActivityDiscountVO();

        String tagId = groupBuyActivityDiscountVO.getTagId();
        boolean visble = groupBuyActivityDiscountVO.isVisble();
        boolean enabled = groupBuyActivityDiscountVO.isEnabled();

        if (StringUtils.isBlank(tagId)) {
            dynamicContext.setEnable(true);
            dynamicContext.setVisible(true);
            return router(requestParameter, dynamicContext);
        }
        boolean isWithin = activityRepository.isTagCrowRange(tagId,requestParameter.getUserId());
        dynamicContext.setEnable(enabled || isWithin);
        dynamicContext.setVisible(visble || isWithin);
        return router(requestParameter, dynamicContext);
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return endNode;
    }
}
