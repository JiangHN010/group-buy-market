package com.bugstack.domain.tag.service;

import javax.annotation.Resource;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/24 14:24
 * @Description: TODO
 */
public interface ITagService {


    void execTagBatchJob(String TagId, String batchId);

}
