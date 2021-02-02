package com.example.fun_background;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public Random rand=new Random();
    public ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
    }
    public void changebg(View view)
    {
        int color= Color.argb(255,rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
       layout.setBackgroundColor(color);

    }
}
