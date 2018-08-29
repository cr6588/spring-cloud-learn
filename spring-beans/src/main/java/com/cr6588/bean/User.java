package com.cr6588.bean;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

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

    @NotBlank(message = "用户名不能为空")
    @Size(min = 6, max = 16, message = "用户名长度在6到16位")
    private String username;
    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 16, message = "密码长度在6到16位")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
