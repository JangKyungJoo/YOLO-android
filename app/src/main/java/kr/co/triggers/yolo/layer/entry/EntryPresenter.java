package kr.co.triggers.yolo.layer.entry;

import kr.co.triggers.yolo.component.activity.YoloPresenter;
import kr.co.triggers.yolo.inject.component.AppComponent;

public class EntryPresenter extends YoloPresenter<EntryView> {

    public EntryPresenter(EntryView view) {

        this.view = view;

        AppComponent component = view.getAppComponent();
        component.inject(this);
    }
}

