package kr.co.triggers.yolo.model;

import kr.co.triggers.yolo.app.App;
import kr.co.triggers.yolo.inject.component.AppComponent;

public class ArtistModel {

    public ArtistModel(App app) {

        AppComponent component = app.getAppComponent();
        component.inject(this);
    }
}
