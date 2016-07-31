package com.rojasjuniore.tiposdefloatingactionbutton;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ActividaPrincipal extends AppCompatActivity implements View.OnClickListener {




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activida_principal);

        ImageButton caso1, caso2, caso3, caso4, caso5, caso6, caso7;
        caso1 = (ImageButton) findViewById(R.id.caso1);
        caso1.setOnClickListener(this);

        caso2 = (ImageButton) findViewById(R.id.caso2);
        caso2.setOnClickListener(this);

        caso3 = (ImageButton) findViewById(R.id.caso3);
        caso3.setOnClickListener(this);

        caso4 = (ImageButton) findViewById(R.id.caso4);
        caso4.setOnClickListener(this);

        caso5 = (ImageButton) findViewById(R.id.caso5);
        caso5.setOnClickListener(this);

        caso6 = (ImageButton) findViewById(R.id.caso6);
        caso6.setOnClickListener(this);

        caso7 = (ImageButton) findViewById(R.id.caso7);
        caso7.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.caso1:
                Intent intent1 = new Intent(ActividaPrincipal.this, FloatingActionButton_1.class);
                startActivity(intent1);
                break;
            case R.id.caso2:
                Intent intent2 = new Intent(ActividaPrincipal.this, FloatingActionButton_2.class);
                startActivity(intent2);
                break;
            case R.id.caso3:
                Intent intent3 = new Intent(ActividaPrincipal.this, FloatingActionButton_3.class);
                startActivity(intent3);
                break;
            case R.id.caso4:
                Intent intent4 = new Intent(ActividaPrincipal.this, FloatingActionButton_4.class);
                startActivity(intent4);
                break;
            case R.id.caso5:
                Intent intent5 = new Intent(ActividaPrincipal.this, FloatingActionButton_5.class);
                startActivity(intent5);
                break;
            case R.id.caso6:
                Intent intent6 = new Intent(ActividaPrincipal.this, FloatingActionButton_6.class);
                startActivity(intent6);
                break;
            case R.id.caso7:
                Intent intent7 = new Intent(ActividaPrincipal.this, FloatingActionButton_7.class);
                startActivity(intent7);
                break;

        }

    }
}

