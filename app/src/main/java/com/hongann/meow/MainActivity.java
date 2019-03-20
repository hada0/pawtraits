package com.hongann.meow;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //set to main layout xml
            setContentView(R.layout.activity_main);
            findViewById(R.id.cat1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<Integer> catPics = new ArrayList<>();
                    catPics.add(R.drawable.cat2);
                    catPics.add(R.drawable.cat3);
                    catPics.add(R.drawable.cat4);
                    catPics.add(R.drawable.cat5);
                    startCatActivity(R.drawable.cat1, catPics);
                }
            });
            findViewById(R.id.cat2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<Integer> catPics = new ArrayList<>();
                    catPics.add(R.drawable.cat1);
                    catPics.add(R.drawable.cat3);
                    catPics.add(R.drawable.cat4);
                    catPics.add(R.drawable.cat5);
                    startCatActivity(R.drawable.cat2, catPics);
                }
            });
            findViewById(R.id.cat3).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<Integer> catPics = new ArrayList<>();
                    catPics.add(R.drawable.cat1);
                    catPics.add(R.drawable.cat2);
                    catPics.add(R.drawable.cat4);
                    catPics.add(R.drawable.cat5);
                    startCatActivity(R.drawable.cat3, catPics);
                }
            });
            findViewById(R.id.cat4).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<Integer> catPics = new ArrayList<>();
                    catPics.add(R.drawable.cat1);
                    catPics.add(R.drawable.cat2);
                    catPics.add(R.drawable.cat3);
                    catPics.add(R.drawable.cat5);
                    startCatActivity(R.drawable.cat4, catPics);
                }
            });
            findViewById(R.id.cat5).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ArrayList<Integer> catPics = new ArrayList<>();
                    catPics.add(R.drawable.cat1);
                    catPics.add(R.drawable.cat2);
                    catPics.add(R.drawable.cat3);
                    catPics.add(R.drawable.cat4);
                    startCatActivity(R.drawable.cat5, catPics);
                }
            });

            Button exitButton1 = this.findViewById(R.id.exitButton);
            exitButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MainActivity.this.finish();
                }
            });
        }

    @SuppressLint("NewApi")
    private void startCatActivity(int drawable, ArrayList<Integer> catPics) {
        Intent intent = new Intent();
        intent.setClass(this, CatActivity.class);
        Bundle options = new Bundle();
        //depending on photo clicked and the list of images to see, these are added to the bundle.
        options.putInt(CatActivity.PARAM_IMAGE_KEY, drawable);
        options.putIntegerArrayList("cat_list", catPics);
        intent.putExtras(options);
        this.startActivity(intent);
    }
}