package me.waver.dialog.beans;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2019/12/9 20:47
 */
@Entity
@Table(name = "dialog_user_dialog")
public class DialogUserDialog {
    private String id;
    private String refUserId;
    private String refDialogId;
    private String createTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ref_user_id")
    public String getRefUserId() {
        return refUserId;
    }

    public void setRefUserId(String refUserId) {
        this.refUserId = refUserId;
    }

    @Basic
    @Column(name = "ref_dialog_id")
    public String getRefDialogId() {
        return refDialogId;
    }

    public void setRefDialogId(String refDialogId) {
        this.refDialogId = refDialogId;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DialogUserDialog that = (DialogUserDialog) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(refUserId, that.refUserId) &&
                Objects.equals(refDialogId, that.refDialogId) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refUserId, refDialogId, createTime);
    }
}
