package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtTitle;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTitle = findViewById(R.id.txtText);
        image = findViewById(R.id.imageTitle);



        String name = "Picture";
       String name2 = "Adelina";

       txtTitle.setText(name);








       image.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (txtTitle.getText().equals(name)){
                   txtTitle.setText(name2);
               }else {

                   txtTitle.setText(name);
               }
           }
       });

    }
}