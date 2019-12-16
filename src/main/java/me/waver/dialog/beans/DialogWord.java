package me.waver.dialog.beans;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2019/12/16 14:29
 */
@Entity
@Table(name = "dialog_word")
public class DialogWord {
    private String id;
    private String refDetailId;
    private String word;
    private String translate;

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
    @Column(name = "word")
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Basic
    @Column(name = "translate")
    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DialogWord that = (DialogWord) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(refDetailId, that.refDetailId) &&
                Objects.equals(word, that.word) &&
                Objects.equals(translate, that.translate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refDetailId, word, translate);
    }
}
