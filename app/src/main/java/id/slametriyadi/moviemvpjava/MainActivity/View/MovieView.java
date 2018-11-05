package id.slametriyadi.moviemvpjava.MainActivity.View;

import java.util.List;

import id.slametriyadi.moviemvpjava.MainActivity.Base.BaseView;
import id.slametriyadi.moviemvpjava.MainActivity.Model.ProductionCompaniesItem;
import id.slametriyadi.moviemvpjava.MainActivity.Model.ResponseDataFilm;

public interface MovieView extends BaseView {
    void onError(String msg);
    void onSuccess(List<ProductionCompaniesItem> dataFilm);
}
