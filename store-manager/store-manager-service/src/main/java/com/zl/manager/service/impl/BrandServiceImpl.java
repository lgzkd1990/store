package com.zl.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zl.manager.service.BrandService;
import com.zl.mapper.TbBrandMapper;
import com.zl.pojo.TbBrand;
import com.zl.pojo.TbBrandExample;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//注意这个service是dubbox的
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper;


    @Override
    public List<TbBrand> findAll() {
        TbBrandExample tbBrandExample = new TbBrandExample();
        List<TbBrand> list = tbBrandMapper.selectByExample(tbBrandExample);
        return list;
    }
}
