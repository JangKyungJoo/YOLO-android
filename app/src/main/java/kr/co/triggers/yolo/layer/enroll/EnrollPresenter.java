package kr.co.triggers.yolo.layer.enroll;

import kr.co.triggers.yolo.component.activity.YoloPresenter;
import kr.co.triggers.yolo.inject.component.AppComponent;

public class EnrollPresenter extends YoloPresenter<EnrollView> {

    public EnrollPresenter(EnrollView view) {

        this.view = view;

        AppComponent component = view.getAppComponent();
        component.inject(this);
    }
}