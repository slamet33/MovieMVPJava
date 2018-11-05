package id.slametriyadi.moviemvpjava.Network;

import id.slametriyadi.moviemvpjava.MainActivity.Model.ResponseDataFilm;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
//    https://api.themoviedb.org/3/movie/550?api_key=61a732264fa2977939306018c139391c
    @GET("550?api_key=61a732264fa2977939306018c139391c")
    Call<ResponseDataFilm> getMovie();
}
