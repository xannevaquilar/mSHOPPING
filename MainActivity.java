package com.ucucite.edu.mshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button G1, G2, Ga1, Ga2, H1, H2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        G1=(Button) findViewById(R.id.G1);
        G2=(Button) findViewById(R.id.G2);
        Ga1=(Button) findViewById(R.id.Ga1);
        Ga2=(Button) findViewById(R.id.Ga2);
        H1=(Button) findViewById(R.id.H1);
        H2=(Button) findViewById(R.id.H2);

        G1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGroceries();
            }
        });
    }

    public void openGroceries() {
        Intent intent = new Intent(this, Groceries.class);
        startActivity(intent);
    }


}