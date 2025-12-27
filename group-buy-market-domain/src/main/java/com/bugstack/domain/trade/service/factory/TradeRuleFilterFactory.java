package com.bugstack.domain.trade.service.factory;

import com.bugstack.domain.trade.model.entity.GroupBuyActivityEntity;
import com.bugstack.domain.trade.model.entity.TradeRuleCommandEntity;
import com.bugstack.domain.trade.model.entity.TradeRuleFilterBackEntity;
import com.bugstack.domain.trade.service.filter.ActivityUsabilityRuleFilter;
import com.bugstack.domain.trade.service.filter.UserTakeLimitRuleFiliter;
import com.bugstack.types.design.framework.link.model2.LinkArmory;
import com.bugstack.types.design.framework.link.model2.chain.BusinessLinkedList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/26 20:47
 * @Description: TODO
 */
@Slf4j
@Service
public class TradeRuleFilterFactory {


    @Bean("tradeRuleFilter")
    public BusinessLinkedList<TradeRuleCommandEntity,TradeRuleFilterFactory.DynamicContext, TradeRuleFilterBackEntity> tradeRuleFilter(ActivityUsabilityRuleFilter activityUsabilityRuleFilter, UserTakeLimitRuleFiliter userTakeLimitRuleFiliter) {
        LinkArmory<TradeRuleCommandEntity,TradeRuleFilterFactory.DynamicContext, TradeRuleFilterBackEntity> linkArmory
                = new LinkArmory<>("交易规则过滤链",activityUsabilityRuleFilter,userTakeLimitRuleFiliter);


        return linkArmory.getLogicLink();
    }


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DynamicContext{

        private GroupBuyActivityEntity groupBuyActivity;

    }




}
