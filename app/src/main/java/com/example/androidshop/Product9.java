package com.example.androidshop;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Product9 extends AppCompatActivity {
    ImageView img1;
    TextView text1;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product9);

        img1=(ImageView)findViewById(R.id.imageView016);
        text1=(TextView)findViewById(R.id.textView0016);
        img=(ImageView)findViewById(R.id.imageView21);

        String url = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/admin_img%2Fproduct1.png?alt=media&token=e713db8e-e3d8-4ec9-9d1e-c9ec0bc9d5e6";
        String url1 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/admin_img%2FVector.png?alt=media&token=5a33a36d-1ab2-4861-9760-e943b322b412";

        Glide.with(getApplicationContext()).load(url).into(img);
        Glide.with(getApplicationContext()).load(url1).into(img1);


        imageClick1();
        imageClick2();

    }

    public void imageClick1 () {
        img1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Product9.this, Products.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick2 () {
        text1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Product9.this, Products.class);
                        startActivity(intent);
                    }
                }
        );
    }

}