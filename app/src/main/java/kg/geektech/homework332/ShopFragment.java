package kg.geektech.homework332;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ShopFragment extends Fragment {
    private ArrayList<String> nameShops;
    private RecyclerView recyclerView;
    private ShopAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shop, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new ShopAdapter(nameShops);
        recyclerView = view.findViewById(R.id.shop_recycler);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        nameShops = new ArrayList<>();
        nameShops.add("Чай Greenfield");
        nameShops.add("Чай Tess");
        nameShops.add("Чай Lipton");
        nameShops.add("Булочки со сгущенкой");
        nameShops.add("Булочки с сыром");
        nameShops.add("Мороженое Bahroma");
        nameShops.add("Мороженое Бомба");
        nameShops.add("Картошка");
        nameShops.add("Лук");
        nameShops.add("Сыр");
        nameShops.add("Чеснок");
        nameShops.add("Грибы вешенки");
        nameShops.add("Грибы шампиньоны");
        nameShops.add("Грибы лисички");
    }
}