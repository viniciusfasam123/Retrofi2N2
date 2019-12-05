package mobile.fasam.edu.retrofit2N2.resource;

import java.util.List;

import mobile.fasam.edu.retrofit2N2.representacao.Photos;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;


    public interface PhotosService {


        @POST("")
        Call<Photos> post(@Body Photos comments); // enviar para o servidor


        @GET("posts/{id}")
        Call<Photos> get(@Path("id") Integer id);


        @GET("posts")
        Call<List<Photos>> get();  //Trazer a lista de posts


        @PUT("photos/{id}")
        Call<Photos> put(@Path("id") Integer id, @Body Photos photos);


        @PATCH ("photos/{id}")
        Call<Photos> patch(@Path("id") Integer id, @Body Photos photos);


        @DELETE ("posts")
        Call<Void> delete(@Path("id") Integer id);
}
