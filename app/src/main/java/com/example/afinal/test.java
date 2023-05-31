package com.example.afinal;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {

    TextView tv_question1, tv_question2, tv_question3, tv_question4,tv_question5, tv_question6, tv_question7, tv_question8,tv_question9, tv_question10, result;
    RadioButton rb_question1_ans1, rb_question1_ans2, rb_question1_ans3, rb_question1_ans4;
    RadioButton rb_question2_ans1, rb_question2_ans2, rb_question2_ans3, rb_question2_ans4;
    RadioButton rb_question3_ans1, rb_question3_ans2, rb_question3_ans3, rb_question3_ans4;
    RadioButton rb_question4_ans1, rb_question4_ans2, rb_question4_ans3, rb_question4_ans4;
    RadioButton rb_question5_ans1, rb_question5_ans2, rb_question5_ans3, rb_question5_ans4;
    RadioButton rb_question6_ans1, rb_question6_ans2, rb_question6_ans3, rb_question6_ans4;
    RadioButton rb_question7_ans1, rb_question7_ans2, rb_question7_ans3, rb_question7_ans4;
    RadioButton rb_question8_ans1, rb_question8_ans2, rb_question8_ans3, rb_question8_ans4;
    RadioButton rb_question9_ans1, rb_question9_ans2, rb_question9_ans3, rb_question9_ans4;
    RadioButton rb_question10_ans1, rb_question10_ans2, rb_question10_ans3, rb_question10_ans4;

    String [] suraktar = {"Ата армияға бардыма?", "Атанын жасы қаншада?", "Ата не жақсы көреді?", "Ата күштіма?", "Ата машина айдайма?", "Ата қанша немересі бар?", "Ата ұнататаын тамағы?", "Ата ақылды ма?","Атаны жақсы көресінба?", "Ата сені жақсы көрема?"};

    double bari = suraktar.length;
    double count = 0;
    String [] answer = {"иа", "63", "балық аулау", "әрине","иа", "4", "манты", "иа","Әрине", "солай шығар"};
    String [][] variant = {
            {"иа", "жок","мумкин","нет"},
            {"72", "63", "54", "95"},
            {"ойын", "китап", "тамақ", "балық аулау"},
            {"мумкин", "әрине", "ойланайын", "жок"},
            {"иа", "жок","мумкин","нет"},
            {"2", "7", "1", "4"},
            {"ойын", "китап", "манты", "балық"},
            {"иа", "жок","мумкин","нет"},
            {"мумкин", "Әрине", "ойланайын", "жок"},
            {"солай шығар", "әрине", "ойланайын", "жок"},
    };


    Button checkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_ata);

        tv_question1 = findViewById(R.id.tv_question1);
        tv_question2 = findViewById(R.id.tv_question2);
        tv_question3 = findViewById(R.id.tv_question3);
        tv_question4 = findViewById(R.id.tv_question4);
        tv_question5 = findViewById(R.id.tv_question5);
        tv_question6 = findViewById(R.id.tv_question6);
        tv_question7 = findViewById(R.id.tv_question7);
        tv_question8 = findViewById(R.id.tv_question8);
        tv_question9 = findViewById(R.id.tv_question9);
        tv_question10 = findViewById(R.id.tv_question10);
        result = findViewById(R.id.result);

        rb_question1_ans1 = findViewById(R.id.rb_question1_ans1);
        rb_question1_ans2 = findViewById(R.id.rb_question1_ans2);
        rb_question1_ans3 = findViewById(R.id.rb_question1_ans3);
        rb_question1_ans4 = findViewById(R.id.rb_question1_ans4);

        rb_question2_ans1 = findViewById(R.id.rb_question2_ans1);
        rb_question2_ans2 = findViewById(R.id.rb_question2_ans2);
        rb_question2_ans3 = findViewById(R.id.rb_question2_ans3);
        rb_question2_ans4 = findViewById(R.id.rb_question2_ans4);

        rb_question3_ans1 = findViewById(R.id.rb_question3_ans1);
        rb_question3_ans2 = findViewById(R.id.rb_question3_ans2);
        rb_question3_ans3 = findViewById(R.id.rb_question3_ans3);
        rb_question3_ans4 = findViewById(R.id.rb_question3_ans4);

        rb_question4_ans1 = findViewById(R.id.rb_question4_ans1);
        rb_question4_ans2 = findViewById(R.id.rb_question4_ans2);
        rb_question4_ans3 = findViewById(R.id.rb_question4_ans3);
        rb_question4_ans4 = findViewById(R.id.rb_question4_ans4);

        rb_question5_ans1 = findViewById(R.id.rb_question5_ans1);
        rb_question5_ans2 = findViewById(R.id.rb_question5_ans2);
        rb_question5_ans3 = findViewById(R.id.rb_question5_ans3);
        rb_question5_ans4 = findViewById(R.id.rb_question5_ans4);

        rb_question6_ans1 = findViewById(R.id.rb_question6_ans1);
        rb_question6_ans2 = findViewById(R.id.rb_question6_ans2);
        rb_question6_ans3 = findViewById(R.id.rb_question6_ans3);
        rb_question6_ans4 = findViewById(R.id.rb_question6_ans4);

        rb_question7_ans1 = findViewById(R.id.rb_question7_ans1);
        rb_question7_ans2 = findViewById(R.id.rb_question7_ans2);
        rb_question7_ans3 = findViewById(R.id.rb_question7_ans3);
        rb_question7_ans4 = findViewById(R.id.rb_question7_ans4);

        rb_question8_ans1 = findViewById(R.id.rb_question8_ans1);
        rb_question8_ans2 = findViewById(R.id.rb_question8_ans2);
        rb_question8_ans3 = findViewById(R.id.rb_question8_ans3);
        rb_question8_ans4 = findViewById(R.id.rb_question8_ans4);

        rb_question9_ans1 = findViewById(R.id.rb_question9_ans1);
        rb_question9_ans2 = findViewById(R.id.rb_question9_ans2);
        rb_question9_ans3 = findViewById(R.id.rb_question9_ans3);
        rb_question9_ans4 = findViewById(R.id.rb_question9_ans4);

        rb_question10_ans1 = findViewById(R.id.rb_question10_ans1);
        rb_question10_ans2 = findViewById(R.id.rb_question10_ans2);
        rb_question10_ans3 = findViewById(R.id.rb_question10_ans3);
        rb_question10_ans4 = findViewById(R.id.rb_question10_ans4);

        checkBtn = findViewById(R.id.checkBtn);
        surakJinau();

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekseris(tv_question1, rb_question1_ans1, rb_question1_ans2,rb_question1_ans3,rb_question1_ans4,  0);
                tekseris(tv_question2, rb_question2_ans1, rb_question2_ans2,rb_question2_ans3,rb_question2_ans4, 1);
                tekseris(tv_question3, rb_question3_ans1, rb_question3_ans2,rb_question3_ans3,rb_question3_ans4, 2);
                tekseris(tv_question4, rb_question4_ans1, rb_question4_ans2,rb_question4_ans3,rb_question4_ans4, 3);
                tekseris(tv_question5, rb_question5_ans1, rb_question5_ans2,rb_question5_ans3,rb_question5_ans4, 4);
                tekseris(tv_question6, rb_question6_ans1, rb_question6_ans2,rb_question6_ans3,rb_question6_ans4, 5);
                tekseris(tv_question7, rb_question7_ans1, rb_question7_ans2,rb_question7_ans3,rb_question7_ans4, 6);
                tekseris(tv_question8, rb_question8_ans1, rb_question8_ans2,rb_question8_ans3,rb_question8_ans4, 7);
                tekseris(tv_question9, rb_question9_ans1, rb_question9_ans2,rb_question9_ans3,rb_question9_ans4, 8);
                tekseris(tv_question10, rb_question10_ans1, rb_question10_ans2,rb_question10_ans3,rb_question10_ans4, 9);
                result.setText("" + (count / bari)*100+"%");
            }
        });
    }

    public void tekseris(TextView tv_question, RadioButton rb1, RadioButton rb2,RadioButton rb3, RadioButton rb4, int index){
        if (rb1.isChecked() && rb1.getText().toString().equals(answer[index])){
            tv_question.setText(suraktar[index] +"\ntrue");
            tv_question.setTextColor(getResources().getColor(R.color.green));
            count += 1;
        } else if (rb2.isChecked() && rb2.getText().toString().equals(answer[index])) {
            tv_question.setText(suraktar[index]+"\ntrue");
            tv_question.setTextColor(getResources().getColor(R.color.green));
            count +=1;
        }else if (rb3.isChecked() && rb3.getText().toString().equals(answer[index])) {
            tv_question.setText(suraktar[index]+"\ntrue");
            tv_question.setTextColor(getResources().getColor(R.color.green));
            count +=1;
        }else if (rb4.isChecked() && rb4.getText().toString().equals(answer[index])) {
            tv_question.setText(suraktar[index]+"\ntrue");
            tv_question.setTextColor(getResources().getColor(R.color.green));
            count +=1;
        } else {
            tv_question.setText(suraktar[index]+"\nfalse");
            tv_question.setTextColor(getResources().getColor(R.color.red));
        }
    }
    public void surakJinau(){
        tv_question1.setText(suraktar[0]);
        tv_question2.setText(suraktar[1]);
        tv_question3.setText(suraktar[2]);
        tv_question4.setText(suraktar[3]);
        tv_question5.setText(suraktar[4]);
        tv_question6.setText(suraktar[5]);
        tv_question7.setText(suraktar[6]);
        tv_question8.setText(suraktar[7]);
        tv_question9.setText(suraktar[8]);
        tv_question10.setText(suraktar[9]);

        rb_question1_ans1.setText(variant[0][0]);
        rb_question1_ans2.setText(variant[0][1]);
        rb_question1_ans3.setText(variant[0][2]);
        rb_question1_ans4.setText(variant[0][3]);

        rb_question2_ans1.setText(variant[1][0]);
        rb_question2_ans2.setText(variant[1][1]);
        rb_question2_ans3.setText(variant[1][2]);
        rb_question2_ans4.setText(variant[1][3]);

        rb_question3_ans1.setText(variant[2][0]);
        rb_question3_ans2.setText(variant[2][1]);
        rb_question3_ans3.setText(variant[2][2]);
        rb_question3_ans4.setText(variant[2][3]);

        rb_question4_ans1.setText(variant[3][0]);
        rb_question4_ans2.setText(variant[3][1]);
        rb_question4_ans3.setText(variant[3][2]);
        rb_question4_ans4.setText(variant[3][3]);

        rb_question5_ans1.setText(variant[4][0]);
        rb_question5_ans2.setText(variant[4][1]);
        rb_question5_ans3.setText(variant[4][2]);
        rb_question5_ans4.setText(variant[4][3]);

        rb_question6_ans1.setText(variant[5][0]);
        rb_question6_ans2.setText(variant[5][1]);
        rb_question6_ans3.setText(variant[5][2]);
        rb_question6_ans4.setText(variant[5][3]);

        rb_question7_ans1.setText(variant[6][0]);
        rb_question7_ans2.setText(variant[6][1]);
        rb_question7_ans3.setText(variant[6][2]);
        rb_question7_ans4.setText(variant[6][3]);

        rb_question8_ans1.setText(variant[7][0]);
        rb_question8_ans2.setText(variant[7][1]);
        rb_question8_ans3.setText(variant[7][2]);
        rb_question8_ans4.setText(variant[7][3]);

        rb_question9_ans1.setText(variant[8][0]);
        rb_question9_ans2.setText(variant[8][1]);
        rb_question9_ans3.setText(variant[8][2]);
        rb_question9_ans4.setText(variant[8][3]);

        rb_question10_ans1.setText(variant[9][0]);
        rb_question10_ans2.setText(variant[9][1]);
        rb_question10_ans3.setText(variant[9][2]);
        rb_question10_ans4.setText(variant[9][3]);
    }
}