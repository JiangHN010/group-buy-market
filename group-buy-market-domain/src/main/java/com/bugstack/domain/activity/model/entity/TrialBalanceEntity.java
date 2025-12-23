package com.bugstack.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 22:57
 * @Description: TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TrialBalanceEntity {

    private String goodsId;
    private String goodsName;
    private BigDecimal originalPrice;
    private BigDecimal deductionprice;
    private Integer targetCount;
    private Date startTime;
    private Date endTime;
    private boolean isVisible;
    private boolean isEnable;
}
