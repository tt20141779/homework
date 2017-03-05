package com.example.mz.tthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String amount;
    EditText totalAmount,persNbr;
    TextView display,word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalAmount=(EditText) findViewById(R.id.etAmount);
        persNbr=(EditText) findViewById(R.id.etNbr);
        display=(TextView) findViewById(R.id.tvAmountPerPerson);
        word=(TextView)  findViewById(R.id.tvWelcome);
    }
    public void btnCompute(View v){
        Double total=Double.parseDouble(totalAmount.getText().toString());
        Double persons=Double.parseDouble(persNbr.getText().toString());
        Double share=total/persons;
        share=Double.valueOf(Math.round(share*100));
        share=share/100;

        Toast.makeText(getBaseContext(),"The amount to share is:"+share,Toast.LENGTH_SHORT).show();
        display.setText(String.valueOf(share));
        word.setText("Look forward to your next visit");
    }
}
