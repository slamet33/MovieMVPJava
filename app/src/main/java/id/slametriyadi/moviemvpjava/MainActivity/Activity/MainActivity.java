package id.slametriyadi.moviemvpjava.MainActivity.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.slametriyadi.moviemvpjava.MainActivity.Adapter.MovieAdapter;
import id.slametriyadi.moviemvpjava.MainActivity.Model.ProductionCompaniesItem;
import id.slametriyadi.moviemvpjava.MainActivity.Presenter.MoviePresenter;
import id.slametriyadi.moviemvpjava.MainActivity.View.MovieView;
import id.slametriyadi.moviemvpjava.R;

public class MainActivity extends AppCompatActivity implements MovieView {

    MoviePresenter presenter;
    @BindView(R.id.recyclerview)
    android.support.v7.widget.RecyclerView recyclerview;
    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MoviePresenter();
        onAttachView();
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, "" + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(List<ProductionCompaniesItem> dataFilm) {
        adapter = new MovieAdapter(dataFilm);
        recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
        presenter.ambilData();
    }

    @Override
    public void onDetachView() {
        presenter.onDetach();
    }
}
