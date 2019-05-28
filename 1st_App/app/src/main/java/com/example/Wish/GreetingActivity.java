package com.example.Wish;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class GreetingActivity extends AppCompatActivity {


    private TextView greet;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        greet  = (TextView)findViewById(R.id.greet);

        greet.setText("       Happy Birthday "+getIntent().getStringExtra("Happy_Birthday"));

        VideoView videoview = findViewById(R.id.videoview);

        String videopath ="android.resource://"+ getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videopath);

        videoview.setVideoURI(uri);

        MediaController controller = new MediaController(this);
        videoview.setMediaController(controller);
        controller.setAnchorView(videoview);



    }
}
