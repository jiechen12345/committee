package com.tlg.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.spring5.view.reactive.ThymeleafReactiveViewResolver;

import javax.persistence.*;

/**
 * Created by JieChen on 2018/7/24.
 */

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String account;
    private String password;
    private String neme;
    @ManyToOne(targetEntity = Departemt.class)
    private Departemt departemt;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public Departemt getDepartemt() {
        return departemt;
    }

    public void setDepartemt(Departemt departemt) {
        this.departemt = departemt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", neme='" + neme + '\'' +
                ", departemt=" + departemt +
                '}';
    }
}
