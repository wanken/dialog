package me.waver.dialog.controller;

import me.waver.dialog.beans.DialogUser;
import me.waver.dialog.common.entity.Result;
import me.waver.dialog.service.DialogUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author waver
 * @date 2019/12/8 14:20
 */
@RestController
@RequestMapping("/user")
public class DialogUserController {
    private final DialogUserService dialogUserService;

    public DialogUserController(DialogUserService dialogUserService) {
        this.dialogUserService = dialogUserService;
    }

    @PostMapping("/login")
    private Result login(String account, String password){
        DialogUser user = dialogUserService.findAllByAccountAndPassword(account, password);
        if (user!= null) {
            return Result.ok("登录成功",user);
        }
        return Result.fail("登录失败,请检查用户名和密码是否正确!");
    }
}
