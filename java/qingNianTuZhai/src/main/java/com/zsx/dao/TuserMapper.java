package com.zsx.dao;

import com.zsx.entity.Tuser;

public interface TuserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
}