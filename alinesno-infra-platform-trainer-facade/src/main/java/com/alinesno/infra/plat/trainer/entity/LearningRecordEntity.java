package com.alinesno.infra.plat.trainer.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;


@EqualsAndHashCode(callSuper = true)
@Data
@TableName("learning_record")
@TableComment("学习记录实体类")
public class LearningRecordEntity extends InfraBaseEntity {

    private String recordId; // 学习记录ID
    private String studentId; // 学生ID
    private String contentId; // 内容ID
    private Date startTime; // 学习开始时间
    private Date endTime; // 学习结束时间

}
