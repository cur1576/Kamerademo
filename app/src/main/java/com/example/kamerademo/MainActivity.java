package com.example.kamerademo;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_foto:
                intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                break;
            case R.id.btn_video:
                intent = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                break;
            default:
                return;
        }
        startActivity(intent);
    }
}

