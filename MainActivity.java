package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button so0, so1, so2, so3, so4, so5, so6, so7, so8, so9;
    Button bang, cong, tru, nhan, chia, c, ce, cham;
    TextView mainscreen, secondscreen;
    String tinhtoan, pheptoan;
    boolean checkDot = false, chekBang = false;
    double soa, sob, ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondscreen.setText("");
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "";
                checkDot = false;
                chekBang = false;
            }
        });
        so0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "0");
                }
            }
        });
        so1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "1");
                }
            }
        });
        so2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "2");
                }
            }
        });
        so3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "3");
                }
            }
        });
        so4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "4");
                }
            }
        });
        so5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "5");
                }
            }
        });
        so6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "6");
                }
            }
        });
        so7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "7");
                }
            }
        });
        so8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "8");
                }
            }
        });
        so9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "9");
                }
            }
        });
        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + ".");
                }
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == ""){
                    soa = 0;
                    secondscreen.setText("0 +");
                }
                else {
                    soa = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + "+");
                }
                    mainscreen.setText("");
                    tinhtoan = "";
                    pheptoan = "+";
                    chekBang = false;
                    checkDot = false;
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == ""){
                    soa = 0;
                    secondscreen.setText("0 -");
                }
                else {
                    soa = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + "+");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "-";
                chekBang = false;
                checkDot = false;
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == ""){
                    soa = 0;
                    secondscreen.setText("0 x");
                }
                else {
                    soa = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + "+");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "x";
                chekBang = false;
                checkDot = false;
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainscreen.getText() == ""){
                    soa = 0;
                    secondscreen.setText("0 /");
                }
                else {
                    soa = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + "+");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "/";
                chekBang = false;
                checkDot = false;
            }
        });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    checkDot = false;
                    tinhtoan = mainscreen.getText().toString();
                    sob = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(secondscreen.getText().toString()+mainscreen.getText().toString() + "");
                    mainscreen.setText("");
                    if (pheptoan == "+"){
                        ketqua = soa + sob;
                    }else if (pheptoan == "-"){
                        ketqua = soa - sob;
                    }else if (pheptoan == "*"){
                        ketqua = soa * sob;
                    }else if (pheptoan == "/"){
                        ketqua = soa / sob;
                    }
                    chekBang = true;
                    mainscreen.setText(ketqua + "");
                }
                pheptoan = "";
            }
        });
        cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    if (!checkDot){
                        tinhtoan = mainscreen.getText().toString();
                        mainscreen.setText(tinhtoan + "");
                        checkDot = true;

                    }
                }
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chekBang){
                    String val = mainscreen.getText().toString();
                    if (!val.isEmpty()){
                        val = val.substring(0, val.length() - 1);
                        mainscreen.setText(val);
                    }
                }
            }
        });
    }
    protected void anhxa(){
        so0 = findViewById(R.id.so0);
        so1 = findViewById(R.id.so1);
        so2 = findViewById(R.id.so2);
        so3 = findViewById(R.id.so3);
        so4 = findViewById(R.id.so4);
        so5 = findViewById(R.id.so5);
        so6 = findViewById(R.id.so6);
        so7 = findViewById(R.id.so7);
        so8 = findViewById(R.id.so8);
        so9 = findViewById(R.id.so9);
        bang = findViewById(R.id.bang);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
        c = findViewById(R.id.c);
        ce = findViewById(R.id.ce);
        mainscreen = findViewById(R.id.manhinh);
        secondscreen = findViewById(R.id.man_hinh_phu);
    }
}