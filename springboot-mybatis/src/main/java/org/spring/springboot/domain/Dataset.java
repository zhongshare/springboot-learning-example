package org.spring.springboot.domain;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @packageName:
 * @ClassName:DataSet
 * @Description:
 * @Author:wujieqiang
 * @date:2019/11/19 12:36
 */
@Data
public class Dataset {
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    //租户ID
    private Integer datasetId;
    private String name;
    private String description;

    // dataset_type ID   Foreign Key
    private Integer datasetTypeId;

    //数据来源 coremap imp cennavi
    private String source;
    private Integer storage;


    //时间戳
    @JsonFormat(pattern = DEFAULT_DATE_FORMAT, timezone = "GMT+8")
    private Date createTime;

    @JsonFormat(pattern = DEFAULT_DATE_FORMAT, timezone = "GMT+8")
    private Date updateTime;

    // 租户ID
    private String tenantId;

    //存储介质类型
    private Integer volume;

    private String deleteFlag;

    private String userId;

    private String access;

    private String count;
    private String size;

    private List<String> roles;

}
