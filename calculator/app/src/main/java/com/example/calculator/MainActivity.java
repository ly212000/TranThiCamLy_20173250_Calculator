package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, dot, equal, ce, c, bs, addnsub;
    TextView txt1, txt2;
    Float var1, var2, ans;
    boolean addition, subtract, multiply, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.one);
        b2 = findViewById(R.id.two);
        b3 = findViewById(R.id.three);
        b4 = findViewById(R.id.four);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.six);
        b7 = findViewById(R.id.seven);
        b8 = findViewById(R.id.eight);
        b9 = findViewById(R.id.nine);
        b0 = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);
        ce = findViewById(R.id.ce);
        c = findViewById(R.id.c);
        bs = findViewById(R.id.bs);
        addnsub = findViewById(R.id.addnsub);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        addnsub.setOnClickListener(this);
        ce.setOnClickListener(this);
        c.setOnClickListener(this);
        bs.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {
        if (view.getId() == b1.getId()) txt2.setText(txt2.getText()+"1");
        if (view.getId() == b2.getId()) txt2.setText(txt2.getText()+"2");
        if (view.getId() == b3.getId()) txt2.setText(txt2.getText()+"3");
        if (view.getId() == b4.getId()) txt2.setText(txt2.getText()+"4");
        if (view.getId() == b5.getId()) txt2.setText(txt2.getText()+"5");
        if (view.getId() == b6.getId()) txt2.setText(txt2.getText()+"6");
        if (view.getId() == b7.getId()) txt2.setText(txt2.getText()+"7");
        if (view.getId() == b8.getId()) txt2.setText(txt2.getText()+"8");
        if (view.getId() == b9.getId()) txt2.setText(txt2.getText()+"9");
        if (view.getId() == b0.getId()) txt2.setText(txt2.getText()+"0");
        if (view.getId() == dot.getId()) txt2.setText(txt2.getText()+".");

        if(view.getId() == ce.getId()) txt2.setText("");
        if (view.getId() == bs.getId())
            txt2.setText(txt2.getText().toString().substring(0,txt2.getText().toString().length()-1));
        if(view.getId() == c.getId()) {
            txt2.setText(null);
            txt1.setText(null);
        }

        if (view.getId() == addnsub.getId()) txt2.setText("-" + txt2.getText());

        if (view.getId() == add.getId()) {
            txt1.setText(txt2.getText() + "+");
            var1 = Float.parseFloat(txt2.getText() + "");
            addition = true;
            txt2.setText(null);
        }
        if (view.getId() == sub.getId()) {
            txt1.setText(txt2.getText() + "-");
            var1 = Float.parseFloat(txt2.getText() + "");
            subtract = true;
            txt2.setText(null);
        }
        if (view.getId() == mul.getId()) {
            txt1.setText(txt2.getText() + "x");
            var1 = Float.parseFloat(txt2.getText() + "");
            multiply = true;
            txt2.setText(null);
        }
        if (view.getId() == div.getId()) {
            txt1.setText(txt2.getText() + "/");
            var1 = Float.parseFloat(txt2.getText() + "");
            division = true;
            txt2.setText(null);
        }

    equal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            txt1.setText(txt1.getText().toString() + txt2.getText().toString());
            var2 = Float.parseFloat(txt2.getText().toString());
            if (addition) {
                ans = var1 + var2;
            } else if (subtract) {
                ans = var1 - var2;
            } else if (multiply) {
                ans = var1 * var2;
            } else if (division) {
                ans = var1 / var2;
            } else {
                ans = ans + 0;
            }
            txt2.setText(ans.toString());
        }
    });
    }
}
