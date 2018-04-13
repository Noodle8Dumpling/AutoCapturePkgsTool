package cn.com.bonc.entity;

/**
 * 创建人：郝京
 * <p>
 * 创建日期：2018-03-15
 * <p>
 * 文件描述：入口App（应用市场/应用商店）信息实体
 */
public class AppMarketInfo {
    public String pkgName;
    public String activityName;
    public String searchBox;
    public String inputBox;
    public Integer submitCode;

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getSearchBox() {
        return searchBox;
    }

    public void setSearchBox(String searchBox) {
        this.searchBox = searchBox;
    }

    public String getInputBox() {
        return inputBox;
    }

    public void setInputBox(String inputBox) {
        this.inputBox = inputBox;
    }

    public Integer getSubmitCode() {
        return submitCode;
    }

    public void setSubmitCode(Integer submitCode) {
        this.submitCode = submitCode;
    }
}
