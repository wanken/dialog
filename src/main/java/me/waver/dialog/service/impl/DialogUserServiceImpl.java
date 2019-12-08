package me.waver.dialog.service.impl;

import cn.hutool.core.collection.CollUtil;
import me.waver.dialog.beans.DialogUser;
import me.waver.dialog.dao.DialogUserDAO;
import me.waver.dialog.service.DialogUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:08
 */
@Service
public class DialogUserServiceImpl implements DialogUserService {
    private final DialogUserDAO dialogUserDAO;

    public DialogUserServiceImpl(DialogUserDAO dialogUserDAO) {
        this.dialogUserDAO = dialogUserDAO;
    }

    @Override
    public DialogUser findAllByAccountAndPassword(String account, String password) {
        List<DialogUser> users = dialogUserDAO.findAllByAccountAndPassword(account, password);
        if (CollUtil.isNotEmpty(users)&& users.size() == 1) {
            return users.get(0);
        }
        return null;

    }
}
