package com.example.it_fest_covid_situation.timer;

import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageTimer extends CountDownTimer {
    private ImageView imageView;
    private TextView textView;
    private String text;

    private static final long START_TIME = 2000;
    private static final long INTERVAL = 10;

    private Float alha = 0.0f;

    public ImageTimer(ImageView imageView, Integer imageId, TextView textView, String text) {
        super(START_TIME, INTERVAL);
        this.imageView = imageView;
        this.textView = textView;
        this.text = text;
        this.imageView.setImageResource( imageId );
        this.imageView.setAlpha(alha);
        this.textView.setText( text );
    }

    @Override
    public void onTick(long l) {
        alha += 0.01f;
        imageView.setAlpha(alha);
        textView.setAlpha(alha);
    }

    @Override
    public void onFinish() {
        textView.setText( text );
    }
}