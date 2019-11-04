package com.example.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.*;

public class MainActivity extends AppCompatActivity {
    float a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtResult = (TextView) findViewById(R.id.txt_in);
        Button btn0 = (Button) findViewById(R.id.btn_0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("0");
                } else {
                    txtResult.setText(txtResult.getText() + "0");
                }
            }
        });
        Button btn1 = (Button) findViewById(R.id.btn_1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("1");
                } else {
                    txtResult.setText(txtResult.getText() + "1");
                }
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("2");
                } else {
                    txtResult.setText(txtResult.getText() + "2");
                }
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn_3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("3");
                } else {
                    txtResult.setText(txtResult.getText() + "3");
                }
            }
        });
        Button btn4 = (Button) findViewById(R.id.btn_4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("4");
                } else {
                    txtResult.setText(txtResult.getText() + "4");
                }
            }
        });
        Button btn5 = (Button) findViewById(R.id.btn_5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("5");
                } else {
                    txtResult.setText(txtResult.getText() + "5");
                }
            }
        });
        Button btn6 = (Button) findViewById(R.id.btn_6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("6");
                } else {
                    txtResult.setText(txtResult.getText() + "6");
                }
            }
        });
        Button btn7 = (Button) findViewById(R.id.btn_7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("7");
                } else {
                    txtResult.setText(txtResult.getText() + "7");
                }
            }
        });
        Button btn8 = (Button) findViewById(R.id.btn_8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("8");
                } else {
                    txtResult.setText(txtResult.getText() + "8");
                }
            }
        });
        Button btn9 = (Button) findViewById(R.id.btn_9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.equals("0")) {
                    txtResult.setText("9");
                } else {
                    txtResult.setText(txtResult.getText() + "9");
                }
            }
        });
        Button btndot = (Button) findViewById(R.id.btn_dot);
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                String c = editText1.getText().toString();
                if (c.indexOf(".") == -1) {
                    txtResult.setText(txtResult.getText() + ".");
                } else {
                }
            }
        });
        Button btnplus = (Button) findViewById(R.id.btn_plus);
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                a = a + Float.parseFloat(c);
                editText2.setText("+");
                txtResult.setText("0");
            }
        });
        Button btnd = (Button) findViewById(R.id.btn_equal);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String fh = editText2.getText().toString();
                if (fh.equals("+")) {
                    TextView editText1 = (TextView) findViewById(R.id.txt_in);
                    TextView result = (TextView) findViewById(R.id.txt_result);
                    String c = editText1.getText().toString();
                    float d = Float.parseFloat(c) + a;
                    result.setText(Float.toString(d));
                    editText1.setText(Float.toString(d));
                    a = 0;
                }
                if (fh.equals("-")) {
                    TextView editText1 = (TextView) findViewById(R.id.txt_in);
                    TextView result = (TextView) findViewById(R.id.txt_result);
                    String c = editText1.getText().toString();
                    float d = a - Float.parseFloat(c);
                    result.setText(Float.toString(d));
                    editText1.setText(Float.toString(d));
                    a = 0;
                }
                if (fh.equals("X")) {
                    TextView editText1 = (TextView) findViewById(R.id.txt_in);
                    TextView result = (TextView) findViewById(R.id.txt_result);
                    String c = editText1.getText().toString();
                    float d = Float.parseFloat(c) * a;
                    result.setText(Float.toString(d));
                    editText1.setText(Float.toString(d));
                    a = 0;
                }
                if (fh.equals("÷")) {
                    TextView editText1 = (TextView) findViewById(R.id.txt_in);
                    TextView result = (TextView) findViewById(R.id.txt_result);
                    String c = editText1.getText().toString();
                    float d = a / Float.parseFloat(c);
                    result.setText(Float.toString(d));
                    editText1.setText(Float.toString(d));
                    a = 0;
                }
            }
        });
        Button btncl = (Button) findViewById(R.id.btn_clear);
        btncl.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                                         TextView eidtText1 = (TextView) findViewById(R.id.txt_in);
                                         TextView eidtText3 = (TextView) findViewById(R.id.txt_result);
                                         eidtText1.setText("0");
                                         editText2.setText("");
                                         eidtText3.setText("");
                                         a = 0;
                                     }
                                 }
        );
        Button btnsub = (Button) findViewById(R.id.btn_sub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                if (a == 0) {
                    a = 2 * Float.parseFloat(c);
                }
                a = a - Float.parseFloat(c);
                editText2.setText("-");
                txtResult.setText("0");
            }
        });
        Button btnmulti = (Button) findViewById(R.id.btn_multi);
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                if (a == 0) {
                    a = 1;
                }
                a = a * Float.parseFloat(c);
                editText2.setText("X");
                txtResult.setText("0");
            }
        });
        Button btndivide = (Button) findViewById(R.id.btn_divide);
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                a = Float.parseFloat(c);
                editText2.setText("÷");
                txtResult.setText("0");
            }
        });
        Button btnback = (Button) findViewById(R.id.btn_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("%");
                editText1.setText(c);
                a = Float.parseFloat(c);
                a = (float) (a * 0.01);
                editText3.setText(Float.toString(a));
            }
        });
        Button btnsin = (Button) findViewById(R.id.btn_sin);
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("Sin");
                editText1.setText(c);
                a = Float.parseFloat(c);
                a = (float) (Math.sin(a));
                editText3.setText(Float.toString(a));
            }
        });
        Button btncos = (Button) findViewById(R.id.btn_cos);
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("Cos");
                editText1.setText(c);
                a = Float.parseFloat(c);
                a = (float) (Math.cos(a));
                editText3.setText(Float.toString(a));
            }
        });
        Button btntan = (Button) findViewById(R.id.btn_tan);
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("Tan");
                editText1.setText(c);
                a = Float.parseFloat(c);
                a = (float) (Math.tan(a));
                editText3.setText(Float.toString(a));
            }
        });
        Button btnbinary = (Button) findViewById(R.id.btn_binary);
        btnbinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("Bin");
                editText1.setText(c);
                int aa = Integer.parseInt( c );
                editText3.setText(Integer.toBinaryString(aa));
            }
        });
        Button btnoctal = (Button) findViewById(R.id.btn_octal);
        btnoctal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("Oct");
                editText1.setText(c);
                int aa =Integer.parseInt( c );
                editText3.setText(Integer.toOctalString(aa));
            }
        });
        Button btnhexadecimal = (Button) findViewById(R.id.btn_hexadecimal);
        btnhexadecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("Hex");
                editText1.setText(c);
                int aa = Integer.parseInt( c );
                editText3.setText(Integer.toHexString(aa));
            }
        });
        Button btnbinary2 = (Button) findViewById(R.id.btn_binary2);
        btnbinary2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("2->10");
                editText1.setText(c);
                editText3.setText(Integer.valueOf(c,2).toString() );
            }
        });
        Button btnbinary3 = (Button) findViewById(R.id.btn_binary3);
        btnbinary3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("8->10");
                editText1.setText(c);
                editText3.setText(Integer.valueOf(c,8).toString() );
            }
        });
        Button btnbinary4 = (Button) findViewById(R.id.btn_binary4);
        btnbinary4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("16->10");
                editText1.setText(c);
                editText3.setText(Integer.valueOf(c,16).toString() );
            }
        });
        Button btnbinary5 = (Button) findViewById(R.id.btn_a);
        btnbinary5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("km->mm");
                int aa = Integer.parseInt( c );
                editText1.setText(c);
                editText3.setText(Integer.toString(aa*1000000));
            }
        });
        Button btnbinary6 = (Button) findViewById(R.id.btn_b);
        btnbinary6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("km->cm");
                int aa = Integer.parseInt( c );
                editText1.setText(c);
                editText3.setText(Integer.toString(aa*100000));
            }
        });
        Button btnbinary7 = (Button) findViewById(R.id.btn_c);
        btnbinary7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("km->um");
                int aa = Integer.parseInt( c );
                editText1.setText(c);
                editText3.setText(Integer.toString(aa*1000000000));
            }
        });
        Button btnbinary8 = (Button) findViewById(R.id.btn_d);
        btnbinary8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("m3->cm3");
                int aa = Integer.parseInt( c );
                editText1.setText(c);
                editText3.setText(Integer.toString(aa*1000000));
            }
        });
        Button btnbinary9 = (Button) findViewById(R.id.btn_e);
        btnbinary9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("m3->dm3");
                int aa = Integer.parseInt( c );
                editText1.setText(c);
                editText3.setText(Integer.toString(aa*1000));
            }
        });
        Button btnbinary10 = (Button) findViewById(R.id.btn_f);
        btnbinary10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editText1 = (TextView) findViewById(R.id.txt_in);
                TextView editText3 = (TextView) findViewById(R.id.txt_result);
                TextView editText2 = (TextView) findViewById(R.id.txt_fh);
                String c = editText1.getText().toString();
                editText2.setText("L->mm3");
                int aa = Integer.parseInt( c );
                editText1.setText(c);
                editText3.setText(Integer.toString(aa*1000000));
            }
        });
        Button btnbinary11 = (Button) findViewById(R.id.help);
        btnbinary11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is HELP");
                dialog.setMessage("HELP");
                dialog.setCancelable(false);
                dialog.setPositiveButton("Ture", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("False", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
            }
        });
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }
    }
}
