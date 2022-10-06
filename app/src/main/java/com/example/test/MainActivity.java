package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText ed1,ed2;
    String a1,a2;
    float c1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText) findViewById(R.id.edit1);
        ed2=(EditText) findViewById(R.id.edit2);
        btn1=(Button)findViewById(R.id.button);
        t1=(TextView) findViewById(R.id.result);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1=ed1.getText().toString();
                a2=ed2.getText().toString();
                c1=Float.parseFloat(a1)+Float.parseFloat(a2);
                t1.setText(String.format("결과 : %s",c1));
            }
        });

    }
}
