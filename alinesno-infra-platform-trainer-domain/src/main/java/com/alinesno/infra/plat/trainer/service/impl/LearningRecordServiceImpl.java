package com.alinesno.infra.plat.trainer.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.trainer.entity.LearningRecordEntity;
import com.alinesno.infra.plat.trainer.mapper.LearningRecordMapper;
import com.alinesno.infra.plat.trainer.service.ILearningRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LearningRecordServiceImpl extends IBaseServiceImpl<LearningRecordEntity , LearningRecordMapper> implements ILearningRecordService {
}
