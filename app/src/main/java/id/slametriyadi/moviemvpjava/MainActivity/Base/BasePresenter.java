package id.slametriyadi.moviemvpjava.MainActivity.Base;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T view);
    void onDetach();
}
