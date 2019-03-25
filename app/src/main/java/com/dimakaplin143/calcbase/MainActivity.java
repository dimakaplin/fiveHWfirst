package com.dimakaplin143.calcbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button point;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();



    }

    private void initViews() {
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        point = findViewById(R.id.point);
        result = findViewById(R.id.result);

        b1.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b2.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b3.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b4.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b5.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b6.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b7.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b8.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b9.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        b0.setOnClickListener(v-> {
            Button b = (Button) v;
            buttonClick(b);
        });
        point.setOnClickListener(v-> {
            Button b = (Button) v;

            if(!result.getText().toString().contains(".")) {
                buttonClick(b);
            }


        });
    }

    private void buttonClick(Button b) {
        if("0".equals(result.getText().toString())) {
            result.setText(b.getText().toString());
        }
        else {
            result.setText(result.getText().toString() + b.getText().toString());
        }
    }
}
