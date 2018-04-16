package com.cr6588.bean;

import java.io.Serializable;

/**
 * create in 2018年04月16日
 * @category TODO
 * @author chenyi
 */
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3912382765184885372L;
    private Long id;
    private Long username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

}
