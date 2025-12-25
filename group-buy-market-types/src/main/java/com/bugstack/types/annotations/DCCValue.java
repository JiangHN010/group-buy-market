package com.bugstack.types.annotations;

import java.lang.annotation.*;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/25 12:42
 * @Description: TODO
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface DCCValue {

    String value() default "";


}
