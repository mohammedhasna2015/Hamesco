package com.hamesco.org;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SplachActivity extends AppCompatActivity {
    private long displaySplash=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            if (Build.VERSION.SDK_INT >= 17) {
                View decorView =getWindow().getDecorView();
                // Hide the status bar.
                int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
                decorView.setSystemUiVisibility(uiOptions);
                //// Remember that you should never show the action bar if the
                //// status bar is hidden, so hide that too if necessary.
            }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplachActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, displaySplash);

    }
}
