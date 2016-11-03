package kr.co.triggers.yolo.layer.artist;

import kr.co.triggers.yolo.component.activity.YoloPresenter;
import kr.co.triggers.yolo.inject.component.AppComponent;

public class ArtistPresenter extends YoloPresenter<ArtistView> {

    public ArtistPresenter(ArtistView view) {

        this.view = view;

        AppComponent component = view.getAppComponent();
        component.inject(this);
    }
}
