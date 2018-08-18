package com.cr6588.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create in 2018年08月01日
 * @category TODO
 * @author chenyi
 */
@Controller
@RequestMapping(ElementUiController.ELEMENT_UI)
public class ElementUiController {

    static final String ELEMENT_UI = "/element-ui";

    /**
     * 页面跳转
     * @param pageName
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/{pageName}")
    public String viewAdminManagePages(@PathVariable("pageName") String pageName) {
        return ELEMENT_UI + "/" + pageName;
    }
}
