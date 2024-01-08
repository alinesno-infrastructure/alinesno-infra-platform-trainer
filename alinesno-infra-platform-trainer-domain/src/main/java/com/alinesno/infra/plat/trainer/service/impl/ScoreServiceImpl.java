package com.alinesno.infra.plat.trainer.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.trainer.entity.ScoreEntity;
import com.alinesno.infra.plat.trainer.mapper.ScoreMapper;
import com.alinesno.infra.plat.trainer.service.IScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ScoreServiceImpl extends IBaseServiceImpl<ScoreEntity , ScoreMapper> implements IScoreService {
}
