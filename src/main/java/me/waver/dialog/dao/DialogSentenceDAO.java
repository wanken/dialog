package me.waver.dialog.dao;

import me.waver.dialog.beans.DialogSentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:04
 */
public interface DialogSentenceDAO extends JpaRepository<DialogSentence,String>, JpaSpecificationExecutor<DialogSentence> {

    /**
     * 根据DialogId获取会话句子列表
     * @param dialogId 会话ID
     * @return List<DialogSentence>
     */
    List<DialogSentence> findAllByRefDetailId(String dialogId);
}
