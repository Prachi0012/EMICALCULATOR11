package com.example.emicalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity extends AppCompatActivity {
    EditText edtamt,edtrate,edtyear;
    TextView txtcalculate,pamt,iamt,tamt;
    AppCompatButton btnreset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {

        edtamt=findViewById(R.id.edtamt);
        edtrate=findViewById(R.id.edtrate);
        edtyear=findViewById(R.id.edtyear);
        txtcalculate=findViewById(R.id.txtcalculate);
        btnreset=findViewById(R.id.btnreset);
        pamt=findViewById(R.id.pamt);
        iamt=findViewById(R.id.iamt);
        tamt=findViewById(R.id.tamt);

        txtcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer p =Integer.parseInt(edtamt.getText().toString());
                Integer i =Integer.parseInt(edtrate.getText().toString());
                Integer t =Integer.parseInt(edtyear.getText().toString());

                float pa = Float.valueOf(p);
                String ap = String.valueOf(pa);
                pamt.setText(Float.toString(Float.parseFloat(ap)));

                float total=Float.valueOf(((p*i)/100));
                String totalamt = String.valueOf(total);
                iamt.setText(Float.toString(Float.parseFloat(totalamt)));

                float sum = p+total;
                String totalsum= String.valueOf(sum);
                tamt.setText(totalsum);

            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtamt.setText(null);
                edtrate.setText(null);
                edtyear.setText(null);
                pamt.setText(null);
                iamt.setText(null);
                tamt.setText(null);


            }
        });
    }
}