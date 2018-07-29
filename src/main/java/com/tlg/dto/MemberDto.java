package com.tlg.dto;

import com.tlg.Entity.Departemt;

import javax.persistence.ManyToOne;

/**
 * Created by jiechen on 2018/7/26.
 */
public class MemberDto {
    private String id;
    private String account;
    private String password;
    private String name;
    private Integer depId;
    private String depName;

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }
}
