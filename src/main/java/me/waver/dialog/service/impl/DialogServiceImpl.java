package me.waver.dialog.service.impl;

import me.waver.dialog.common.exts.DialogExt;
import me.waver.dialog.dao.DialogExtDAO;
import me.waver.dialog.service.DialogService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:07
 */
@Service
public class DialogServiceImpl implements DialogService {
    private final DialogExtDAO dialogExtDAO;

    public DialogServiceImpl(DialogExtDAO dialogExtDAO) {
        this.dialogExtDAO = dialogExtDAO;
    }

    @Override
    public List<DialogExt> getAllByGradeId(String gradeId) {
        return dialogExtDAO.findAllByRefGradeIdOrderByCreatDate(gradeId);
    }
}
