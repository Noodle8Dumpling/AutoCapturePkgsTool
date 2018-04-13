package cn.com.bonc.controlApp;

import cn.com.bonc.GUI.CaptureGUI;
import cn.com.bonc.MiMarket.*;
import cn.com.bonc.entity.SelectedAppInfo;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StartAndUninstall extends Thread {

    AndroidDriver driver;
    String btnXp;
    String appName;
    String appType;
    String appSize;
    List<String> pkgList;
    YystAppJumpToMainPage yyst_main;
    JrlcAppJumpToMainPage jrlc_main;
    SsgwAppJumpToMainPage ssgw_main;
    XwzxAppJumpToMainPage xwzx_main;
    JjshAppJumpToMainPage jjsh_main;
    LxjtAppJumpToMainPage lxjt_main;
    TsydAppJumpToMainPage tsyd_main;
    YljkAppJumpToMainPage yljk_main;
    SysxAppJumpToMainPage sysx_main;

    public StartAndUninstall(AndroidDriver driver, SelectedAppInfo sai) {
        this.driver = driver;
        this.btnXp = sai.getOpenXPath();
        this.appName = sai.getAppName();
        this.appType = sai.getAppType();
        this.appSize = sai.getAppSize();
    }

    @Override
    public void run() {
        if (!CaptureGUI.stopFlag) {
            return;
        }
        //启动应用 点击“打开按钮”
        if (StringUtils.isNotEmpty(btnXp)) {
            try {
                CaptureGUI.textArea_log.append("INFO:正在打开应用···\n");
                driver.findElementByXPath(btnXp).click();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        appSize = appSize.substring(0, appSize.indexOf("."));

        //根据文件类别和文件大小确定应用运行时长
        if (appType.contains("游戏")) {
            if (200 > Integer.valueOf(appSize)) {
                try {
                    Thread.sleep(240 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(360 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                Thread.sleep(8 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if ("影音视听".equals(appType)
                    || "实用工具".equals(appType)
                    || "聊天社交".equals(appType)
                    || "学习教育".equals(appType)
                    || "娱乐消遣".equals(appType)
                    || "体育运动".equals(appType)) {
                yyst_main = new YystAppJumpToMainPage();
                if (yyst_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("金融理财".equals(appType)) {
                jrlc_main = new JrlcAppJumpToMainPage();
                if (jrlc_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("时尚购物".equals(appType)) {
                ssgw_main = new SsgwAppJumpToMainPage();
                if (ssgw_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("新闻资讯".equals(appType)) {
                xwzx_main = new XwzxAppJumpToMainPage();
                if (xwzx_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("居家生活".equals(appType)) {
                jjsh_main = new JjshAppJumpToMainPage();
                if (jjsh_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("旅行交通".equals(appType)) {
                lxjt_main = new LxjtAppJumpToMainPage();
                if (lxjt_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("图书阅读".equals(appType)) {
                tsyd_main = new TsydAppJumpToMainPage();
                if (tsyd_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("医疗健康".equals(appType)) {
                yljk_main = new YljkAppJumpToMainPage();
                if (yljk_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if ("摄影摄像".equals(appType)) {
                sysx_main = new SysxAppJumpToMainPage();
                if (sysx_main.jumpToMainPage(driver)) {
                    CaptureGUI.textArea_log.append("INFO:尝试跳转至应用主界面操作完成。\n");
                    try {
                        Thread.sleep(120 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    CaptureGUI.textArea_log.append("ERROR:尝试跳转至应用主界面操作失败，请手动操作App以产生更多数据包。\n");
                    try {
                        Thread.sleep(180 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        //卸载App
        pkgList = getAppPackage();
        for (String pkg : pkgList) {
            if (StringUtils.isNotEmpty(pkg)) {
                int ustStatus = uninstallApp(pkg);
                if (ustStatus == 1) {
                    CaptureGUI.textArea_log.append("INFO:应用已卸载。\n");
                }
            } else {
                CaptureGUI.textArea_log.append("INFO:未发现安装包\n");
            }
        }

        /**
         * 因为抓取数据包并打印出包的信息有时间延迟，为确保该app的数据包信息
         * 打印完成后终止线程，故设置等待3秒
         */
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<String> getAppPackage() {
        pkgList = new ArrayList<>();
        BufferedReader br = null;
        try {
            //将命令行放到cmd中运行
            Process p = Runtime.getRuntime().exec("adb shell pm list packages -3");
            //读取执行命令后的输出结果
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            int i = 0;
            while ((line = br.readLine()) != null) {
                //读取包含packagename的行
                if (!line.contains("io.appium") && line.contains("package:")) {
                    if (!line.contains("com.jy.recorder")) {
                        pkgList.add(line.substring(8, line.length()));
                    }
                }
            }

        } catch (Exception e) {
            CaptureGUI.textArea_log.append("ERROR:获取apk包名失败。\n");
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return pkgList;
    }

    public int uninstallApp(String pkg) {
        BufferedReader installBr = null;
        try {
            CaptureGUI.textArea_log.append("INFO:应用卸载中···\n");
            //将命令行放到cmd中运行
            Runtime.getRuntime().exec("adb uninstall " + pkg);

            /*//读取执行命令后的输出结果
            installBr = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = installBr.readLine()) != null) {
                System.out.println(line.toString());
            }*/
            return 1;
        } catch (Exception e) {
            CaptureGUI.textArea_log.append("ERROR:应用卸载失败...\n");
            e.printStackTrace();
            return -1;
        } finally {
            if (installBr != null) {
                try {
                    installBr.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
