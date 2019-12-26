package com.programmingonestop.retrofithttpclient.retrofitinterface;

import java.util.List;

import org.springframework.stereotype.Component;

import com.programmingonestop.retrofithttpclient.retrofitmodel.Post;

import retrofit2.Call;
import retrofit2.http.GET;

@Component
public interface RandomPostApi 
{

	@GET("/posts")
	public Call<List<Post>> getRandomPost();
}
