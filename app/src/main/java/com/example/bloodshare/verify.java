package com.example.bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* Tanggal Pengerjaan : 29 April 2021
 * Nim                 : 10118084
 * Nama                : DIVI ADIFFIA FREZA ALANA
 * Kelas               : IF-2
 */
public class verify extends AppCompatActivity {
    Button btnverify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Intent intent = getIntent();

        btnverify = findViewById(R.id.verify);

        btnverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(verify.this,verify_account.class));
            }
        });
    }
}