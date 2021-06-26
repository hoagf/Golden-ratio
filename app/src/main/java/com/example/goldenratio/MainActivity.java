package com.example.goldenratio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    EditText edt1, edt2;
    TextView txt1, txt2, txt3, txt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hoanhao();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muoisau();
            }
        });
    }
    public void hoanhao()
    {
        float a, r1, r2;
        String t1, t2;
        a = Float.parseFloat(String.valueOf(edt1.getText()));
        r1 = (float) (a * 1.618);
        r2 = (float) (a*0.618);
        t2 = ""+r2;
        txt2.setText(t2);
        t1 = ""+r1;
        txt1.setText(t1);
    }
    public void muoisau()
    {
        int a, r1, r2;
        String t1, t2;
        a = Integer.parseInt(String.valueOf(edt2.getText()));
        r1 = (int) (a * 1.777778);
        r2 = (int) (a*0.5625);
        t2 = ""+r2;
        txt3.setText(t2);
        t1 = ""+r1;
        txt4.setText(t1);
    }
}