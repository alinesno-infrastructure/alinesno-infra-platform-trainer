package com.alinesno.infra.plat.trainer.api.dto;

import com.alinesno.infra.plat.trainer.entity.QuestionEntity;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 请求的实体类对象
 */
@ToString
@Data
public class QuestionPaperDto {

    // 试卷基础信息
    private String title ;
    private String desc ;
    private String author ;

    // 试卷题目信息
    private List<QuestionEntity> questionEntities ;

}
