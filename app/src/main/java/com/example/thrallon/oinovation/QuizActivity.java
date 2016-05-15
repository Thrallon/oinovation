package com.example.thrallon.oinovation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    RadioGroup group;
    Button b1;
    RadioButton button;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_layout);

        group = (RadioGroup) findViewById(R.id.radiogroup);
        group.check(R.id.radiobutton1);
        answer = (TextView) findViewById(R.id.answer);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button = (RadioButton) findViewById(group.getCheckedRadioButtonId());
                if(button.getId() == R.id.radiobutton4){
                    answer.setText("Σωστό:Το αγιωργίτικο είναι Νεμέα(Καθόλου)");
                }else{
                    answer.setText("Λάθος Απάντηση");
                }
            }
        });
    }
}
