package me.waver.dialog.controller;

import cn.hutool.core.collection.CollUtil;
import me.waver.dialog.common.entity.Result;
import me.waver.dialog.common.exts.DialogExt;
import me.waver.dialog.service.DialogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/10 19:38
 */
@RestController
@RequestMapping("/dialog")
public class DialogController {
    private final DialogService dialogService;

    public DialogController(DialogService dialogService) {
        this.dialogService = dialogService;
    }

    @GetMapping("/getByGradeId")
    public Result getAllDialog(String gradeId){
        List<DialogExt> dialogExtList = dialogService.getAllByGradeId(gradeId);
        if (CollUtil.isNotEmpty(dialogExtList)) {
            return Result.ok(dialogExtList);
        }
        return Result.fail("没有查询到任何结果");
    }
}
