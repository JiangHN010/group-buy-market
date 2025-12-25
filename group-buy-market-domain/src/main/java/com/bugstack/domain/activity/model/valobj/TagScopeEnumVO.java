package com.bugstack.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/25 10:19
 * @Description: TODO
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum TagScopeEnumVO {

    VISIBLE(true,false,"是否可看见拼团"),
    ENABLED(true,false,"是否可参与拼团"),
    ;

    private Boolean allow;
    private Boolean refuse;
    private String desc;
}
