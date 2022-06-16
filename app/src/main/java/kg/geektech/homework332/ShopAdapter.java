package kg.geektech.homework332;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {
    private ArrayList<String> nameShops;

    public ShopAdapter(ArrayList<String> nameShops) {
        this.nameShops = nameShops;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ShopViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        holder.bind(nameShops.get(position));
    }

    @Override
    public int getItemCount() {
        return nameShops.size();
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {
        private TextView nameShopTv;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            nameShopTv = itemView.findViewById(R.id.shop_name_tv);
        }

        public void bind(String nameShop) {
            nameShopTv.setText(nameShop);
        }
    }
}
