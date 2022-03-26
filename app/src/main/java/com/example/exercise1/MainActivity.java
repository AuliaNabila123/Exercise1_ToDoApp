package com.example.exercise1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        //Deklarasi variabel untuk button
        Button btnLogin;

        //Deklarasi variabel untuk EditText
        EditText ednama, edpassword;

        //Deklarasi varabel untuk menyimpan email dan password
        String nama, password;

        TextView register;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //Menghubungkan variabel btnLogin dengan componen button pada Layout
            btnLogin = findViewById(R.id.btSignin);

            //Menghubungkan variabel edemail dengan componen button pada Layout
            ednama = findViewById(R.id.edNama);

            //Menghubungkan variabel edpassword dengan componen button pada Layout
            edpassword = findViewById(R.id.edPassword);

            register = findViewById(R.id.Register);
            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, RegristrasiActivity.class);
                    startActivity(i);
                }
            });

            //Membuat fungsi onclik pada button btnLogin
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    //Menyimpan input user di edittext email kedalam variabel nama
                    nama = ednama.getText().toString();

                    //Menyimpan input user di edittext password kedalam variabel password
                    password = edpassword.getText().toString();

                    if (nama.equals("Nabila") && password.equals("nabila")) {
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();

                        Bundle b = new Bundle();
                        //key parsing data dimasukkan kedalam bundele
                        b.putString("data1", nama.trim());

                        //membuat objek untuk pindah halaman
                        Intent i = new Intent(MainActivity.this, TaskActivity.class);
                        //Memasukkan bundel kedalam intent
                        i.putExtras(b);
                        //berpindah ke halaman lain
                        startActivity(i);
                    }if (ednama.getText().toString().isEmpty()) {
                        ednama.setError("Nama Tidak boleh kosong");
                    } else if (nama.equals("Nabila") && password.equals(password)) {
                        Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                    } else if (nama.equals(nama) && password.equals("nabila")) {
                        Toast.makeText(MainActivity.this, "Nama Salah", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Nama dan Password salah", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }
