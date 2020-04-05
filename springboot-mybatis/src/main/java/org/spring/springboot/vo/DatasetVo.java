package org.spring.springboot.vo;

import lombok.Data;

/**
 * @author zhongxiang
 * @date 2020/4/4 18:20
 */
@Data
public class DatasetVo {
    /**
     * 数据集名称
     */
    private String name;
    /**
     * 数据集描述
     */
    private String description;
    /**
     * 用户id
     */
    private String userId;
    /**
     * datasetId
     */
    private Integer datasetId;
}
