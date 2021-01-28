package com.example.quizadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }



    public void Main(View view){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);

    }

    public void Preguntas(View view){
        Intent pregunta = new Intent(this, PreguntasAcivity.class);
        startActivity(pregunta);

    }




}