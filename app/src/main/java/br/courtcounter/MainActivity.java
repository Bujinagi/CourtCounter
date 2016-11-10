package br.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView counts;
    private TextView counts2;
    public int a;
    public int b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counts = (TextView)findViewById(R.id.count);
        counts.setText(String.valueOf(a));
        counts2 = (TextView)findViewById(R.id.count2);
        counts2.setText(String.valueOf(b));

    }

    public void clickFunction1(View view){
        counts.setText(String.valueOf(a));
        counts.setText(""+a);
        a++;
    }

    public void clickFunction2(View view){
        counts2.setText(String.valueOf(b));
        counts2.setText(""+b);
        b++;
    }


}
