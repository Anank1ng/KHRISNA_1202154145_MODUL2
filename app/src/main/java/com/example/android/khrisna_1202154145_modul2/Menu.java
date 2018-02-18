package com.example.android.khrisna_1202154145_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // ini digunakan untuk deklarasi objek yang ada
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();

    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData() {
        for (int i = 0; i < 3; i++) {
            //digunakan untuk memanggil isi dari nama menu masakan yang ada
            foods.add("Ayam Goreng hot");
            foods.add("capcay special mang deden");
            foods.add("nasgor ala ala mang udin");
            foods.add("tumis kangkung kemarin");

            // memanggil jumlah harga dari setiap menu yang ada
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(30000);
            priceses.add(25000);

            // Memanggil gambar berdasarkan resource drawable yang ada
            photos.add(R.drawable.ayam_goreng);
            photos.add(R.drawable.capcay);
            photos.add(R.drawable.nasgor);
            photos.add(R.drawable.tumis_kangkung);

        }
    }
}