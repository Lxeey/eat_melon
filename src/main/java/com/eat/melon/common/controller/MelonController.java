package com.eat.melon.common.controller;


import com.eat.melon.common.service.IMelonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author lixinyi03
 * @version 1.0
 * @date 2023/8/31 8:58
 * @Description
 */
@RestController
@RequestMapping("/eat")
public class MelonController {
    @Resource
    private IMelonService melonService;


    @GetMapping("/getReplies/${plat}/${id}")
    @ResponseBody
    public HashMap<String,Object> getReplies(String plat,String id){
        return null;

    }


}
