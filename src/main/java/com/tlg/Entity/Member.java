package com.tlg.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.spring5.view.reactive.ThymeleafReactiveViewResolver;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by JieChen on 2018/7/24.
 */

@Entity
public class Member {
    @Id
    String id;
    String account;

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

    String password;
    String neme;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", neme='" + neme + '\'' +
                '}';
    }
}
