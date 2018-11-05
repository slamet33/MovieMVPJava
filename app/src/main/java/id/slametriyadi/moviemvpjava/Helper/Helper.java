package id.slametriyadi.moviemvpjava.Helper;

import id.slametriyadi.moviemvpjava.Network.ApiService;
import id.slametriyadi.moviemvpjava.Network.ConfigRetrofit;

public class Helper {

    public static ApiService getApi(){
        return ConfigRetrofit.apiService();
    }
}
