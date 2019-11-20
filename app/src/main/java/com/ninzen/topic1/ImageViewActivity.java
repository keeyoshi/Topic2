package com.ninzen.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class ImageViewActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton radioCake, radioPie, radioBlueberry;
    ImageView ivImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        radioCake=findViewById(R.id.Cake);
        radioBlueberry=findViewById(R.id.Blueberry);
        radioPie=findViewById(R.id.Pie);
        ivImage=findViewById(R.id.tvImage);
        radioCake.setOnClickListener(this);
        radioPie.setOnClickListener(this);
        radioBlueberry.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Cake:
                ivImage.setImageResource(R.drawable.cake);
                break;
            case R.id.Blueberry:
                ivImage.setImageResource(R.drawable.blueberry);
                break;
            case R.id.Pie:
                ivImage.setImageResource(R.drawable.pie);
                break;

        }
    }
}
