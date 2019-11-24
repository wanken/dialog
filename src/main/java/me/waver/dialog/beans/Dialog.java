package me.waver.dialog.beans;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2019/11/24 22:39
 */
@Entity
@Table(name = "dialog")
public class Dialog {
    private String id;
    private String name;
    private int type;
    private String parentId;
    private long creatDate;
    private long updateDate;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "parent_id")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "creat_date")
    public long getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(long creatDate) {
        this.creatDate = creatDate;
    }

    @Basic
    @Column(name = "update_date")
    public long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(long updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dialog dialog = (Dialog) o;
        return type == dialog.type &&
                creatDate == dialog.creatDate &&
                updateDate == dialog.updateDate &&
                Objects.equals(id, dialog.id) &&
                Objects.equals(name, dialog.name) &&
                Objects.equals(parentId, dialog.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, parentId, creatDate, updateDate);
    }
}
