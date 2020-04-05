package org.spring.springboot.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.spring.springboot.domain.Dataset;
import org.spring.springboot.mapper.DatasetMapper;
import org.spring.springboot.service.DatasetService;
import org.spring.springboot.vo.DatasetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 获取dataset列表的业务逻辑实现类
 *
 * @author zhongxiang
 * @date 2020/4/4 17:05
 */
@Service
public class DatasetServiceImpl implements DatasetService {

    @Autowired
    DatasetMapper datasetMapper;

    @Override
    public List<Dataset> getDatasets(String userId) {
        List<Dataset> datasets = datasetMapper.getDatasetsByUser(userId);
        return datasets;
    }

    @Override
    public JSONObject createDataset(DatasetVo datasaetVo) {
        datasetMapper.createDataset(datasaetVo);
        return null;
    }
}
