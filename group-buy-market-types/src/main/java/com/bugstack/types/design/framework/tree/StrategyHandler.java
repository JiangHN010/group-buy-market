package com.bugstack.types.design.framework.tree;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 22:43
 * @Description: 策略处理器
 */
public interface StrategyHandler<T,D,R> {

    StrategyHandler DEFAULT = (T,D) -> null;

    R apply(T requestParameter, D dynamicContext) throws Exception;


}
