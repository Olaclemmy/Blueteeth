package com.robotpajamas.blueteeth.listeners;

import com.robotpajamas.blueteeth.BlueteethDevice;

import java.util.List;

public interface OnScanResponseListener {
    void call(List<BlueteethDevice> blueteethDevices);
}
