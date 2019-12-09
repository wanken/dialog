package me.waver.dialog.beans;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author waver
 * @date 2019/12/9 20:35
 */
@Entity
@Table(name = "dialog_grade")
public class DialogGrade {
    private String id;
    private String name;
    private int grade;

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
    @Column(name = "grade")
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DialogGrade that = (DialogGrade) o;
        return grade == that.grade &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade);
    }
}
