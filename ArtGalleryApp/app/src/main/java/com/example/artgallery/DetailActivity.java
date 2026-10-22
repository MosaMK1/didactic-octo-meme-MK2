
package com.example.artgallery;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView img = findViewById(R.id.fullImage);
        img.setImageResource(getIntent().getIntExtra("image", 0));
    }
}
