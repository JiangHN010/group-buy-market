package com.bugstack.infrastructure.dao;

import com.bugstack.infrastructure.dao.po.SCSkuActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/24 16:05
 * @Description: TODO
 */
@Mapper
public interface ISCSkuActivityDao {

    SCSkuActivity querySCSkuActivityBySCGoodsId(SCSkuActivity scSkuActivity);

}