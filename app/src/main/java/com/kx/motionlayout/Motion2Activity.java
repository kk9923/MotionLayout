package com.kx.motionlayout;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class Motion2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_02);
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
    }
}
