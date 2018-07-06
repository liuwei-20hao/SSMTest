package com.crm.controller;

import com.crm.entity.BaseDict;
import com.crm.service.BaseDictService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@Controller
public class CustomerController {
    @Inject
    private BaseDictService baseDictService;
    @RequestMapping(value = "/customerlist")
    public String customerlist(Model model){
        List<BaseDict> fromType = baseDictService.selectBaseDictByCode("002");
        List<BaseDict> industryType = baseDictService.selectBaseDictByCode("001");
        List<BaseDict> levelType = baseDictService.selectBaseDictByCode("006");
        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);
        return null;
    }
}
