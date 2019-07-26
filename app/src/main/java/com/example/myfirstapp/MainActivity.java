package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void colorized(View view, int color, int style) {


        Button button = findViewById(R.id.button);
        ImageView svg = findViewById(R.id.imageView7);


        view.setBackgroundResource(color);

        button.setBackgroundResource(color);

        ContextThemeWrapper wrapper = new ContextThemeWrapper(this, style);


        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ic_androidsvg10, wrapper.getTheme());
        svg.setImageDrawable(drawable);


    }


    public void ChangeColor(View view) {


        view = this.getWindow().getDecorView();
        Button button = findViewById(R.id.button);
        TextView time = findViewById(R.id.time);
        TextView logo = findViewById(R.id.textView);

        TimeStamp timeStamp = new TimeStamp();
        long last = timeStamp.getDate();


        if (last == 1 || last == 2 || last == 6) {

            button.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
            time.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
            logo.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));


        } else {

            button.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
            time.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
            logo.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));

        }

        if (last == 0) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.white, R.style.WhiteAndroid);


        } else if (last == 1) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.black, R.style.BlackAndroid);
            button.setBackgroundResource(R.color.white);


        } else if (last == 2) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.blue, R.style.BlueAndroid);

        } else if (last == 3) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.green, R.style.GreenAndroid);

        } else if (last == 4) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.pink, R.style.PinkAndroid);

        } else if (last == 5) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.red, R.style.RedAndroid);

        } else if (last == 6) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.purple, R.style.PurpleAndroid);

        } else if (last == 7) {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.yellow, R.style.YellowAndroid);

        } else if (last == 8) {

            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.grey, R.style.GreyAndroid);

        } else {


            time.setText(String.valueOf(timeStamp.getTime()));
            colorized(view, R.color.lilac, R.style.LilacAndroid);
        }

    }

}