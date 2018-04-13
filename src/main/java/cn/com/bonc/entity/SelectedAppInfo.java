package cn.com.bonc.entity;

/**
 * 创建人：郝京
 * <p>
 * 创建日期：2018-03-15
 * <p>
 * 文件描述：搜索后选取的符合条件的App信息实体
 */
public class SelectedAppInfo {
    public String appName;
    public String appType;
    public String appSize;
    public String openXPath;
    public String descriptionXPath;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize;
    }

    public String getOpenXPath() {
        return openXPath;
    }

    public void setOpenXPath(String openXPath) {
        this.openXPath = openXPath;
    }

    public String getDescriptionXPath() {
        return descriptionXPath;
    }

    public void setDescriptionXPath(String descriptionXPath) {
        this.descriptionXPath = descriptionXPath;
    }
}
