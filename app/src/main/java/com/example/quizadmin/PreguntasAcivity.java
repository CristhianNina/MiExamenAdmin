package com.example.quizadmin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class PreguntasAcivity extends AppCompatActivity {

    EditText mEditTextP1;
    EditText mEditTextP2;
    EditText mEditTextP3;
    EditText mEditTextP5;
    EditText mEditTextP4;

    Button mButtonCrearDatos;

    FirebaseFirestore mFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_acivity);

        mFirestore = FirebaseFirestore.getInstance();
        mEditTextP1 = findViewById(R.id.editTextP1);
        mEditTextP2 = findViewById(R.id.editTextP2);
        mEditTextP3 = findViewById(R.id.editTextP3);
        mEditTextP4 = findViewById(R.id.editTextP4);
        mEditTextP5 = findViewById(R.id.editTextP5);

        mButtonCrearDatos = findViewById(R.id.btnCrearDatos);


        mButtonCrearDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                crearDatos1();

                crearDatos2();

                crearDatos3();

                crearDatos4();

                crearDatos5();

            }
        });



    }


    private void crearDatos1() {
        //convertimos
        String pregunta1 = mEditTextP1.getText().toString();
        //cramos campos enFirebase
        Map<String, Object> map = new HashMap<>();
        map.put("Pregunta1",pregunta1);

        mFirestore.collection("Examen").document("1").set(map).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(PreguntasAcivity.this, "Se enviaron los datos CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(PreguntasAcivity.this, "No se pudieron crear los datos", Toast.LENGTH_SHORT).show();
            }
        });

    }







    private void crearDatos2() {
        //convertimos
        String pregunta2 = mEditTextP2.getText().toString();
        //cramos campos enFirebase
        Map<String, Object> map = new HashMap<>();
        map.put("Pregunta2",pregunta2);

        mFirestore.collection("Examen").document("2").set(map).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(PreguntasAcivity.this, "Se enviaron los datos CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(PreguntasAcivity.this, "No se pudieron crear los datos", Toast.LENGTH_SHORT).show();
            }
        });

    }






    private void crearDatos3() {
        //convertimos
        String pregunta3 = mEditTextP3.getText().toString();
        //cramos campos enFirebase
        Map<String, Object> map = new HashMap<>();
        map.put("Pregunta3",pregunta3);

        mFirestore.collection("Examen").document("3").set(map).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(PreguntasAcivity.this, "Se enviaron los datos CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(PreguntasAcivity.this, "No se pudieron crear los datos", Toast.LENGTH_SHORT).show();
            }
        });

    }







    private void crearDatos4() {
        //convertimos
        String pregunta4 = mEditTextP4.getText().toString();
        //cramos campos enFirebase
        Map<String, Object> map = new HashMap<>();
        map.put("Pregunta4",pregunta4);

        mFirestore.collection("Examen").document("4").set(map).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(PreguntasAcivity.this, "Se enviaron los datos CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(PreguntasAcivity.this, "No se pudieron crear los datos", Toast.LENGTH_SHORT).show();
            }
        });

    }





    private void crearDatos5() {
        //convertimos
        String pregunta1 = mEditTextP5.getText().toString();
        //cramos campos enFirebase
        Map<String, Object> map = new HashMap<>();
        map.put("Pregunta5",pregunta1);

        mFirestore.collection("Examen").document("5").set(map).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(PreguntasAcivity.this, "Se enviaron los datos CORRECTAMENTE", Toast.LENGTH_SHORT).show();
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(PreguntasAcivity.this, "No se pudieron crear los datos", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void IraRespuestas(View view){
        Intent respuestas = new Intent(this, Respuestas.class);
        startActivity(respuestas);

    }





}