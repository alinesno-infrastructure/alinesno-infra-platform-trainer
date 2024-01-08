package com.alinesno.infra.plat.trainer.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("content")
@TableComment("内容实体类")
public class ContentEntity extends InfraBaseEntity {

    private String contentId; // 内容ID
    private String contentType; // 内容类型
    private String content; // 内容

}