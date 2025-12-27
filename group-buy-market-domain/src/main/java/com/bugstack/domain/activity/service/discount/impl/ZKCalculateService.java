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
@Service("ZK")
public class ZKCalculateService extends AbstractDiscountCalculateService{

    @Override
    protected BigDecimal doCalculate(BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount) {

        String marketExpr = groupBuyDiscount.getMarketExpr();

        BigDecimal discountPrice = originalPrice.multiply(new BigDecimal(marketExpr));

        if(discountPrice.compareTo(BigDecimal.ZERO) <= 0){
            return new BigDecimal(0.01);
        }

        return discountPrice;
    }
}
