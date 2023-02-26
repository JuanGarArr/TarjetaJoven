package com.iesam.youthcard.app.api;


import com.iesam.youthcard.domain.Cat;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiService {

    @GET("cats.json")
    public Call<List<Cat>> getCats();
}
