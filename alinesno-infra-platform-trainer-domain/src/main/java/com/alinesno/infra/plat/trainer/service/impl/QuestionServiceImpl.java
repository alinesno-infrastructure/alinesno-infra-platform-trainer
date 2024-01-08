package com.alinesno.infra.plat.trainer.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.trainer.entity.QuestionEntity;
import com.alinesno.infra.plat.trainer.mapper.QuestionMapper;
import com.alinesno.infra.plat.trainer.service.IQuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class QuestionServiceImpl extends IBaseServiceImpl<QuestionEntity , QuestionMapper> implements IQuestionService {
}
