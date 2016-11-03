package kr.co.triggers.yolo.network.service;

import java.util.List;

import kr.co.triggers.yolo.domain.impl.Track;
import kr.co.triggers.yolo.network.response.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface TrackService {

    @GET("/tracks/search")
    Observable<Response<List<Track>>> search(@Query("query") String query);

    @GET("/tracks/search")
    Observable<Response<List<Track>>> search(@Query("query") String query,
                                             @Query("before") long before, @Query("count") int count);


    @POST("/tracks/{id}/like")
    Observable<Void> like(@Path("id") long id);

    @POST("/tracks/{id}/unlike")
    Observable<Void> unlike(@Path("id") long id);
}
