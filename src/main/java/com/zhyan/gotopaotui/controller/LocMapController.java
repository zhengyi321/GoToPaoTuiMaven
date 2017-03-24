package com.zhyan.gotopaotui.controller;

import com.zhyan.gotopaotui.bean.LocMap;
import com.zhyan.gotopaotui.service.LocMapMapperService;
import com.zhyan.gotopaotui.util.JsonResult;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by zhyan on 2017/3/24.
 */
@RequestMapping("GoToPaoTui")
@Controller
public class LocMapController {
    @Autowired
    private LocMapMapperService locMapMapperService;

    @RequestMapping("SubmitLoc")
    @ResponseBody
    public JsonResult paotuiSubmitLoc(HttpServletRequest request) {
        String pid = request.getParameter("pid");
        double lat = Double.parseDouble(request.getParameter("lat")) ;
        double lon = Double.parseDouble(request.getParameter("lon")) ;
        if (pid != null) {
            LocMap locMap = locMapMapperService.selectByPid(pid);
            if (locMap != null) {
                locMap.setLat(lat);
                locMap.setLon(lon);
   /*             UUID uuid = UUID.randomUUID();
                locMap.setGuid(uuid.toString());*/
                /*locMap.setCreatetime(new Date());*/
                locMap.setUpdatetime(new Date());
                locMapMapperService.updateByPrimaryKeySelective(locMap);
            } else {
                LocMap locMap1 = new LocMap();
                locMap1.setLat(lat);
                locMap1.setLon(lon);
                locMap1.setPid(pid);
                UUID uuid = UUID.randomUUID();
                locMap1.setGuid(uuid.toString());
                locMap1.setCreatetime(new Date());
                locMap1.setUpdatetime(new Date());
                locMapMapperService.insert(locMap1);
            }
            JsonResult jsonResult = new JsonResult();
            jsonResult.setSuccess(true);
            jsonResult.setMessage("保存成功");
            jsonResult.setData(new Date());
            return jsonResult;
        }else{
            JsonResult jsonResult = new JsonResult();
            jsonResult.setSuccess(false);
            jsonResult.setMessage("保存失败");
            jsonResult.setData(new Date());
            return jsonResult;
        }
    }
    @RequestMapping("test")
    @ResponseBody
    public String test(HttpServletRequest request){
        double lat = Double.parseDouble(request.getParameter("lat")) ;
        return "ok"+lat;
    }
}
