package me.waver.dialog.controller;

import cn.hutool.core.collection.CollUtil;
import me.waver.dialog.beans.DialogSentence;
import me.waver.dialog.common.entity.Result;
import me.waver.dialog.service.DialogSentenceService;
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

    @GetMapping("/getSentencesByDialogId")
    public Result getSentencesByDialogId(String dialogId) {
        List<DialogSentence> sentenceList = dialogSentenceService.findAllDialogSentenceByRefDialogId(dialogId);
        if (CollUtil.isNotEmpty(sentenceList)) {
            return Result.ok("查询成功", sentenceList);
        }
        return Result.fail("没有找到任何内容");
    }

}
