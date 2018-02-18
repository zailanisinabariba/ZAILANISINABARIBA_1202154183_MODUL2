package com.example.ZAILANI_1202154183_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class MenuDetail extends AppCompatActivity {
    private ArrayList<model>menu;
    private String idmenu;
    private TextView nama,harga,deskripsi;
    private ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        nama =(TextView)findViewById(R.id.lblDetailNama);
        harga = (TextView)findViewById(R.id.lblDetailHarga);
        deskripsi = (TextView)findViewById(R.id.lblDetailDeskripsi);
        gambar = (ImageView)findViewById(R.id.lblDetailGambar);

        menu = DaftarMenu.menuList;
        Intent intent = getIntent();
        idmenu = intent.getStringExtra("MenuId");
        model makanan = menu.get(Integer.parseInt(idmenu));
        nama.setText(makanan.getNama());
        setTitle(makanan.getNama());
        harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(makanan.getHarga()));
        deskripsi.setText(makanan.getDeskripsi());
        gambar.setImageResource(makanan.getGambar());

    }
}
