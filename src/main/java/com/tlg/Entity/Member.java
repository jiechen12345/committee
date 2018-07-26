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
    public Integer id;
    public String account;
    public String password;
    public String neme;
    @ManyToOne(targetEntity = Departemt.class)
    public Departemt departemt;

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
