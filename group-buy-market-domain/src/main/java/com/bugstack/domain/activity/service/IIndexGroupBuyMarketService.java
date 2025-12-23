package com.bugstack.domain.activity.service;

import com.bugstack.domain.activity.model.entity.MarketProductEntity;
import com.bugstack.domain.activity.model.entity.TrialBalanceEntity;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 23:19
 * @Description: TODO
 */
public interface IIndexGroupBuyMarketService {

    TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProduct) throws Exception;
}
