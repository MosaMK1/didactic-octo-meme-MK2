
package com.example.artgallery;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.art1, R.drawable.art2, R.drawable.art3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView grid = findViewById(R.id.gridView);
        grid.setAdapter(new ImageAdapter(this, images));

        grid.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Artwork selected", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("image", images[position]);
            startActivity(i);
        });
    }
}
