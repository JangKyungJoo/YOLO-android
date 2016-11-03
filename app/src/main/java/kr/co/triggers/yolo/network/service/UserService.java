package kr.co.triggers.yolo.network.service;

import kr.co.triggers.yolo.domain.impl.User;
import kr.co.triggers.yolo.network.response.Response;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface UserService {

    @GET("/users/{id}")
    Observable<User> findById(@Path("id") long id);


    @GET("/users/{id}/profile")
    Observable<Response<String>> profile(@Path("id") long id);

    @GET("/users/{id}/profile")
    Observable<Response<String>> profile(@Path("id") long id, @Query("redirect") boolean redirect);


    @DELETE("/users")
    Observable<Void> leave(@Path("id") long id);
}
