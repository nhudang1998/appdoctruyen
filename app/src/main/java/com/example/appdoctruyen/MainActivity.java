package com.example.appdoctruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.appdoctruyen.adapter.TruyenTranhAdapter;
import com.example.appdoctruyen.object.TruyenTranh;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gdvDSTruyen;
    TruyenTranhAdapter adapter;
    ArrayList<TruyenTranh> truyenTranhArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anXa();
        setUp();
        setClick();
    }
    private void init(){
        truyenTranhArrayList = new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh( "NANYAK",  "Chapter 14",  "http://st.truyenchon.com/data/comics/218/nanyak.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Hải Cẩu Bay Lắc", "Chapter 6","http://st.truyenchon.com/data/comics/222/hai-cau-bay-lac.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Tôi Lên Cấp Chỉ Bằng Cách Ăn", "Chapter 4","http://st.truyenchon.com/data/comics/143/toi-len-cap-chi-bang-cach-an.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Hoạn Phi Hoàn Triều", "Chapter 60","http://st.truyenchon.com/data/comics/255/hoan-phi-hoan-trieu.jpg"));
        adapter= new TruyenTranhAdapter(this, 0, truyenTranhArrayList);

    }
    private void anXa() {
        gdvDSTruyen = findViewById(R.id.gdvDSTruyen);
    }
    private void setUp(){
        gdvDSTruyen.setAdapter(adapter);
    }
    private void setClick(){}


    }

