package mobile.fasam.edu.retrofit2N2.bootstrap;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class BootstrapApi {



    final static String ENDPOINT = "https://jsonplaceholder.typicode.com/";

    static Retrofit retrofit;

    public static Retrofit getClient()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
