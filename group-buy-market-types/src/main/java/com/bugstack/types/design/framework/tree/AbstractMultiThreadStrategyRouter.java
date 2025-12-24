package com.bugstack.types.design.framework.tree;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 10:55
 * @Description: TODO
 */
public abstract class AbstractMultiThreadStrategyRouter <T,D,R>implements  StrategyMapper<T,D,R>,StrategyHandler<T,D,R>{
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

    @Override
    public R apply(T requestParameter, D dynamicContext) throws Exception {

        mutiThrad(requestParameter,dynamicContext);

        return doApply(requestParameter,dynamicContext);
    }

    protected abstract void mutiThrad(T requestParameter, D dynamicContext) throws ExecutionException, InterruptedException, TimeoutException;

    protected abstract R doApply(T requestParameter, D dynamicContext) throws Exception;


}
