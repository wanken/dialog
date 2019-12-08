package me.waver.dialog.service;

import me.waver.dialog.beans.DialogUser;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:06
 */
public interface DialogUserService {

    /**
     * 根据账号密码查询用户
     * @param account 账号
     * @param password 密码
     * @return List<DialogUser>
     */
    DialogUser findAllByAccountAndPassword(String account, String password);
}
