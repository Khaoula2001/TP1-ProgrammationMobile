package com.emsi.tp1_mobile_aitbelmehdi_khaoula;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText nom;
    private EditText phone;
    private EditText email;
    private Spinner villes;
    private RadioButton f, m;
    private Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        email = findViewById(R.id.email);
        bn = findViewById(R.id.bn);
        phone = findViewById(R.id.phone);
        villes = findViewById(R.id.villes);
        m = findViewById(R.id.m);
        f = findViewById(R.id.f);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genre = m.isChecked() ? "Homme" : (f.isChecked() ? "Femme" : "");
                String ville = villes.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("email", nom.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("genre", genre);
                intent.putExtra("ville", ville);
                startActivity(intent);
            }
        });
    }

}