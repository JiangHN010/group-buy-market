package com.bugstack.domain.activity.service.discount.impl;

import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.bugstack.domain.activity.service.discount.AbstractDiscountCalculateService;
import com.bugstack.types.common.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 23:07
 * @Description: TODO
 */
@Slf4j
@Service("N")
public class NCalculateService extends AbstractDiscountCalculateService {

    @Override
    protected BigDecimal doCalculate(BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount) {

        String marketExpr = groupBuyDiscount.getMarketExpr();



        return new BigDecimal(marketExpr);
    }
}
