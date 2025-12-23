package com.bugstack.domain.activity.service.trial.factory;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;
import com.bugstack.domain.activity.service.trial.node.RootNode;
import com.bugstack.types.design.framework.tree.StrategyHandler;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 23:05
 * @Description: TODO
 */
@Service
public class DefaultActivityStategyStrategyFactory {

    private final RootNode rootNode;

    public DefaultActivityStategyStrategyFactory(RootNode rootNode) {
        this.rootNode = rootNode;
    }

    public StrategyHandler<MarketProductEntity, DefaultActivityStategyStrategyFactory.DynamicContext, TrialBalanceEntity> strategyHandler() {
        return rootNode;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DynamicContext{

    }

}
