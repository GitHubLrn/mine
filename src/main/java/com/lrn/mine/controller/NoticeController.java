package com.lrn.mine.controller;


import com.lrn.mine.entity.RespBean;
import com.lrn.mine.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 鲁瑞楠
 * @since 2021-10-28
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    INoticeService noticeService;

    @GetMapping("/getNotices")
    public RespBean getNotices(){
        return RespBean.sucess("获取成功",noticeService.list());
    }

}
