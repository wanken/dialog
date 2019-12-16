package me.waver.dialog.beans;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2019/12/16 14:02
 */
@Entity
@Table(name = "dialog_detail")
public class DialogDetail {
    private String id;
    private String title;
    private String refDialogId;
    private String cover;
    private String videoPath;
    private Integer orderIndex;
    private long createTime;
    private long updateTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "cover")
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Basic
    @Column(name = "video_path")
    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    @Basic
    @Column(name = "order_index")
    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    @Basic
    @Column(name = "create_time")
    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DialogDetail that = (DialogDetail) o;
        return createTime == that.createTime &&
                updateTime == that.updateTime &&
                Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(refDialogId, that.refDialogId) &&
                Objects.equals(cover, that.cover) &&
                Objects.equals(videoPath, that.videoPath) &&
                Objects.equals(orderIndex, that.orderIndex);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, title, refDialogId, cover, videoPath, orderIndex, createTime, updateTime);
    }
}
