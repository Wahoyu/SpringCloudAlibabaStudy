package com.test.controller;

import com.test.entity.UserBorrowDetail;
import com.test.service.BorrowService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BorrowController {
    @Resource
    BorrowService borrowService;

    @RequestMapping("/borrow/{uid}")
    public UserBorrowDetail getUserBorrowDetail(@PathVariable("uid")int uid){
        return borrowService.getUserBorrowDetailByUid(uid);
    }
}
