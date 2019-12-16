package me.waver.dialog.dao;

import me.waver.dialog.common.exts.DialogExt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/9 20:31
 */
public interface DialogExtDAO extends JpaRepository<DialogExt, String>, JpaSpecificationExecutor<DialogExt> {

    /**
     * 根据年级ID查询
     * @param gradeId 年级ID
     * @param parentId 父级ID
     * @return List<DialogExt>
     */
    List<DialogExt> findAllByRefGradeIdAndParentIdOrderByCreatDate(String gradeId, String parentId);

    /**
     * 根据父级ID查询
     * @param dialogId 会话ID
     * @return List<DialogExt>
     */
    List<DialogExt> findAllByParentId(String dialogId);
}
