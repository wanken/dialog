package me.waver.dialog.dao;

import me.waver.dialog.beans.DialogDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 13:35
 */
public interface DialogDetailDAO extends JpaRepository<DialogDetail, String>, JpaSpecificationExecutor<DialogDetail> {

    /**
     * 根据DialogId 查询对话详情
     * @param dialogId 对话ID
     * @return List<DialogDetail>
     */
    List<DialogDetail> findAllByRefDialogIdOrderByOrderIndex(String dialogId);
}
