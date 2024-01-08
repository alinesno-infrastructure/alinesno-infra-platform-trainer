package com.alinesno.infra.plat.trainer.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("question")
@TableComment("题目试题库")
public class QuestionEntity extends InfraBaseEntity {

    private String questionId; // 题目ID
    private String questionContent; // 题目内容
    private String questionType; // 题目类型
    private String paperId; // 所属试卷ID

}