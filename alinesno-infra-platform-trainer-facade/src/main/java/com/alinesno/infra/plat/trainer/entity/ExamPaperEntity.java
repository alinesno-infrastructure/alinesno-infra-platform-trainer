package com.alinesno.infra.plat.trainer.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.TableComment;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
@TableName("exam_paper")
@TableComment("考试试卷实体类")
public class ExamPaperEntity extends InfraBaseEntity {

    private String examPaperId; // 考试试卷ID
    private String examId; // 所属考试ID
    private String paperId; // 所属试卷ID

}

