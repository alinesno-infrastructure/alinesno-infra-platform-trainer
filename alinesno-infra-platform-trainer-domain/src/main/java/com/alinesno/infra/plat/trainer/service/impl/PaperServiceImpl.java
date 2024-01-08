package com.alinesno.infra.plat.trainer.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.trainer.entity.PaperEntity;
import com.alinesno.infra.plat.trainer.mapper.PaperMapper;
import com.alinesno.infra.plat.trainer.service.IPaperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaperServiceImpl extends IBaseServiceImpl<PaperEntity , PaperMapper> implements IPaperService {
}
