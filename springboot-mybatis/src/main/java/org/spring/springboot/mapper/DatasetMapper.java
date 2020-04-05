package org.spring.springboot.mapper;

import org.spring.springboot.domain.Dataset;
import org.spring.springboot.vo.DatasetVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * dataset的Mapper类
 */
@Repository
public interface DatasetMapper {
    List<Dataset> getDatasetsByUser(String userId);

    void createDataset(DatasetVo datasaetVo);
}
