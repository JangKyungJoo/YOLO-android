package kr.co.triggers.yolo.model;

import kr.co.triggers.yolo.app.App;
import kr.co.triggers.yolo.inject.component.AppComponent;

public class UserModel {

    public UserModel(App app) {

        AppComponent component = app.getAppComponent();
        component.inject(this);
    }
}
