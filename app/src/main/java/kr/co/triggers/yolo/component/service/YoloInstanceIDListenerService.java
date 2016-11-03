package kr.co.triggers.yolo.component.service;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

public class YoloInstanceIDListenerService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh() {

        Intent intent = new Intent(this, YoloRegistrationService.class);
        startService(intent);
    }
}
