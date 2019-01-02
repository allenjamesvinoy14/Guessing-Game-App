package com.example.luci4.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    int num;

    public void onClickFunction(View view){
        EditText eText = (EditText)findViewById(R.id.editText);



        int val = Integer.parseInt(eText.getText().toString());

        if (val == num)
            Toast.makeText(this, "Eureka!!!!", Toast.LENGTH_SHORT).show();
        else if (val < num)
            Toast.makeText(this, "Go Higher!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Lower Boy! Lower!", Toast.LENGTH_SHORT).show();


//        }
//        String message = eText.getText().toString();
//        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
//        else
//            Toast.makeText(this,"Enter a Number!",Toast.LENGTH_SHORT);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=13;
    }
}
