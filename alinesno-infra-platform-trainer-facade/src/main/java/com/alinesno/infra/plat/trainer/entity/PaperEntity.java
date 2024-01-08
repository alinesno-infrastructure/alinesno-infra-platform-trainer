package com.alinesno.infra.plat.trainer.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("paper")
@TableComment("试卷实体类")
public class PaperEntity extends InfraBaseEntity {

    private String paperId; // 试卷ID
    private String paperName; // 试卷名称
    private Date createTime; // 创建时间
    private Date updateTime; // 更新时间

}


