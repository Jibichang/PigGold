package com.example.aomek.piggold;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class addActivity extends AppCompatActivity {

    private Spinner typeOut;
    private ArrayList<String> arrayType = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        /// Button to bookActivity
        ImageView bookPigButton = findViewById(R.id.bookPig_button);
        bookPigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(addActivity.this, bookActivity.class);
                startActivity(i);
            }
        });

        /// set Spinner Type
        final Spinner typeSpinner = findViewById(R.id.type_dropdown);
        setSpinner();
        ArrayAdapter<String> adapterType = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, arrayType);
        typeSpinner.setAdapter(adapterType);


        ///
        ImageView addButton = findViewById(R.id.addPig_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectType = typeSpinner.getSelectedItem().toString();
                Toast.makeText(addActivity.this, selectType,
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setSpinner(){
        arrayType.add("อาหาร");
        arrayType.add("ปิลต่างๆ");
        arrayType.add("เดินทาง");
        arrayType.add("ส่วนตัว");
        arrayType.add("ที่พักอาศัย");
        arrayType.add("บันเทิง");
        arrayType.add("อื่นๆ");

    }
}
