package me.waver.dialog.dao;

import me.waver.dialog.beans.DialogWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 14:31
 */
public interface DialogWordDAO extends JpaRepository<DialogWord, String>, JpaSpecificationExecutor<DialogWord> {

    /**
     * 根据对话详情获取单词
     * @param detailId 对话详情ID
     * @return List<DialogWord>
     */
    List<DialogWord> findAllByRefDetailId(String detailId);
}
