package kr.co.triggers.yolo.inject.component;

import android.content.Context;

import com.google.android.gms.analytics.Tracker;
import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Component;
import kr.co.triggers.yolo.app.App;
import kr.co.triggers.yolo.inject.module.AppModule;
import kr.co.triggers.yolo.layer.artist.ArtistPresenter;
import kr.co.triggers.yolo.layer.enroll.EnrollPresenter;
import kr.co.triggers.yolo.layer.entry.EntryPresenter;
import kr.co.triggers.yolo.layer.explore.ExplorePresenter;
import kr.co.triggers.yolo.layer.login.LoginPresenter;
import kr.co.triggers.yolo.model.ArtistModel;
import kr.co.triggers.yolo.model.FiestaModel;
import kr.co.triggers.yolo.model.NotificationModel;
import kr.co.triggers.yolo.model.TrackModel;
import kr.co.triggers.yolo.model.UserModel;
import kr.co.triggers.yolo.network.service.ArtistService;
import kr.co.triggers.yolo.network.service.AuthService;
import kr.co.triggers.yolo.network.service.FiestaService;
import kr.co.triggers.yolo.network.service.NotifyService;
import kr.co.triggers.yolo.network.service.PhotoService;
import kr.co.triggers.yolo.network.service.SearchService;
import kr.co.triggers.yolo.network.service.TagService;
import kr.co.triggers.yolo.network.service.TrackService;
import kr.co.triggers.yolo.network.service.UserService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {

    Tracker tracker();

    Context context();

    ArtistModel artistModel();
    FiestaModel fiestaModel();
    NotificationModel notificationModel();
    TrackModel trackModel();
    UserModel userModel();

    OkHttpClient client();

    Retrofit retrofit();
    Picasso picasso();

    ArtistService artistService();
    AuthService authService();
    FiestaService fiestaService();
    NotifyService notifyService();
    PhotoService photoService();
    SearchService searchService();
    TagService tagService();
    TrackService trackService();
    UserService userService();

    void inject(App app);

    void inject(ArtistModel artistModel);
    void inject(FiestaModel fiestaModel);
    void inject(NotificationModel notificationModel);
    void inject(TrackModel trackModel);
    void inject(UserModel userModel);

    void inject(ArtistPresenter artistPresenter);
    void inject(EnrollPresenter enrollPresenter);
    void inject(EntryPresenter entryPresenter);
    void inject(ExplorePresenter explorePresenter);
    void inject(LoginPresenter presenter);
}
