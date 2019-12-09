package me.waver.dialog.service;

import me.waver.dialog.common.exts.DialogExt;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:06
 */
public interface DialogService {

    /**
     * 根据年级
     * @param gradeId 年级ID
     * @return List<DialogExt>
     */
    List<DialogExt> getAllByGradeId(String gradeId);
}
