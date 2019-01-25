package com.example.evgeniya.name;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        Hide the on screen keyboard
//        InputMethodManager imm =
//                (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

        Button b1 = findViewById(R.id.btn_showmsg);
        Button b2 = findViewById(R.id.btn_showmsg2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText t1 = findViewById(R.id.lbl_name);
                Toast.makeText(getApplicationContext(), "Hello "+ new StringBuilder(t1.getText().toString()).reverse().toString(), Toast.LENGTH_LONG).show();

                CheckBox chk1 = findViewById(R.id.checkBox);
                Switch sw1 = findViewById(R.id.switch1);
                ToggleButton tgl1 = findViewById(R.id.toggle1);
                RatingBar rb1 = findViewById(R.id.rating1);

                Boolean check1checked = chk1.isChecked();
                Boolean switched = sw1.isChecked();
                Boolean toggletoggled = tgl1.isChecked();
                float starRating = rb1.getRating();
            }
        });


//        Get a value from an edit text component on the screen;
//        EditText editNum1 = findViewById(R.id.editNum1);
//        int num1 = Integer.parseInt(editNum1.getText().toString());
//        Set a label on screen.
//                TextView textview1 = findViewById(R.id.textResult);
//        textview1.setText("My Text Value");
//        Set a listener on a button
//        addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//…
//            }
    }

    public void btn1_pressed(View v) {
        EditText t1 = findViewById(R.id.lbl_name);
        TextView tv1 = findViewById(R.id.lbl_result);

        tv1.setText("Hello " + t1.getText().toString());

    }
}
