package org.d3ifcool.soundforchildrens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class ViewScore extends AppCompatActivity {

    private Button btn,animasi;
    private TextView scoreAkhir;
    private int score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_score);


        score = getIntent().getIntExtra("score", 0);
        String nilai = String.valueOf(score);

        btn = findViewById(R.id.btn);

        scoreAkhir = findViewById(R.id.scoreAkhir);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewScore.this, MainActivity.class);
                startActivity(intent);
            }
        });

        animasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }


}
