package com.programmingonestop.retrofithttpclient.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.programmingonestop.retrofithttpclient.retrofitinterface.RandomPostApi;
import com.programmingonestop.retrofithttpclient.retrofitmodel.Post;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
@Service
public class RandomPostService {

	public List<Post> getRandomResponse() {
		
		List<Post> randompost = null;
		
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
		Retrofit retrofit = new Retrofit.Builder()
		  .baseUrl("https://jsonplaceholder.typicode.com")
		  .addConverterFactory(GsonConverterFactory.create())
		  .client(httpClient.build())
		  .build();
		
		RandomPostApi randomPostAPI = retrofit.create(RandomPostApi.class);
		Call<List<Post>> callSync = randomPostAPI.getRandomPost();
		
		try {
			Response<List<Post>> response = callSync.execute();
			randompost = response.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		return randompost;
	}
}