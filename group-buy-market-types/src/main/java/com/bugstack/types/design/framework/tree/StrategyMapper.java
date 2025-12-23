package com.bugstack.types.design.framework.tree;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 22:42
 * @Description: 策略映射器
 */
public interface StrategyMapper<T ,D ,R> {
    StrategyHandler<T,D,R> get(T requestParameter,D dynamicContext);
}
