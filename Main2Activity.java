package com.example.helloworld;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);
        }
        final TextView txtResult = (TextView) findViewById(R.id.txt_in);
        Button btn0 = (Button) findViewById(R.id.btn_0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("0");
                } else {
                    editText1.setText(editText1.getText() + "0");
                }
            }
        });
        Button btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("1");
                } else {
                    editText1.setText(editText1.getText() + "1");
                }
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("2");
                } else {
                    editText1.setText(editText1.getText() + "2");
                }
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("3");
                } else {
                    editText1.setText(editText1.getText() + "3");
                }
            }
        });
        Button btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("4");
                } else {
                    editText1.setText(editText1.getText() + "4");
                }
            }
        });
        Button btn5 = (Button) findViewById(R.id.btn_5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("5");
                } else {
                    editText1.setText(editText1.getText() + "5");
                }
            }
        });
        Button btn6 = (Button) findViewById(R.id.btn_6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("6");
                } else {
                    editText1.setText(editText1.getText() + "6");
                }
            }
        });
        Button btn7 = (Button) findViewById(R.id.btn_7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("7");
                } else {
                    editText1.setText(editText1.getText() + "7");
                }
            }
        });
        Button btn8 = (Button) findViewById(R.id.btn_8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("8");
                } else {
                    editText1.setText(editText1.getText() + "8");
                }
            }
        });
        Button btn9 = (Button) findViewById(R.id.btn_9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("9");
                } else {
                    editText1.setText(editText1.getText() + "9");
                }
            }
        });
        Button btndot = (Button) findViewById(R.id.btn_dot);
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                editText1.setText(editText1.getText() + ".");
            }
        });
        Button btnplus = (Button) findViewById(R.id.btn_plus);
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                editText1.setText(editText1.getText() + "+");
            }
        });
        Button btnsub = (Button) findViewById(R.id.btn_sub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                editText1.setText(editText1.getText() + "-");
            }
        });
        Button btnmulti = (Button) findViewById(R.id.btn_multi);
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                editText1.setText(editText1.getText() + "*");
            }
        });
        Button btndivide = (Button) findViewById(R.id.btn_divide);
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                editText1.setText(editText1.getText() + "/");
            }
        });
        Button btncl = (Button) findViewById(R.id.btn_clear);
        btncl.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         TextView eidtText1 = (TextView) findViewById(R.id.txt_result);
                                         TextView eidtText3 = (TextView) findViewById(R.id.txt_result2);
                                         eidtText1.setText("0");
                                         eidtText3.setText("");
                                     }
                                 }
        );
        Button btnback = (Button) findViewById(R.id.btn_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText("(");
                } else {
                    editText1.setText(editText1.getText() + "（");
                }

            }
        });
        Button btnback2 = (Button) findViewById(R.id.btn_back2);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    editText1.setText(")");
                } else {
                    editText1.setText(editText1.getText() + ")");
                }
            }
        });
        Button btnd = (Button) findViewById(R.id.btn_equal);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_result2);
                String c = editText1.getText().toString();
                List<String> list = infixToSuffix(c);
                Integer num = getReslut(list);
                int k = num.intValue();
                String aa=String.valueOf(k);
                editText2.setText(aa);








            }
        });
    }
    public Integer getReslut(List<String> list){
        Integer n1 = null;
        Integer n2 = null;
        Integer reslut = null;
        Deque<Integer> opt = new LinkedList<Integer>();
        for(int i=0;i<list.size();i++){
            String num = list.get(i);
            try {
                Integer n = Integer.valueOf(num);
                opt.offerFirst(n);
            }catch (Exception e){
                n2 = opt.pollFirst();
                n1 = opt.pollFirst();
                if("+".equals(num)){
                    reslut = n1 + n2;
                }else if("-".equals(num)){
                    reslut = n1 - n2;
                }else if("*".equals(num)){
                    reslut = n1 * n2;
                }else if("/".equals(num)){
                    reslut = n1 / n2;
                }
                opt.offerFirst(reslut);
            }
        }

        return  opt.pollFirst();
    }
    public List<String> infixToSuffix(String str) {
        List<String> numlist = getNums(str);
        List<String> list = new ArrayList<String>();
        Deque<String> deque = new LinkedList<String>();
        for (int i = 0; i < numlist.size(); i++) {
//            Character c = str.charAt(i);
            String num = numlist.get(i);
            if("(".equals(num)||"*".equals(num)||"/".equals(num)){
                deque.offerFirst(num);
            }else if("+".equals(num)||"-".equals(num)){
                addAndMul(deque, num, list);
            }else if(")".equals(num)){
                rightKuo(deque, num, list);
            }else{
                list.add(num);
            }
            if (i == numlist.size() - 1) {
                while (true) {
                    String next = deque.pollFirst();
                    if (null == next) {
                        break;
                    }
                    list.add(next);
                }
            }
        }
        return list;
    }
    private void addAndMul(Deque<String> deque, String c, List<String> list) {
        while (true) {
            String    next = deque.peekFirst();
            if (null == next || "+".equals(next) || "-".equals(next) || "(".equals(next)) {
                deque.offerFirst(c);
                break;
            }
            list.add(deque.pollFirst());
        }
    }
    private void rightKuo(Deque<String> deque, String c, List<String> list) {
        while (true) {
            String next = deque.pollFirst();
            if ("(" .equals(next)) {
                break;
            }
            list.add(next.toString());
        }
    }
    private List<String> getNums(String str) {
        String nums = "0123456789";
        String opts = "()+-*/";
//        String[] ss = new String[str.length()];
        List<String> list = new ArrayList<String>();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
//                ss[j] = str.substring(i, i + 1);
                list.add(str.substring(i, i + 1));
            } else {
                String per = str.substring(i - 1, i);
                String now = str.substring(i, i + 1);
                if(opts.indexOf(now)>-1 ){
                    j++;
//                    ss[j] = now;
                    list.add(now);
                }else if(nums.indexOf(now)>-1){
                    if(nums.indexOf(per)>-1){
//                        ss[j]=ss[j]+now;
                        list.set(j,list.get(j)+now);
                    }else{
                        j++;
//                        ss[j] = now;
                        list.add(now);
                    }
                }
            }
        }
        return list;
    }
}
