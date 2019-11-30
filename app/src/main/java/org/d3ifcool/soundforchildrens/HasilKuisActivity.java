package org.d3ifcool.soundforchildrens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilKuisActivity extends AppCompatActivity {
    private Button mainmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);
        getSupportActionBar().setTitle("Score");
        TextView txtScore =  findViewById(R.id.textScore);
        mainmenu = findViewById(R.id.btn_mainMenu);

        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HasilKuisActivity.this, MainActivity.class));
                finish();
            }
        });
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Your score: " + score);
    }
    public void onClick(View view) {
        Intent intent = new Intent(HasilKuisActivity.this, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}
