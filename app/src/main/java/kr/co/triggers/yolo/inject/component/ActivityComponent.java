package kr.co.triggers.yolo.inject.component;

import android.app.Activity;

import dagger.Component;
import kr.co.triggers.yolo.inject.module.ActivityModule;
import kr.co.triggers.yolo.inject.scope.PerActivity;
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

@PerActivity
@Component(modules = { ActivityModule.class }, dependencies = { AppComponent.class })
public interface ActivityComponent extends AppComponent {

    Activity activity();

    ArtistPresenter artistPresenter();
    EnrollPresenter enrollPresenter();
    EntryPresenter entryPresenter();
    ExplorePresenter explorePresenter();
    LoginPresenter loginPresenter();

    void inject(ArtistView view);
    void inject(EnrollView view);
    void inject(EntryView view);
    void inject(ExploreView view);
    void inject(LoginView view);

    void inject(ArtistPresenter presenter);
    void inject(EnrollPresenter presenter);
    void inject(EntryPresenter presenter);
    void inject(ExplorePresenter presenter);
    void inject(LoginPresenter presenter);
}