package me.waver.dialog.service;

import me.waver.dialog.beans.DialogSentence;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:06
 */
public interface DialogSentenceService {

    /**
     * 根据DialogId获取会话句子列表
     * @param dialogId 会话ID
     * @return List<DialogSentence>
     */
    List<DialogSentence> findAllByRefDetailId(String dialogId);
}
