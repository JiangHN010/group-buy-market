package com.bugstack.domain.activity.service.discount.impl;

import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import com.bugstack.domain.activity.service.discount.AbstractDiscountCalculateservice;
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
@Service("MJ")
public class MJCalculateService extends AbstractDiscountCalculateservice {

    @Override
    protected BigDecimal doCalculate(BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount) {

        String marketExpr = groupBuyDiscount.getMarketExpr();

        String[] split = marketExpr.split(Constants.SPLIT);
        BigDecimal x = new BigDecimal(split[0]);
        BigDecimal y = new BigDecimal(split[1]);

        if(originalPrice.compareTo(x) < 0){
            return originalPrice;
        }

        BigDecimal discountPrice = originalPrice.subtract(y);

        if(discountPrice.compareTo(BigDecimal.ZERO) <= 0){
            return new BigDecimal(0.01);
        }

        return discountPrice;
    }
}
