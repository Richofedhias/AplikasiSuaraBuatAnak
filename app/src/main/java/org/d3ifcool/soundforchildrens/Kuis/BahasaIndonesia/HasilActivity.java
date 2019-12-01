package org.d3ifcool.soundforchildrens.Kuis.BahasaIndonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.d3ifcool.soundforchildrens.Kuis.BahasaInggris.HasilKuisActivity;
import org.d3ifcool.soundforchildrens.Kuis.BahasaInggris.QuizActivity;
import org.d3ifcool.soundforchildrens.Others.MainActivity;
import org.d3ifcool.soundforchildrens.R;

public class HasilActivity extends AppCompatActivity {
    private Button mainmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        getSupportActionBar().setTitle("Nilai");
        TextView txtScore =  findViewById(R.id.textScore);
        TextView txtHighScore = findViewById(R.id.highscore);
        mainmenu = findViewById(R.id.btn_mainMenu);

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HasilActivity.this, MainActivity.class));
                finish();
            }
        });


        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Skormu: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("Skor Tertinggi: "+highscore);
        else
        {
            txtHighScore.setText("Skor Baru Tertinggi: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HasilActivity.this, QuizActivity.class);
        startActivity(intent);
        finish();
    }

}


