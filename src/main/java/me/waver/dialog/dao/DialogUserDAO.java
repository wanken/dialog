package me.waver.dialog.dao;

import me.waver.dialog.beans.DialogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:05
 */
public interface DialogUserDAO extends JpaRepository<DialogUser,String>, JpaSpecificationExecutor<DialogUser> {

    /**
     * 根据账号密码查询用户
     * @param account 账号
     * @param password 密码
     * @return List<DialogUser>
     */
    List<DialogUser> findAllByAccountAndPassword(String account,String password);
}
