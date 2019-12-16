package me.waver.dialog.controller;

import cn.hutool.core.collection.CollUtil;
import me.waver.dialog.beans.DialogDetail;
import me.waver.dialog.beans.DialogSentence;
import me.waver.dialog.beans.DialogWord;
import me.waver.dialog.common.entity.Result;
import me.waver.dialog.common.exts.DialogDetailExt;
import me.waver.dialog.service.DialogDetailService;
import me.waver.dialog.service.DialogSentenceService;
import me.waver.dialog.service.DialogWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 13:40
 */
@RestController
@RequestMapping("/dialogDetail")
public class DialogDetailController {

    private final DialogDetailService dialogDetailService;
    private final DialogSentenceService dialogSentenceService;
    private final DialogWordService dialogWordService;

    public DialogDetailController(DialogDetailService dialogDetailService, DialogSentenceService dialogSentenceService, DialogWordService dialogWordService) {
        this.dialogDetailService = dialogDetailService;
        this.dialogSentenceService = dialogSentenceService;
        this.dialogWordService = dialogWordService;
    }

    @GetMapping("getDetailsByDialog")
    public Result getDetailsByDialog(String dialogId) {
        List<DialogDetail> dialogDetailList = dialogDetailService.findAllByRefDialogId(dialogId);
        if (CollUtil.isNotEmpty(dialogDetailList)) {
            List<DialogDetailExt> dialogDetailExtList = new ArrayList<>(dialogDetailList.size());
            dialogDetailList.forEach(dialogDetail -> {
                List<DialogSentence> sentenceList = dialogSentenceService.findAllByRefDetailId(dialogDetail.getId());
                List<DialogWord> wordList = dialogWordService.findAllByRefDetailId(dialogDetail.getId());
                DialogDetailExt dialogDetailExt = DialogDetailExt.getInstance(dialogDetail, sentenceList, wordList);
                dialogDetailExtList.add(dialogDetailExt);
            });
            return Result.ok("查询成功", dialogDetailExtList);
        }
        return Result.fail("没有查询到结果");
    }
}
