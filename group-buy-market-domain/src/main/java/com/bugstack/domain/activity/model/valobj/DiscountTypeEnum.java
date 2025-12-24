package com.bugstack.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/23 22:50
 * @Description: TODO
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum DiscountTypeEnum {

    BASE(0,"基础优惠"),
    TAG(1,"人群标签");


    private Integer  code;
    private String  info;

    public static DiscountTypeEnum get(Integer code) {
        switch (code) {
            case 0: return BASE;
            case 1: return TAG;
            default: throw  new RuntimeException("err code!");
        }
    }
}
