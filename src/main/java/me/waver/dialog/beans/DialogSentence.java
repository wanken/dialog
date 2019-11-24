package me.waver.dialog.beans;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2019/11/24 22:39
 */
@Entity
@Table(name = "dialog_sentence")
public class DialogSentence {
    private String id;
    private String refDetailId;
    private String sentence;
    private String sentenceTrans;
    private long beginTime;
    private long endTime;
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
    @Column(name = "ref_detail_id")
    public String getRefDetailId() {
        return refDetailId;
    }

    public void setRefDetailId(String refDetailId) {
        this.refDetailId = refDetailId;
    }

    @Basic
    @Column(name = "sentence")
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Basic
    @Column(name = "sentence_trans")
    public String getSentenceTrans() {
        return sentenceTrans;
    }

    public void setSentenceTrans(String sentenceTrans) {
        this.sentenceTrans = sentenceTrans;
    }

    @Basic
    @Column(name = "begin_time")
    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "end_time")
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
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
        DialogSentence that = (DialogSentence) o;
        return beginTime == that.beginTime &&
                endTime == that.endTime &&
                createTime == that.createTime &&
                updateTime == that.updateTime &&
                Objects.equals(id, that.id) &&
                Objects.equals(refDetailId, that.refDetailId) &&
                Objects.equals(sentence, that.sentence) &&
                Objects.equals(sentenceTrans, that.sentenceTrans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refDetailId, sentence, sentenceTrans, beginTime, endTime, createTime, updateTime);
    }
}
