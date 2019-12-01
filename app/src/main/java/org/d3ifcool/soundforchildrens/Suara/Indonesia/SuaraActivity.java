package org.d3ifcool.soundforchildrens.Suara.Indonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.d3ifcool.soundforchildrens.R;

public class SuaraActivity extends AppCompatActivity {
    private ImageView hewan_binatang;
    private ImageView alat_musik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suara);

        hewan_binatang = findViewById(R.id.suaraHewan);
        alat_musik = findViewById(R.id.suaraalatmusik);


        hewan_binatang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuaraActivity.this, BinatangHewanIndonesiaActivity.class);
                startActivity(intent);
//                mp.start();
            }
        });

        alat_musik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuaraActivity.this, BuahActivityIndonesia.class);
                startActivity(intent);
            }
        });
    }
}
