package com.alinesno.infra.plat.trainer.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("exam")
@TableComment("考试实体类")
public class ExamEntity extends InfraBaseEntity {

    private String examId; // 考试ID
    private String examName; // 考试名称
    private Date startTime; // 考试开始时间
    private Date endTime; // 考试结束时间

}

