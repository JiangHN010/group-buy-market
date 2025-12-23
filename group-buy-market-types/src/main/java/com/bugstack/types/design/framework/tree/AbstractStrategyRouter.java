package com.bugstack.types.design.framework.tree;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 22:48
 * @Description:
 */
public abstract class AbstractStrategyRouter<T,D,R> implements  StrategyMapper<T,D,R>,StrategyHandler<T,D,R> {

    @Getter
    @Setter
    protected StrategyHandler<T,D,R> defaultStrategyHandler = StrategyHandler.DEFAULT;

    public R router(T requestParameter,D dynamicParameter) throws Exception {
        StrategyHandler<T, D, R> tdrStrategyHandler = get(requestParameter, dynamicParameter);
        if(tdrStrategyHandler != null) {
            return tdrStrategyHandler.apply(requestParameter, dynamicParameter);
        }
        return defaultStrategyHandler.apply(requestParameter, dynamicParameter);
    }
}
