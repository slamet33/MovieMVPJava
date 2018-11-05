package id.slametriyadi.moviemvpjava.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConfigRetrofit {
    public static final String webUrl = "https://api.themoviedb.org/3/movie/";

    public static Retrofit setInit() {
        return new Retrofit.Builder()
                .baseUrl(webUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService apiService() {
        return setInit().create(ApiService.class);
    }
}
