package org.spring.springboot.service;

import com.alibaba.fastjson.JSONObject;
import org.spring.springboot.domain.Dataset;
import org.spring.springboot.vo.DatasetVo;

import java.util.List;

/**
 * @author zhongxiang
 * @date 2020/4/4 17:04
 */
public interface DatasetService {
    /**
     * 根据输入的userId去获取相关的dataset列表
     *
     * @param userId 用户Id
     * @return dataset列表
     */
    List<Dataset> getDatasets(String userId);

    JSONObject createDataset(DatasetVo datasaetVo);
}
