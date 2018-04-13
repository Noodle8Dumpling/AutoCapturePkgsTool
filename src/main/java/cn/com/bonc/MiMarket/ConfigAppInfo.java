package cn.com.bonc.MiMarket;

import cn.com.bonc.services.ParaConfigService;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建人：郝京
 * <p>
 * 日期： 2018-03-15
 * <p>
 * 文件描述：配置参数
 */
public class ConfigAppInfo implements ParaConfigService {

    @Override
    public List<String> defAppPara() {
        List<String> paraList = new ArrayList<>();
        paraList.add("com.xiaomi.market");
        paraList.add(".ui.MarketTabActivity");
//        paraList.add("com.huawei.appmarket");
//        paraList.add(".MainActivity");
        paraList.add("com.xiaomi.market:id/search_text_switcher");
        paraList.add("android:id/input");
        paraList.add("66");
        return paraList;
    }
}
