package kr.co.triggers.yolo.component.service;

import android.app.IntentService;
import android.content.Intent;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

import kr.co.triggers.yolo.R;

public class YoloRegistrationService extends IntentService {

    private static final String TAG = YoloRegistrationService.class.getCanonicalName();

    public YoloRegistrationService() { super(TAG); }

    @Override
    protected void onHandleIntent(Intent intent) {

        try {

            InstanceID instanceID = InstanceID.getInstance(this);
            String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId), GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);

            // TODO : 토큰 업로드
        }
        catch (IOException e) { e.printStackTrace(); }
    }
}
