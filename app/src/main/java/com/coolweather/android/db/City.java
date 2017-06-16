package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**关于城市的表结构
 * Created by Administrator on 2017/6/16.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;//城市名字
    private int cityCode;//城市编码
    private int provinceId;//所属省份ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
