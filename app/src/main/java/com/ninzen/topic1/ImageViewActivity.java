package com.ninzen.topic1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class ImageViewActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton radioCake, radioPie, radioBlueberry, radioClose;
    ImageView ivImage;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        radioCake=findViewById(R.id.Cake);
        radioBlueberry=findViewById(R.id.Blueberry);
        radioPie=findViewById(R.id.Pie);
        radioClose=findViewById(R.id.Close);
        ivImage=findViewById(R.id.tvImage);
        radioCake.setOnClickListener(this);
        radioPie.setOnClickListener(this);
        radioBlueberry.setOnClickListener(this);
        radioClose.setOnClickListener(this);
        builder=new AlertDialog.Builder(this);


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
            case R.id.Close:
                builder.setMessage("Do you want to open the Image Cake").setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(ImageViewActivity.this, "The image is shown", Toast.LENGTH_SHORT).show();
                                ivImage.setImageResource(R.drawable.cake);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                Toast.makeText(ImageViewActivity.this, "The image was canceld", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog= builder.create();
                dialog.setTitle("Open dialog for Cake");
                dialog.show();
                break;

        }
    }
}
