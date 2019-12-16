package me.waver.dialog.service.impl;

import me.waver.dialog.beans.DialogDetail;
import me.waver.dialog.dao.DialogDetailDAO;
import me.waver.dialog.service.DialogDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 13:38
 */
@Service
public class DialogDetailServiceImpl implements DialogDetailService {
    private final DialogDetailDAO dialogDetailDAO;

    public DialogDetailServiceImpl(DialogDetailDAO dialogDetailDAO) {
        this.dialogDetailDAO = dialogDetailDAO;
    }

    @Override
    public List<DialogDetail> findAllByRefDialogId(String dialogId) {
        return dialogDetailDAO.findAllByRefDialogIdOrderByOrderIndex(dialogId);
    }
}
