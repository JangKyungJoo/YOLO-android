package kr.co.triggers.yolo.app;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.analytics.Tracker;
import com.tsengvn.typekit.Typekit;

import javax.inject.Inject;

import kr.co.triggers.yolo.inject.component.AppComponent;
import kr.co.triggers.yolo.inject.component.DaggerAppComponent;
import kr.co.triggers.yolo.inject.module.AppModule;

public class App extends Application {

    AppComponent component;

    @Inject
    Tracker tracker;

    @Override
    public void onCreate() {

        super.onCreate();

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);

        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

        Typekit typekit = Typekit.getInstance();

        typekit.addNormal(Typekit.createFromAsset(this, "fonts/NotoSansCJKkr-Regular.otf"));
        typekit.addBold(Typekit.createFromAsset(this, "fonts/NotoSansCJKkr-Bold.otf"));

        component.inject(this);
    }

    public AppComponent getAppComponent() { return component; }
}
