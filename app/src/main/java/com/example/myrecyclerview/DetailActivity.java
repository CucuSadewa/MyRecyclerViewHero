package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvDetail;
    ImageView imgPhoto;

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_DETAIL = "extra_detail";
    public static String EXTRA_PHOTO = "extra_photo";
    String title ="Detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        tvName = findViewById(R.id.tv_name_detail);
        tvDetail = findViewById(R.id.tv_detail_detail);
        imgPhoto = findViewById(R.id.image_detail);

        Hero mHero = getIntent().getParcelableExtra(EXTRA_NAME);
        tvName.setText(mHero.getName());
        tvDetail.setText(mHero.getDetail());

        Glide.with(this).load(mHero.getPhoto()).into(imgPhoto);
    }
}
