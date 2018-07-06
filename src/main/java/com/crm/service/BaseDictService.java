package com.crm.service;

import com.crm.entity.BaseDict;

import java.util.List;

public interface BaseDictService {
    public List<BaseDict> selectBaseDictByCode(String code);
}
