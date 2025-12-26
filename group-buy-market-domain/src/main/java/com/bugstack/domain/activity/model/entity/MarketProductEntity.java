package com.bugstack.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 22:55
 * @Description: TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarketProductEntity {

    private Long  activityId;
    private String userId;
    private String goodsId;
    private String source;
    private String channel;
}
