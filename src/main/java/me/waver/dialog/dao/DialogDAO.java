package me.waver.dialog.dao;

import me.waver.dialog.beans.Dialog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author waver
 * @date 2019/12/8 13:53
 */
public interface DialogDAO extends JpaRepository<Dialog, String> , JpaSpecificationExecutor<Dialog> {

}
