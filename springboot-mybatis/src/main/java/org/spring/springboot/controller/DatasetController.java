package org.spring.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import org.spring.springboot.domain.Dataset;
import org.spring.springboot.service.DatasetService;
import org.spring.springboot.vo.DatasetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhongxiang
 * @date 2020/4/4 16:25
 */
@RestController
public class DatasetController {
    @Autowired
    DatasetService datasetService;

    /**
     * 获取指定用户的dataset列表
     *
     * @param userId 用户id
     * @return
     */
    @GetMapping(value = "/datasets")
    public JSONObject getDatasetList(@RequestParam(name = "userId", required = false) String userId) {
        /**
         * 根据传入的userId，去dataset表中查询符合条件的dataset并返回
         */
        Assert.notNull(userId, "userId不能为空");
        List<Dataset> datasets = datasetService.getDatasets(userId);
        String msg = "查询成功";
        JSONObject response = new JSONObject();
        response.put("msg", msg);
        response.put("data", datasets);
        return response;
    }

    /**
     * 创建一个dataset
     *
     * @param datasetVo dataset的详情
     */
    @PostMapping(value = "/datasets")
    public DatasetVo createDataset(@RequestBody DatasetVo datasetVo) {
        /**
         * 根据传入的dataset详细信息，创建一个dataset
         */
        datasetService.createDataset(datasetVo);
        return datasetVo;
    }


}
