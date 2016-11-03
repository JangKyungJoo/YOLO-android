package kr.co.triggers.yolo.inject.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import kr.co.triggers.yolo.component.activity.YoloView;
import kr.co.triggers.yolo.layer.artist.ArtistPresenter;
import kr.co.triggers.yolo.layer.artist.ArtistView;
import kr.co.triggers.yolo.layer.enroll.EnrollPresenter;
import kr.co.triggers.yolo.layer.enroll.EnrollView;
import kr.co.triggers.yolo.layer.entry.EntryPresenter;
import kr.co.triggers.yolo.layer.entry.EntryView;
import kr.co.triggers.yolo.layer.explore.ExplorePresenter;
import kr.co.triggers.yolo.layer.explore.ExploreView;
import kr.co.triggers.yolo.layer.login.LoginPresenter;
import kr.co.triggers.yolo.layer.login.LoginView;

@Module
public class ActivityModule {

    YoloView view;

    public ActivityModule(YoloView view) {

        this.view = view;
    }

    @Provides
    public Activity activity() { return view; }


    @Provides
    public ArtistPresenter artistPresenter() { return new ArtistPresenter((ArtistView) view); }

    @Provides
    public EnrollPresenter enrollPresenter() { return new EnrollPresenter((EnrollView) view); }

    @Provides
    public EntryPresenter entryPresenter() { return new EntryPresenter((EntryView) view); }

    @Provides
    public ExplorePresenter explorePresenter() { return new ExplorePresenter((ExploreView) view); }

    @Provides
    public LoginPresenter loginPresenter() { return new LoginPresenter((LoginView) view); }
}
