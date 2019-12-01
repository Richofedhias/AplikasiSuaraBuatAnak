package org.d3ifcool.soundforchildrens.Suara.Inggris;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.d3ifcool.soundforchildrens.Others.KategoriBahasaActivity;
import org.d3ifcool.soundforchildrens.Others.MainActivityBahasaInggris;
import org.d3ifcool.soundforchildrens.R;

public class Sounds extends AppCompatActivity {
    private ImageView hewan_binatang;
    private ImageView alat_musik;

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Sounds.this, MainActivityBahasaInggris.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);

        hewan_binatang = findViewById(R.id.suaraHewan);
        alat_musik = findViewById(R.id.suaraalatmusik);

//        final MediaPlayer mp = MediaPlayer.create(this,R.raw.kucing_1);


        hewan_binatang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sounds.this, BinatangHewan.class);
                startActivity(intent);
//                mp.start();
            }
        });

        alat_musik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sounds.this, BuahActivity.class);
                startActivity(intent);
            }
        });


    }
}
