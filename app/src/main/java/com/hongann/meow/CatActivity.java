package com.hongann.meow;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CatActivity extends AppCompatActivity {

    public static final String PARAM_IMAGE_KEY = "photo";
    public int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        final Bundle items = getIntent().getExtras();

        //set imageview to the photo that was clicked (added to bundle)
        ImageView imageView1 = this.findViewById(R.id.imageBefore);
        imageView1.setImageResource(items.getInt(PARAM_IMAGE_KEY));

        //if photo is clicked, initiate the transition
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CatActivity.this.transition(items);
            }
        });
    }

    private void transition(final Bundle items) {
        //TODO: index should refer to the arraylist.length() - not an integer, so that they can have any number of photos.
        //TODO: if the index == to arraylist.length(), index = 0
        //TODO: if the index == starting index, return;
        //TODO: transition to left and right - use GestureListener?
        if (index == 4) {
            return;
        }

        ViewGroup rootScene = this.findViewById(R.id.activity_cat);
        //create a copy of the imageView2 to set it to the next image (transition to).
        ImageView imageView2 = (ImageView) this.getLayoutInflater().inflate(R.layout.image_before, rootScene, false);
        imageView2.setImageResource(items.getIntegerArrayList("cat_list").get(index));
        //increment index to update the next transition photo
        index++;
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CatActivity.this.transition(items);
            }
        });
        //create next scene to move to (from current)
        Scene afterScene = new Scene(rootScene, imageView2);
        Transition fadeTransition = new Fade();
        TransitionManager.go(afterScene, fadeTransition);
    }
}
