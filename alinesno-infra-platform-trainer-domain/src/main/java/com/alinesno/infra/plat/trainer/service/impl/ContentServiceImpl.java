package com.alinesno.infra.plat.trainer.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.trainer.entity.ContentEntity;
import com.alinesno.infra.plat.trainer.mapper.ContentMapper;
import com.alinesno.infra.plat.trainer.service.IContentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContentServiceImpl extends IBaseServiceImpl<ContentEntity , ContentMapper> implements IContentService {
}
