package com.appcatalogofm.fmburguers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cda3 (View v){
        Intent intent = new Intent(this, Cadastro2Activity.class);
        startActivity(intent);
    }

    public void voltar2 (View v){
        Intent isa = new Intent(this,Login.class);
        startActivity(isa);
    }
}

