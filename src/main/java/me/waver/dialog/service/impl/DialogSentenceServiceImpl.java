package me.waver.dialog.service.impl;

import me.waver.dialog.beans.DialogSentence;
import me.waver.dialog.dao.DialogSentenceDAO;
import me.waver.dialog.service.DialogSentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/8 14:07
 */
@Service
public class DialogSentenceServiceImpl implements DialogSentenceService {
    private final DialogSentenceDAO dialogSentenceDAO;

    public DialogSentenceServiceImpl(DialogSentenceDAO dialogSentenceDAO) {
        this.dialogSentenceDAO = dialogSentenceDAO;
    }

    @Override
    public List<DialogSentence> findAllByRefDetailId(String dialogId) {
        return dialogSentenceDAO.findAllByRefDetailId(dialogId);
    }
}
