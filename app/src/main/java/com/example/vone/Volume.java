package com.example.vone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Volume extends AppCompatActivity {

    private Button Vol;
    private EditText H;
    private EditText L;
    private EditText W;
    private TextView Res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        Vol = (Button)findViewById(R.id.btnCalVol);
        H = (EditText)findViewById(R.id.etHeight);
        L = (EditText)findViewById(R.id.etLength);
        W = (EditText)findViewById(R.id.etWidth);
        Res = (TextView)findViewById(R.id.tvVolRes);

        Vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(H.getText().toString());
                double l = Double.parseDouble(L.getText().toString());
                double w = Double.parseDouble(W.getText().toString());
                double res = h*l*w;
                Res.setText(res + "");
            }
        });
    }
}
