package com.cr6588.facade;

import java.util.List;
import java.util.Map;

import com.cr6588.bean.PubUserRole;
import com.cr6588.bean.RequestResult;
import com.cr6588.bean.User;

/**
 * create in 2018年04月24日
 * @category TODO
 * @author chenyi
 */
public interface UserFacade {

    List<User> getUserList(User user);

    RequestResult<String> regis(User user);

    List<PubUserRole> getPubUserRoleList(Map<String, Object> param);

    /**
     * 查询角色
     * @param param 查询条件
     * @return
     */
    PubUserRole getPubUserRole(Map<String, Object> param);

    /**
     * 增加角色
     * @param pubUserRole 角色
     * @return
     */
    void savePubUserRole(PubUserRole pubUserRole);

    /**
     * 修改角色
     * @param pubUserRole 角色
     */
    void updatePubUserRole(PubUserRole pubUserRole);

    /**
     * 删除角色
     * @param id
     */
    void deletePubUserRole(long id);
}
