package com.ifsc.aluno.leticia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button welcomeButton = findViewById(R.id.welcomeButton);
        welcomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //inicializa as informações necessárias para criar uma mensagem Toast
                Context contexto = MainActivity.this;
                CharSequence mensagem = getResources().getString(R.string.welcomeToast);
                int duracao = Toast.LENGTH_SHORT;
                //cria uma mensagem Toast com as informações acima
                Toast myToast = Toast.makeText(contexto, mensagem, duracao);
                //manda mostrar a mensagem Toast
                myToast.show();
            }
        });
    }
}