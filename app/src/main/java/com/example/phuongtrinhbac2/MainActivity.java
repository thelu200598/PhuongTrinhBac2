package com.example.phuongtrinhbac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button giaipt;
EditText soa,sob;
TextView tvkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        giaipt = (Button)findViewById(R.id.btnketqua);
        soa = (EditText)findViewById(R.id.txta);
        sob = (EditText)findViewById(R.id.txtb);
        tvkq = (TextView)findViewById(R.id.tvhienthi);
        giaipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soa.getText().toString());
                int b = Integer.parseInt(sob.getText().toString());
                int kq = 0;
                if (a == 0) {
                    if (b != 0) tvkq.setText("Phương trình vô nghiệm");
                    else tvkq.setText("Phương trình vô số nghiệm");
                } else {
                    if (b != 0) tvkq.setText("Phương trình có nghiệm x= " + ((-b) / a));
                    else tvkq.setText("Phương trình có nghiệm x= " + kq);
                }
            }
        });
    }
}
