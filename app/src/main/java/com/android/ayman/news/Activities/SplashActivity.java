package com.android.ayman.news.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        StartAnimations();
    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim);
        anim.reset();
       // RelativeLayout l=(RelativeLayout) findViewById(R.id.activity_splash);
        ImageView iv1 = (ImageView) findViewById(R.id.imageView);
        iv1.clearAnimation();
        iv1.startAnimation(anim);
         anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.clearAnimation();
        iv.startAnimation(anim);

        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 5000) {
                        sleep(100);
                        waited += 100;
                    }
                    finish();

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);//Home_MainActivity ActivityClientView
                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

                        startActivity(intent);

                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    finish();
                }

            }
        };
        splashTread.start();

    }
}
