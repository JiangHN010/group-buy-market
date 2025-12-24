package com.bugstack.domain.activity.service.discount;

import com.bugstack.domain.activity.model.valobj.DiscountTypeEnum;
import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.math.BigDecimal;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 22:59
 * @Description: TODO
 */
public abstract class AbstractDiscountCalculateservice implements IDiscountCalculateService{
    @Override
    public BigDecimal calculate(String userId, BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount) {

        if(DiscountTypeEnum.TAG.equals(groupBuyDiscount.getDiscountType())){
            boolean isCrowdRange = filterTagId(userId, groupBuyDiscount.getTagId());
            if(!isCrowdRange){
                return originalPrice;
            }
        }

        return doCalculate(originalPrice,groupBuyDiscount);
    }


    private boolean filterTagId(String userId, String tagId) {
        return true;
    }


    protected abstract BigDecimal doCalculate(BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount) ;
}
