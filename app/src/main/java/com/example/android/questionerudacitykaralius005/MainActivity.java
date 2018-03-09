package com.example.android.questionerudacitykaralius005;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int track;
    private Button main;
    private ArrayList <String> answers = new ArrayList<>();
    private boolean boolanswers[]= new boolean[8];
    private  EditText editText;
    private  TextView aditiona2;
    private TextView question;
    private LinearLayout answerslayout;
    private  TextView title;
    private int right;
    private int wrong;
    private  ImageView img;
    private TextView aditional;
    private LinearLayout checkboxes;
    private CheckBox ch0;
    private  boolean haschecked=false;
    private CheckBox ch1;
    private  CheckBox ch2;
    private  CheckBox ch3;
    private RadioButton r0;
    private RadioButton r1;
    private RadioButton r2;
    private  RadioButton r3;
    //what's the point of declaring variables in seperate line like:
    //private RadioButton r3;
    //private RadioButton r2;
    //Insted of:
    // private Radiobutton r3,r2; ?
    private com.devprovider.customview.ToggleButtonGroupTableLayout radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch0 = findViewById(R.id.ch0);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        editText = findViewById(R.id.edittext);
        main = findViewById(R.id.mainbtn);
        img = findViewById(R.id.image);
        title= findViewById(R.id.title);
        question = findViewById(R.id.question);
        aditional = findViewById(R.id.aditional);
        checkboxes = findViewById(R.id.checkboxes);
        radioGroup = findViewById(R.id.radiogoup);
        r0 = findViewById(R.id.radio0);
        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        r3 = findViewById(R.id.radio3);
        answerslayout = findViewById(R.id.anslayout);
        aditiona2 = findViewById(R.id.aditiona2);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(track==0)
                {
                    main.setText(getString(R.string.cont));
                }
                track++;
                content();
            }
        });
    }
    private void content()
    {
        switch (track){
            case 1:
                title.setVisibility(View.GONE);
                editText.setVisibility(View.VISIBLE);
                img.setImageResource(R.drawable.q0);
                aditional.setText(getString(R.string.yourname));
                question.setText(getString(R.string.writename));
                editText.setHint(getString(R.string.name));
                break;
            case 2:
               answers.add(editText.getText().toString());
                title.setVisibility(View.VISIBLE);
                img.setImageResource(R.drawable.q1);
                question.setText(getString(R.string.q1question));
                editText.setHint(getString(R.string.q1hint));
                title.setText(getString(R.string.q1));
                break;
            case 3:
                answers.add(editText.getText().toString());
                question.setText(getString(R.string.q2question));
                img.setImageResource(R.drawable.q2);
                editText.setHint(getString(R.string.q2hint));
                title.setText(getString(R.string.q2));
                break;
            case 4:
                answers.add(editText.getText().toString());
                question.setText(getString(R.string.q3question));
                img.setImageResource(R.drawable.q3);
                editText.setHint(getString(R.string.q3hint));
                title.setText(getString(R.string.q3));
                break;
            case 5:
                answers.add(editText.getText().toString());
                question.setText(getString(R.string.q4question));
                img.setImageResource(R.drawable.q4);
                editText.setHint(getString(R.string.q4hint));
                title.setText(getString(R.string.q4));
                break;
            case 6:
                answers.add(editText.getText().toString());
                question.setText(getString(R.string.q5question));
                img.setImageResource(R.drawable.q5);
                editText.setHint(getString(R.string.q5hint));
                title.setText(getString(R.string.q5));
                break;
            case 7:
                answers.add(editText.getText().toString());
                checkboxes.setVisibility(View.VISIBLE);
                question.setText(getString(R.string.q6question));
                img.setImageResource(R.drawable.q6);
                editText.setVisibility(View.GONE);
                title.setText(getString(R.string.q6));
                ch0.setText(getString(R.string.s0election));
                ch1.setText(getString(R.string.s1election));
                ch2.setText(getString(R.string.s2election));
                ch3.setText(getString(R.string.s3election));
                break;
                case 8:
                    boolanswers[0]=ch0.isChecked();
                    boolanswers[1]=ch1.isChecked();
                    boolanswers[2]=ch2.isChecked();
                    boolanswers[3]=ch3.isChecked();
                    ch1.setChecked(false);
                    ch0.setChecked(false);
                    ch2.setChecked(false);
                    ch3.setChecked(false);
                    question.setText(getString(R.string.q7question));
                    img.setImageResource(R.drawable.q7);
                    title.setText(getString(R.string.q7));
                    ch0.setText(getString(R.string.s0election1));
                    ch1.setText(getString(R.string.s1election1));
                    ch2.setText(getString(R.string.s2election1));
                    ch3.setText(getString(R.string.s3election1));
                    break;
            case 9:
                boolanswers[4]=ch0.isChecked();
                boolanswers[5]=ch1.isChecked();
                boolanswers[6]=ch2.isChecked();
                boolanswers[7]=ch3.isChecked();
                checkboxes.setVisibility(View.GONE);
                radioGroup.setVisibility(View.VISIBLE);
                String ans;
                r0.setText(getString(R.string.radio0));
                r1.setText(getString(R.string.radio1));
                r2.setText(getString(R.string.radio2));
                r3.setText(getString(R.string.radio3));
                question.setText(getString(R.string.q8question));
                img.setImageResource(R.drawable.q8);
                title.setText(getString(R.string.q8));
                break;
            case 10:
                img.setVisibility(View.GONE);
                main.setText(getResources().getString(R.string.START_AGAIN));
                main.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
                radioGroup.setVisibility(View.GONE);
                title.setText(getString(R.string.Results));
                ans ="Hello "+answers.get(0)+"\n";
                ans +=getString(R.string.q1)+"\n"+getString(R.string.q1question)+"\n"+getString(R.string.correct)+"\n"+getString(R.string.q1correct)+"\n"+getString(R.string.yourans)+"\n"+answers.get(1)+"\n";
                ans +=getString(R.string.q2)+"\n"+getString(R.string.q2question)+"\n"+getString(R.string.correct)+"\n"+getString(R.string.q2correct)+"\n"+getString(R.string.yourans)+"\n"+answers.get(2)+"\n";
                ans +=getString(R.string.q3)+"\n"+getString(R.string.q3question)+"\n"+getString(R.string.correct)+"\n"+getString(R.string.q3correct)+"\n"+getString(R.string.yourans)+"\n"+answers.get(3)+"\n";
                ans +=getString(R.string.q4)+"\n"+getString(R.string.q4question)+"\n"+getString(R.string.correct)+"\n"+getString(R.string.q4correct)+"\n"+getString(R.string.yourans)+"\n"+answers.get(4)+"\n";
                ans +=getString(R.string.q5)+"\n"+getString(R.string.q5question)+"\n"+getString(R.string.correct)+"\n"+getString(R.string.q5correct)+"\n"+getString(R.string.yourans)+"\n"+answers.get(5)+"\n";
                String placeholder="";
                if(boolanswers[0])
                    placeholder=getString(R.string.s0election)+" ";
                if(boolanswers[1])
                    placeholder+=getString(R.string.s1election)+" ";
                if(boolanswers[2])
                    placeholder+=getString(R.string.s2election)+" ";
                if(boolanswers[3])
                    placeholder+=getString(R.string.s3election)+" ";
                ans += getString(R.string.q6) + "\n" + getString(R.string.q6question) + "\n" + getString(R.string.correct) + "\n" + getString(R.string.q6correct) + "\n" + getString(R.string.yourans) + "\n" + placeholder + "\n";
                placeholder = " ";
                if (boolanswers[4])
                    placeholder = getString(R.string.s0election1) + " ";
                if (boolanswers[5])
                    placeholder += getString(R.string.s1election) + ", ";
                if (boolanswers[6])
                    placeholder += getString(R.string.s2election1) + ", ";
                if (boolanswers[7])
                    placeholder += getString(R.string.s3election1) + ", ";

                ans += getString(R.string.q7) + "\n" + getString(R.string.q7question) + "\n" + getString(R.string.correct) + "\n" + getString(R.string.q7correct) + "\n" + getString(R.string.yourans) + "\n" + placeholder + "\n";

                if (radioGroup.getCheckedRadioButtonId() == R.id.radio1) {
                    placeholder = getString(R.string.radio1);
                } else if (radioGroup.getCheckedRadioButtonId() == R.id.radio0) {
                    placeholder = getString(R.string.radio0);
                } else if (radioGroup.getCheckedRadioButtonId() == R.id.radio2) {
                    placeholder = getString(R.string.radio2);
                } else if (radioGroup.getCheckedRadioButtonId() == R.id.radio3) {
                    placeholder = getString(R.string.radio3);
                }
                ans += getString(R.string.q8) + "\n" + getString(R.string.q8question) + "\n" + getString(R.string.correct) + "\n" + getString(R.string.q8correct) + "\n" + getString(R.string.yourans) + "\n" + placeholder + "\n";
                answerslayout.setVisibility(View.VISIBLE);
                question.setText(ans);

                if(!haschecked) {
                    if (boolanswers[3] && boolanswers[2])
                        right++;
                    else wrong++;

                    if (boolanswers[4] && boolanswers[5] && boolanswers[6] && boolanswers[7])
                        right++;
                    else wrong++;

                    placeholder = "";
                    if (radioGroup.getCheckedRadioButtonId() == R.id.radio1) {
                        right++;
                    } else if (radioGroup.getCheckedRadioButtonId() == R.id.radio0) {
                        wrong++;
                    } else if (radioGroup.getCheckedRadioButtonId() == R.id.radio2) {
                        wrong++;
                    } else if (radioGroup.getCheckedRadioButtonId() == R.id.radio3) {
                        wrong++;
                    } else wrong++;
                    if (answers.get(1).toLowerCase().contains(getString(R.string.KeyOfQ1)))
                        right++;
                    else wrong++;
                    if (answers.get(2).toLowerCase().contains(getString(R.string.KeyOfQ2)) || answers.get(2).toLowerCase().contains(getString(R.string.KeyOfQ22)))
                        right++;
                    else wrong++;
                    if (answers.get(3).toLowerCase().contains(getString(R.string.KeyOfQ3)) || answers.get(3).toLowerCase().contains(getString(R.string.KeyOfQ33)))
                        right++;
                    else wrong++;
                    if (answers.get(4).toLowerCase().contains(getString(R.string.KeyOfQ4)) || answers.get(4).toLowerCase().contains(getString(R.string.KeyOfQ44)))
                        right++;
                    else wrong++;
                    if (answers.get(5).toLowerCase().contains(getString(R.string.KeyOfQ5)))
                        right++;
                    else wrong++;

                    haschecked=true;
                }
                    aditional.setText(getString(R.string.corectansw) + "\n" + right);
                    aditiona2.setText(getString(R.string.wrongansws) + "\n" + wrong);

                break;
        }
        editText.setText("");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Rights",right);
        outState.putInt("Wrongs", wrong);
        outState.putInt("tracker",track);
        outState.putBooleanArray("boolans",boolanswers);
        outState.putStringArrayList("ansarray", answers);
        outState.putBoolean("checked",haschecked);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        track = savedInstanceState.getInt("tracker");
        right = savedInstanceState.getInt("Rights");
        wrong = savedInstanceState.getInt("Wrongs");
        boolanswers = savedInstanceState.getBooleanArray("boolans");
        answers = savedInstanceState.getStringArrayList("ansarray");
        haschecked = savedInstanceState.getBoolean("checked");
        // after rotation strings shift to further possitions, example: first answer despacito, second spanish third pewdiepie after rotation fist  second  third  despacito
        // seems like the question on which you restart activity becomes first and others before that cleares out
        //Didin't managed to solve this problem
        if(track!=0)
            main.setText(getString(R.string.cont));
        if(track<6)
            editText.setVisibility(View.VISIBLE);
        if(track>6&&track<9) {
            editText.setVisibility(View.GONE);
            checkboxes.setVisibility(View.VISIBLE);
        }
       content();
    }
}
