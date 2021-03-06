package com.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lisineng on 6/13/18.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode(){
        return provinceCode;
    }
}
