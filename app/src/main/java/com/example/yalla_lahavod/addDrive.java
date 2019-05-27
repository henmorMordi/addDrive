package com.example.yalla_lahavod;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class addDrive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("WrongViewCast")
    public void toast_submit_drive_addition(View view) {

        EditText time_from;
        EditText time_to;
        EditText from;
        EditText dest;
        EditText price;

        CheckedTextView rd6;
        CheckedTextView animal ;


        time_from=(EditText)findViewById(R.id.editText1);
        String _time_from=time_from.getText().toString();

        time_to=(EditText)findViewById(R.id.editText2);
        String _time_to=time_from.getText().toString();

        from=(EditText)findViewById(R.id.from_text);
        String _from=time_from.getText().toString();

        dest=(EditText)findViewById(R.id.editText3);
        String _dest=time_from.getText().toString();

        price=(EditText)findViewById(R.id.editText4);
        String _price=time_from.getText().toString();

        rd6=(CheckedTextView) findViewById(R.id.checkBox1);
        String _rd6=time_from.getText().toString();

        animal=(CheckedTextView) findViewById(R.id.checkBox2);
        String _animal=time_from.getText().toString();


        Toast.makeText(this,"submit successfuly",Toast.LENGTH_SHORT).show();

    }
}
