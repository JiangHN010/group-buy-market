package com.bugstack.domain.activity.service.trial.thread;

import com.bugstack.domain.activity.adapter.repository.IActivityRepository;
import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.util.concurrent.Callable;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 13:01
 * @Description: TODO
 */
public class QueryGroupBuyActivityDiscountVOThreadTask implements Callable<GroupBuyActivityDiscountVO> {

    private String source;

    private String chanel;

    private IActivityRepository repository;

    public QueryGroupBuyActivityDiscountVOThreadTask(String source, String chanel, IActivityRepository repository) {
        this.source = source;
        this.chanel = chanel;
        this.repository = repository;
    }

    @Override
    public GroupBuyActivityDiscountVO call() throws Exception {

        return repository.groupBuyActivityDiscountVO(source, chanel);
    }
}
