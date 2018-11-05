package id.slametriyadi.moviemvpjava.MainActivity.Presenter;

import java.util.List;

import id.slametriyadi.moviemvpjava.Helper.Helper;
import id.slametriyadi.moviemvpjava.MainActivity.Base.BasePresenter;
import id.slametriyadi.moviemvpjava.MainActivity.Model.ProductionCompaniesItem;
import id.slametriyadi.moviemvpjava.MainActivity.Model.ResponseDataFilm;
import id.slametriyadi.moviemvpjava.MainActivity.View.MovieView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviePresenter implements BasePresenter<MovieView> {

    MovieView movieView;

    public void ambilData() {
        Call<ResponseDataFilm> dataFilmCall = Helper.getApi().getMovie();
        dataFilmCall.enqueue(new Callback<ResponseDataFilm>() {
            @Override
            public void onResponse(Call<ResponseDataFilm> call, Response<ResponseDataFilm> response) {
                if (response.isSuccessful()){
                    List<ProductionCompaniesItem> dataCompany = response.body().getProductionCompanies();
                    movieView.onSuccess(dataCompany);
                }
            }

            @Override
            public void onFailure(Call<ResponseDataFilm> call, Throwable t) {

            }
        });
    }

    @Override
    public void onAttach(MovieView view) {
        movieView = view;
    }

    @Override
    public void onDetach() {
        movieView = null;
    }
}
