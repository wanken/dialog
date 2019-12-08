package me.waver.dialog.dao;

import me.waver.dialog.beans.DialogDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author waver
 * @date 2019/12/8 14:03
 */
public interface DialogDetailDAO extends JpaRepository<DialogDetail,String>, JpaSpecificationExecutor<DialogDetail> {
}
