package kr.co.triggers.yolo.network.service;

import kr.co.triggers.yolo.domain.impl.Notification;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface NotifyService {

    @GET("/notifications")
    Observable<Notification> fetch();

    @GET("/notifications")
    Observable<Notification> fetch(@Query("before") long before, @Query("count") int count);


    @PUT("/notifications/{id}/read")
    Observable<Void> read(@Path("id") long id);
}
