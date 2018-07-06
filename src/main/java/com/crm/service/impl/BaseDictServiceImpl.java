package com.crm.service.impl;

import com.crm.dao.BaseDictDao;
import com.crm.entity.BaseDict;
import com.crm.service.BaseDictService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Inject
    private BaseDictDao baseDictDao;

    public List<BaseDict> selectBaseDictByCode(String code) {
        return baseDictDao.selectBaseDictByCode(code);
    }
}
