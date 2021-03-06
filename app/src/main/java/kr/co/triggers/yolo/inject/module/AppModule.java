package kr.co.triggers.yolo.inject.module;

import android.content.Context;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;
import kr.co.triggers.yolo.R;
import kr.co.triggers.yolo.app.App;
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
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    App app;

    public AppModule(App app) {

        this.app = app;
    }



    @Provides
    public Tracker tracker() {

        GoogleAnalytics analytics = GoogleAnalytics.getInstance(app);
        return analytics.newTracker(R.xml.global_tracker);
    }

    @Provides
    public Context context() { return app; }


    @Provides
    public ArtistModel artistModel() { return new ArtistModel(app); }

    @Provides
    public FiestaModel fiestaModel() { return new FiestaModel(app); }

    @Provides
    public NotificationModel notificationModel() { return new NotificationModel(app); }

    @Provides
    public TrackModel trackModel() { return new TrackModel(app); }

    @Provides
    public UserModel userModel() { return new UserModel(app); }



    public static final String URL = "http://localhost:3000";



    @Provides
    public OkHttpClient client() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        return builder.build();
    }

    @Provides
    public Retrofit retrofit(OkHttpClient client) {

        Retrofit.Builder builder = new Retrofit.Builder();

        builder.client(client);
        builder.baseUrl(URL);
        builder.addConverterFactory(GsonConverterFactory.create());
        builder.addCallAdapterFactory(RxJavaCallAdapterFactory.create());

        return builder.build();
    }

    @Provides
    public Picasso picasso(OkHttpClient client) {

        Picasso.Builder builder = new Picasso.Builder(app);
        builder.downloader(new OkHttp3Downloader(client));

        return builder.build();
    }




    @Provides
    public ArtistService artistService(Retrofit retrofit) { return retrofit.create(ArtistService.class); }

    @Provides
    public AuthService authService(Retrofit retrofit) { return retrofit.create(AuthService.class); }

    @Provides
    public FiestaService fiestaService(Retrofit retrofit) { return retrofit.create(FiestaService.class); }

    @Provides
    public NotifyService notifyService(Retrofit retrofit) { return retrofit.create(NotifyService.class); }

    @Provides
    public PhotoService photoService(Retrofit retrofit) { return retrofit.create(PhotoService.class); }

    @Provides
    public SearchService searchService(Retrofit retrofit) { return retrofit.create(SearchService.class); }

    @Provides
    public TagService tagService(Retrofit retrofit) { return retrofit.create(TagService.class); }

    @Provides
    public TrackService trackService(Retrofit retrofit) { return retrofit.create(TrackService.class); }

    @Provides
    public UserService userService(Retrofit retrofit) { return retrofit.create(UserService.class); }
}
