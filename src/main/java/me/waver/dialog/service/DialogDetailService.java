package me.waver.dialog.service;

import me.waver.dialog.beans.DialogDetail;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 13:37
 */
public interface DialogDetailService {

    /**
     * 根据DialogId 查询对话详情
     * @param dialogId 对话ID
     * @return List<DialogDetail>
     */
    List<DialogDetail> findAllByRefDialogId(String dialogId);
}
