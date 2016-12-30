package com.navyakaree.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void currencyConverter(View view){
        EditText rupee = (EditText) findViewById(R.id.editText3);

  Double doublerupee= Double.parseDouble(rupee.getText().toString());
        Double dollarPrice = doublerupee/65;

        Toast.makeText(MainActivity.this, "$"+ String.format("%.2f", dollarPrice).toString() , Toast.LENGTH_SHORT).show();
    }
}
