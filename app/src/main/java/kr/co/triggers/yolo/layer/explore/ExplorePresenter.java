package kr.co.triggers.yolo.layer.explore;

import kr.co.triggers.yolo.component.activity.YoloPresenter;
import kr.co.triggers.yolo.inject.component.AppComponent;

public class ExplorePresenter extends YoloPresenter<ExploreView> {

    public ExplorePresenter(ExploreView view) {

        this.view = view;

        AppComponent component = view.getAppComponent();
        component.inject(this);
    }
}

