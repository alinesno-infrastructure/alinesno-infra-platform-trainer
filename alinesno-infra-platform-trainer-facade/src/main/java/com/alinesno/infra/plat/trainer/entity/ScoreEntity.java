package com.alinesno.infra.plat.trainer.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
@TableName("score")
@TableComment("考试评分库")
public class ScoreEntity extends InfraBaseEntity {

    private String scoreId; // 分数ID
    private String examId; // 所属考试ID
    private String studentId; // 学生ID
    private long score; // 分数

}