package com.example.radiobuttonsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radiogroup_parent);
        textView=findViewById(R.id.text_view_selected);


        Button buttonapply=findViewById(R.id.button_apply);
        buttonapply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId=radioGroup.getCheckedRadioButtonId();

                radioButton=findViewById(radioId);
                textView.setText("Your Choice: " + radioButton.getText());

                //will show a toast with a text of the radiobutton one selected.
                radioId = radioGroup.getCheckedRadioButtonId();

                radioButton=findViewById(radioId);

                Toast.makeText(MainActivity.this, "Seleceted Radio Button is: " + radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void checkButton(View v){

    }
}
