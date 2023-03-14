package com.ifsc.aluno.leticia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button welcomeButton = findViewById(R.id.welcomeButton);
        welcomeButton.setOnClickListener(view -> { minhaAcao(); });

        Button trocaImagemButton = findViewById(R.id.trocaImagemButton);

        ImageView imagem = findViewById(R.id.welcomeImageView);

        trocaImagemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagem.setImageResource(R.drawable.androidpipo);
            }
        });

    }



    void minhaAcao(){
        Toast.makeText(
                this,               //Contexto da aplicação
                R.string.welcomeToast,     //Mensagem textual
                Toast.LENGTH_SHORT        //Tempo de duração
        ).show();                  //show => mostrar mensagem (IMPORTANTE)
    }



}