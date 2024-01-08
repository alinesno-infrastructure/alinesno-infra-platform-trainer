package com.alinesno.infra.plat.trainer.api.provider;

import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.SuperController;
import com.alinesno.infra.plat.trainer.api.dto.QuestionPaperDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 对外接口服务
 */
@Slf4j
@Controller
@RequestMapping("/api/infra/plat/trainer")
public class TrainerController extends SuperController {

    /**
     * 添加题目信息
     * @return
     */
    @PostMapping("/addQuestion")
    public AjaxResult addQuestion(@RequestBody QuestionPaperDto dto){

        log.debug("question = {}" , dto);

        return ok() ;
    }

}
