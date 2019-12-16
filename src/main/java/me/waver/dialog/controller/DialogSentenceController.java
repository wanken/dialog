package me.waver.dialog.controller;

import cn.hutool.core.collection.CollUtil;
import me.waver.dialog.beans.DialogSentence;
import me.waver.dialog.common.entity.Result;
import me.waver.dialog.service.DialogSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/11 20:39
 */
@RestController
@RequestMapping("/dialogSentence")
public class DialogSentenceController {

    private final DialogSentenceService dialogSentenceService;

    public DialogSentenceController(DialogSentenceService dialogSentenceService) {
        this.dialogSentenceService = dialogSentenceService;
    }

    @GetMapping("getSentenceList")
    public Result getSentenceList(String detailId){
        List<DialogSentence> dialogSentences = dialogSentenceService.findAllByRefDetailId(detailId);
        if (CollUtil.isNotEmpty(dialogSentences)) {
            return Result.ok(dialogSentences);
        }
        return Result.fail("该会话下没有找到任何句子");
    }
}
