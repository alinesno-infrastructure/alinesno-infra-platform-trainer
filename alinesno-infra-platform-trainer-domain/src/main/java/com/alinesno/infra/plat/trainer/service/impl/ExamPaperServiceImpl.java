package com.alinesno.infra.plat.trainer.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.trainer.entity.ExamPaperEntity;
import com.alinesno.infra.plat.trainer.mapper.ExamPaperMapper;
import com.alinesno.infra.plat.trainer.service.IExamPaperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExamPaperServiceImpl extends IBaseServiceImpl<ExamPaperEntity , ExamPaperMapper> implements IExamPaperService {
}
