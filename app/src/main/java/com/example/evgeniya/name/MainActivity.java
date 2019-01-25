package com.example.evgeniya.name;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn_spellBack);
        EditText t1 = findViewById(R.id.lbl_name);
        TextView tv1 = findViewById(R.id.lbl_result);


//        InputMethodManager imm =
//                (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
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
}
