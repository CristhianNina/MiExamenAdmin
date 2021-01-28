package com.example.quizadmin;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class Respuestas extends AppCompatActivity {

    TextView mTextViewRecibidoP1;
    TextView mTextViewRecibidoP2;
    TextView mTextViewRecibidoP3;
    TextView mTextViewRecibidoP4;
    TextView mTextViewRecibidoP5;
    TextView mTextViewRecibidoNombre;

    FirebaseFirestore mFirestore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuestas);

        mFirestore = FirebaseFirestore.getInstance();

        mTextViewRecibidoP1 = findViewById(R.id.textViewRecibidoP1);
        mTextViewRecibidoP2 = findViewById(R.id.textViewRecibidoP2);
        mTextViewRecibidoP3 = findViewById(R.id.textViewRecibidoP3);
        mTextViewRecibidoP4 = findViewById(R.id.textViewRecibidoP4);
        mTextViewRecibidoP5 = findViewById(R.id.textViewRecibidoP5);
        mTextViewRecibidoNombre = findViewById(R.id.textViewRecibidoNombre);


        obtenerDatos1();

        obtenerDatos2();

        obtenerDatos3();

        obtenerDatos4();

        obtenerDatos5();

        obtenerDatosNombre();

    }


    private void obtenerDatosNombre() {
        mFirestore.collection("Examen").document("Nombre_Est").addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                if (documentSnapshot.exists()) {
                    String i = documentSnapshot.getString("Nombre");
                    mTextViewRecibidoNombre.setText(i);
                }
            }
        });
    }



    private void obtenerDatos1() {
        mFirestore.collection("Examen").document("R1").addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                if (documentSnapshot.exists()) {
                    String i = documentSnapshot.getString("Respuesta1");
                    mTextViewRecibidoP1.setText(i);
                }
            }
        });
    }


    private void obtenerDatos2() {
        mFirestore.collection("Examen").document("R2").addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                if (documentSnapshot.exists()) {
                    String i = documentSnapshot.getString("Respuesta2");
                    mTextViewRecibidoP2.setText(i);
                }
            }
        });
    }


    private void obtenerDatos3() {
        mFirestore.collection("Examen").document("R3").addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                if (documentSnapshot.exists()) {
                    String i = documentSnapshot.getString("Respuesta3");
                    mTextViewRecibidoP3.setText(i);
                }
            }
        });
    }


    private void obtenerDatos4() {
        mFirestore.collection("Examen").document("R4").addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                if (documentSnapshot.exists()) {
                    String i = documentSnapshot.getString("Respuesta4");
                    mTextViewRecibidoP4.setText(i);
                }
            }
        });
    }


    private void obtenerDatos5() {
        mFirestore.collection("Examen").document("R5").addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                if (documentSnapshot.exists()) {
                    String i = documentSnapshot.getString("Respuesta5");
                    mTextViewRecibidoP5.setText(i);
                }
            }
        });
    }









}