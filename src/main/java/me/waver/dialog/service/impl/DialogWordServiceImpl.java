package me.waver.dialog.service.impl;

import me.waver.dialog.beans.DialogWord;
import me.waver.dialog.dao.DialogWordDAO;
import me.waver.dialog.service.DialogWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 14:34
 */
@Service
public class DialogWordServiceImpl implements DialogWordService {

    private final DialogWordDAO dialogWordDAO;

    public DialogWordServiceImpl(DialogWordDAO dialogWordDAO) {
        this.dialogWordDAO = dialogWordDAO;
    }

    @Override
    public List<DialogWord> findAllByRefDetailId(String detailId) {
        return dialogWordDAO.findAllByRefDetailId(detailId);
    }
}
