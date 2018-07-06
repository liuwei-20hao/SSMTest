package com.crm.dao;

import com.crm.entity.BaseDict;

import java.util.List;

public interface BaseDictDao {
    public List<BaseDict> selectBaseDictByCode(String code);

}
