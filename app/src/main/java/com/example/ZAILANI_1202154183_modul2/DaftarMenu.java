package com.example.ZAILANI_1202154183_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adaptermenu;

    public static ArrayList<model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<model> menuisi() {
        ArrayList<model> isi = new ArrayList<>();
        isi.add(new model("BAKSO KU",1500,R.drawable.baksoku,"Nasi dengan bakso"));
        isi.add(new model(" CENDOL KU",2500,R.drawable.cendolku,"cendol dengan santan diluar"));
        isi.add(new model("LELE KU",1000,R.drawable.leleku,"nasi dengan lele sambal"));
        isi.add(new model("TEMPE KU",1000,R.drawable.tempeku,"Tempe orak arik"));
        isi.add(new model("RENDANG KU",1000,R.drawable.rendangku,"rendang padang "));
        return  isi;
    }
}
