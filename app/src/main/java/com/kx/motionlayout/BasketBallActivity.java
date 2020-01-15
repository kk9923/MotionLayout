package com.kx.motionlayout;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class BasketBallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basketball);
        final MotionLayout motionLayout = findViewById(R.id.motionLayout);
        motionLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float progress = motionLayout.getProgress();
                if (progress == 0){
                    motionLayout.transitionToEnd();
                }else  if (progress == 1){
                    motionLayout.transitionToStart();
                }
            }
        });
        motionLayout.setTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {
                System.out.println("onTransitionStarted");
            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {
                System.out.println(" onTransitionChange i = " + i +"  i1 =  " +  i1);
            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {
                System.out.println("onTransitionCompleted");
            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

            }
        });
    }
}
