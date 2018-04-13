package cn.com.bonc.GUI;

import cn.com.bonc.capture.Capture_main;

public class StartUpAction extends Thread {
    String deviceName;
    String networkName;
    String dataSource;
    String dataDestination;

    public StartUpAction(String deviceName, String networkName, String dataSource, String dataDestination) {
        this.deviceName = deviceName;
        this.networkName = networkName;
        this.dataSource = dataSource;
        this.dataDestination = dataDestination;
    }

    @Override
    public void run() {
        if (CaptureGUI.stopFlag) {
            new Capture_main(deviceName,
                    networkName,
                    dataSource,
                    dataDestination).StartUpCapture();
        }

    }
}
