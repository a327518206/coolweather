package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**关于旗县区的表结构
 * Created by Administrator on 2017/6/16.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//旗县区名
    private String weatherId;//天气ID
    private int cityId;//所属城市ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
