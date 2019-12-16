package me.waver.dialog.common.exts;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/**
 * @author waver
 * @date 2019/12/16 14:02
 */
@Entity
@Table(name = "dialog")
public class DialogExt {
    private String id;
    private String name;
    private String cover;
    private int type;
    private String refGradeId;
    private String parentId;
    private Integer layerIndex;
    private long creatDate;
    private long updateDate;
    private List<DialogExt> children;

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
    @Column(name = "cover")
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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
    @Column(name = "ref_grade_id")
    public String getRefGradeId() {
        return refGradeId;
    }

    public void setRefGradeId(String refGradeId) {
        this.refGradeId = refGradeId;
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
    @Column(name = "layer_index")
    public Integer getLayerIndex() {
        return layerIndex;
    }

    public void setLayerIndex(Integer layerIndex) {
        this.layerIndex = layerIndex;
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

    @JoinColumn(name = "parent_id")
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REMOVE, CascadeType.DETACH})
    public List<DialogExt> getChildren() {
        return children;
    }

    public void setChildren(List<DialogExt> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DialogExt dialogExt = (DialogExt) o;
        return type == dialogExt.type &&
                creatDate == dialogExt.creatDate &&
                updateDate == dialogExt.updateDate &&
                Objects.equals(id, dialogExt.id) &&
                Objects.equals(name, dialogExt.name) &&
                Objects.equals(cover, dialogExt.cover) &&
                Objects.equals(refGradeId, dialogExt.refGradeId) &&
                Objects.equals(parentId, dialogExt.parentId) &&
                Objects.equals(layerIndex, dialogExt.layerIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cover, type, refGradeId, parentId, layerIndex, creatDate, updateDate);
    }
}
