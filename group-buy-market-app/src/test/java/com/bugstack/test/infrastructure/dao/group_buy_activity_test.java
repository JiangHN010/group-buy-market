package com.bugstack.test.infrastructure.dao;

import com.bugstack.infrastructure.dao.IGroupBuyActivityDao;
import com.bugstack.infrastructure.dao.po.GroupBuyActivity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/21 21:25
 * @Description: TODO
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class group_buy_activity_test {
    @Resource
    private IGroupBuyActivityDao iGroupBuyActivityDao;

    @Test
    public void test() {
        List<GroupBuyActivity> groupBuyActivityList = iGroupBuyActivityDao.queryGroupBuyActivityList();
        log.info("测试结果：{}",groupBuyActivityList.toString());
    }
}
