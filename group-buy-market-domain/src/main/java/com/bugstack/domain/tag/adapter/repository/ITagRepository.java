package com.bugstack.domain.tag.adapter.repository;

import com.bugstack.domain.tag.model.entity.CrowdTagsJobEntity;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/24 14:26
 * @Description: TODO
 */
public interface ITagRepository {

    void updateCrowdTagsStatistics(String tagId, int size);

    void addCrowdTagsUserId(String tagId, String userId);

    CrowdTagsJobEntity queryCrowdTagsJobEntity(String tagId, String batchId);
}
