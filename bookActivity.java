package com.example.aomek.piggold;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class bookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        /// Button to addActivity
        ImageView addPigButton = findViewById(R.id.addPig_button);
        addPigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(bookActivity.this, addActivity.class);
                startActivity(i);
            }
        });
    }
}
