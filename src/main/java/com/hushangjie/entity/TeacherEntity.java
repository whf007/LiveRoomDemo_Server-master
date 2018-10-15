package com.hushangjie.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/12.
 */
@Entity
@Table(name = "teacher", schema = "livedemo", catalog = "")
public class TeacherEntity implements Serializable {
    private static final long serialVersionUID = 1l;
    private Integer id;

    private String lastName;

    private String email;

    private Integer age;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "sq_teacher",sequenceName = "sq_teacher",initialValue = 2000000001)
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
    }
}
