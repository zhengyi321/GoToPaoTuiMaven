package com.zhyan.gotopaotui.util;

/**
 * Created by zhyan on 2017/3/24.
 */
import java.io.Serializable;

public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = -4699713095477151086L;

    /**
     * 数据
     */
    private T data;
    /**
     * 信息
     */
    private String message;
    /**
     * 是否成功
     */
    private boolean success;

    public Object getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public JsonResult() {
        super();
    }

    public JsonResult(T data, String message, boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public JsonResult(T data, String message) {
        this.data = data;
        this.message = message;
        this.success = true;
    }

    public JsonResult(T data) {
        this.data = data;

    }
}















 /*   public @ResponseBody*/
/*    JsonResult<Object[]> getSysUserInJson()
    {*/
   /*     List<SystemUser> allSysUser=  systemuserdao.queryAllUser();
        Map<String,SystemUser> sysUserMap = new HashMap<String ,SystemUser>();*/

     /*   String temp = "";
        for(int i=0;i<allSysUser.size();i++)
        {
            //	citymap.put(Integer.toString(i), allCity.get(i));
            temp += allSysUser.get(i).toString();
            //		temp += "{'id':"+allCity.get(i).getId()+",'name':"+allCity.get(i).getName().toString()+"}";

            if(i != (allSysUser.size()-1))
                temp += ",";
        }
        JsonResult<List<SystemUser>> jsonResult = new JsonResult<List<SystemUser>>(allSysUser);*/
//		City city = new City();
//		city.setName("12");
//		city.setStaffName(new String[] { "mkyong1", "mkyong2" });
/*        Object[] objs = { jsonResult};
        JsonResult<Object[]> jsonObj = new JsonResult<Object[]>(objs);
        return jsonObj;

    }*/
