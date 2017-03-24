package com.zhyan.gotopaotui.dao;

import com.zhyan.gotopaotui.bean.LocMap;
import com.zhyan.gotopaotui.bean.LocMapKey;

import java.util.List;

public interface LocMapMapper {
    int deleteByPrimaryKey(LocMapKey key);

    int insert(LocMap record);

    int insertSelective(LocMap record);

    LocMap selectByPrimaryKey(LocMapKey key);

    LocMap selectByPid(String pid);

    int updateByPrimaryKeySelective(LocMap record);

    int updateByPrimaryKey(LocMap record);
}