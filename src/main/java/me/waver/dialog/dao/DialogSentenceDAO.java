package me.waver.dialog.dao;

import me.waver.dialog.beans.DialogSentence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author waver
 * @date 2019/12/8 14:04
 */
public interface DialogSentenceDAO extends JpaRepository<DialogSentence,String>, JpaSpecificationExecutor<DialogSentence> {
}
