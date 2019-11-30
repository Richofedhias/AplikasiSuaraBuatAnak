package org.d3ifcool.soundforchildrens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class CreditActivity extends AppCompatActivity {
    private TextView tvCredit;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);
        getSupportActionBar().setTitle("Credit");

        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.credit);
        tvCredit = (TextView) findViewById(R.id.tv_credit);
        tvCredit.setText("CREDITS \n"+"Avocado icon - Icon made by Freepik www.flaticon.com \n"
                +"Banana icon - Icon made by Freepik www.flaticon.com \n"+"Raspberry icon - Icon made by Smashicons www.flaticon.com \n"
        +"Blueberry icon - Icon made by Smashicons www.flaticon.com \n" + "Pumkin icon - Icon made by Smashicons www.flaticon.com \n"
        +"Lime icon - Icon made by Smashicons www.flaticon.com \n" + "Pear icon - Icon made by Smashicons www.flaticon.com \n"
        +"Pineapple icon - Icon made by Smashicons www.flaticon.com \n"+"Cherry icon - Icon made by Smashicons www.flaticon.com \n"
        +"Lemon icon - Icon made by Smashicons www.flaticon.com \n" + "Grape icon - Icon made by Smashicons www.flaticon.com \n"
        +"Strawberry icon - Icon made by Smashicons www.flaticon.com \n"+"Apple icon - Icon made by Smashicons www.flaticon.com \n"
        +"Orange icon - Icon made by Smashicons www.flaticon.com \n"+"Swan icon - Icon made by Smashicons www.flaticon.com \n"
        +"Frog icon - Icon made by Flat Icons www.flaticon.com \n"+"Cow icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Chicken icon - Icon made by Flat Icons www.flaticon.com \n"+"Pig icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Sheep icon - Icon made by Flat Icons www.flaticon.com \n"+"Cat icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Lion icon - Icon made by Flat Icons www.flaticon.com \n"+"Dog icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Elephant icon - Icon made by Flat Icons www.flaticon.com \n"+"Eagle icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Tigger icon - Icon made by Flat Icons www.flaticon.com \n"+"Duck icon - Icon made by Monkik www.flaticon.com \n"
        +"Cricket icon - Icon made by Flat Icons www.flaticon.com \n"+"Snake icon - Icon made by Flat Icons www.flaticon.com \n"
        +"Sound icon - Icon made by Prosymbols www.flaticon.com \n"+"Button - Icon made by Freepik www.flaticon.com \n"
        +"Game Controll icon - Icon made by Smashicons www.flaticon.com \n"+"Leaf icon - Icon made by Good Ware www.flaticon.com \n"
        +"Drop icon - Icon made by Vectors Market www.flaticon.com \n");

        tvCredit.startAnimation(animation);
    }
}
