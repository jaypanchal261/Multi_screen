package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.example.multiscreen.MSG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeOrder(View view)
    {
        //Built an intent for new activity
        Intent intent =  new Intent( this, OrderActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);

        String message = "   Order placed Successfully  for "+ editText1.getText().toString() + ","+
                         editText2.getText().toString() + ","+
                         editText3.getText().toString() + "&"+
                         editText4.getText().toString();
        intent.putExtra(MSG, message);
        startActivity(intent);
    }
}