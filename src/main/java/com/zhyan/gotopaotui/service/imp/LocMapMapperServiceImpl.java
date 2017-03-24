package com.zhyan.gotopaotui.service.imp;

import com.zhyan.gotopaotui.bean.LocMap;
import com.zhyan.gotopaotui.bean.LocMapKey;
import com.zhyan.gotopaotui.dao.LocMapMapper;
import com.zhyan.gotopaotui.service.LocMapMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhyan on 2017/3/24.
 */
@Service
public class LocMapMapperServiceImpl implements LocMapMapperService {
    @Autowired
    private LocMapMapper locMapMapper;
    public int deleteByPrimaryKey(LocMapKey key) {
        return locMapMapper.deleteByPrimaryKey(key);
    }

    public int insert(LocMap record) {
        return locMapMapper.insert(record);
    }

    public int insertSelective(LocMap record) {
        return locMapMapper.insertSelective(record);
    }

    public LocMap selectByPrimaryKey(LocMapKey key) {
        return locMapMapper.selectByPrimaryKey(key);
    }

    public LocMap selectByPid(String pid) {
        return locMapMapper.selectByPid(pid);
    }

    public int updateByPrimaryKeySelective(LocMap record) {
        return locMapMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LocMap record) {
        return locMapMapper.updateByPrimaryKey(record);
    }
}
