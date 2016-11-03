package kr.co.triggers.yolo.layer.login;

import kr.co.triggers.yolo.component.activity.YoloPresenter;
import kr.co.triggers.yolo.inject.component.AppComponent;

public class LoginPresenter extends YoloPresenter<LoginView> {

    public LoginPresenter(LoginView view) {

        this.view = view;

        AppComponent component = view.getAppComponent();
        component.inject(this);
    }
}
