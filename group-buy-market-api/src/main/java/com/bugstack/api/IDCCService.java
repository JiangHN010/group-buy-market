package com.bugstack.api;

import com.bugstack.api.response.Response;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/25 14:10
 * @Description: TODO
 */
public interface IDCCService {
    Response<Boolean> updateConfig(String key, String value);
}
