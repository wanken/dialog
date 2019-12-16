package me.waver.dialog.service;

import me.waver.dialog.beans.DialogWord;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 14:33
 */
public interface DialogWordService {

    /**
     * 根据对话详情获取单词
     *
     * @param detailId 对话详情ID
     * @return List<DialogWord>
     */
    List<DialogWord> findAllByRefDetailId(String detailId);
}
