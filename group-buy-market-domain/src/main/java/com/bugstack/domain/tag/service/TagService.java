package com.bugstack.domain.tag.service;

import com.bugstack.domain.tag.adapter.repository.ITagRepository;
import com.bugstack.domain.tag.model.entity.CrowdTagsJobEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/24 14:25
 * @Description: TODO
 */
@Service
public class TagService implements ITagService {

    @Resource
    private ITagRepository tagRepository;

    @Override
    public void execTagBatchJob(String tagId, String batchId) {
        //1.查询任务
        CrowdTagsJobEntity crowdTagsJobEntity = tagRepository.queryCrowdTagsJobEntity(tagId,batchId);

        //2. 采集用户数据

        List<String> userIdList = new ArrayList<String>(){
            {   add("xiaofuge");
                add("liergou");
            }};

        for (String userId : userIdList) {
            tagRepository.addCrowdTagsUserId(tagId,userId);
        }

        // 3. 更新人群标签统计量
        tagRepository.updateCrowdTagsStatistics(tagId,userIdList.size());
    }
}
