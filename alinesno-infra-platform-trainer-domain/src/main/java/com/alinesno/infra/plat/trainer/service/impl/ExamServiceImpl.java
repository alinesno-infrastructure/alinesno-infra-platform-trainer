package com.alinesno.infra.plat.trainer.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.trainer.entity.ExamEntity;
import com.alinesno.infra.plat.trainer.mapper.ExamMapper;
import com.alinesno.infra.plat.trainer.service.IExamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExamServiceImpl extends IBaseServiceImpl<ExamEntity , ExamMapper> implements IExamService {
}
