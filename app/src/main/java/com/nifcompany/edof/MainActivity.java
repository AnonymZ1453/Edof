package com.nifcompany.edof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button fashion, otomotif ,elektro ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fashion = (Button)findViewById(R.id.BtnFashion);
        otomotif = (Button)findViewById(R.id.BtnOtomotif);
        elektro = (Button)findViewById(R.id.BtnElektro);

        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pencarian.class);
                startActivity(intent);

            }
        });
    }
}
