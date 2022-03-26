package com.example.exercise1;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IsiActivity extends AppCompatActivity {
    TextView accTask, accWaktu, accJenis;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isitask);

        accTask = findViewById(R.id.text1);
        accJenis = findViewById(R.id.jtask1);
        accWaktu = findViewById(R.id.ttask1);
        Bundle bundle = getIntent().getExtras();
        String accTask1 = bundle.getString("data5");
        String accJenis1 = bundle.getString("data6");
        String accWaktu1 = bundle.getString("data7");
        accTask.setText(accTask1);
        accJenis.setText(accJenis1);
        accWaktu.setText(accWaktu1);
    }
}
