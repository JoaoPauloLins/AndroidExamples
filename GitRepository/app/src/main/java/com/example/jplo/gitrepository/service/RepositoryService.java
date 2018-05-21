package com.example.jplo.gitrepository.service;

import com.example.jplo.gitrepository.model.Repository;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RepositoryService {
    @GET("users/{user}")
    Observable<Repository> getRepository(@Path("user") String user);
}
