package com.kx.motionlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }

    public void motion1(View view) {
        start(MotionActivity.class);
    }
    public void motion2(View view) {
        start(Motion2Activity.class);
    }

    public void basketBall(View view) {
        start(BasketBallActivity.class);
    }

    private void start(Class<? extends Activity> aClass){
        startActivity(new Intent(this,aClass));
    }
}
