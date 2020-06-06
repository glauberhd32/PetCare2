package com.glauberhd.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {
    private Button btnVoltaLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnVoltaLogin = findViewById(R.id.btn_Finalizar_Cadastro);

        btnVoltaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CadastroActivity.this,MainActivity.class));
                Toast.makeText(getApplicationContext(),"Cadastro finalizado" ,Toast.LENGTH_LONG).show();
            }
        });
    }
}
