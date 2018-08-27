package com.cr6588.bean;

import java.io.Serializable;

/**
 * 角色表实体Bean
 */
public class PubUserRole extends BaseBean implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 8506752377744311135L;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色状态
     */
    private Integer status;

    /**
     * 权限集（角色包含的所有权限ID的集合）
     */
    private String permission;

    /**
     * 是否已删除
     */
    private Integer deleted;

    public String getName() {
        return name;
    }

    public Integer getStatus() {
        return status;
    }

    public String getPermission() {
        return permission;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return super.toString() + "PubUserRole [name=" + name + ", status=" + status
                + ", permission=" + permission + ", deleted=" + deleted + "]";
    }
}
