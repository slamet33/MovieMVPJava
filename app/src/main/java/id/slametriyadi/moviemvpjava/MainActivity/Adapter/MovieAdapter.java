package id.slametriyadi.moviemvpjava.MainActivity.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.slametriyadi.moviemvpjava.MainActivity.Model.ProductionCompaniesItem;
import id.slametriyadi.moviemvpjava.R;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    List<ProductionCompaniesItem> productionCompaniesItems;

    public MovieAdapter(List<ProductionCompaniesItem> dataFilm) {
        this.productionCompaniesItems = dataFilm;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, null);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvName.setText(productionCompaniesItems.get(position).getName());
        holder.tvOriginCountry.setText(productionCompaniesItems.get(position).getOriginCountry());

    }

    @Override
    public int getItemCount() {
        return productionCompaniesItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvOriginCountry;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvname);
            tvOriginCountry = itemView.findViewById(R.id.tvorigincountry);
            image = itemView.findViewById(R.id.imglogopath);
        }
    }
}
