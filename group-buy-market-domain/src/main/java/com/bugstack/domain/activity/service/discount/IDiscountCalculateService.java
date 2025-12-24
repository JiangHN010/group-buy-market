package com.bugstack.domain.activity.service.discount;

import com.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.math.BigDecimal;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 22:47
 * @Description: 优惠类型接口
 */
public interface IDiscountCalculateService {

    BigDecimal calculate(String userId, BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount);
}
