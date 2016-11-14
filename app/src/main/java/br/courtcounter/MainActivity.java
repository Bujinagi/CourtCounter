package br.courtcounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private TextView counts;
    private TextView counts2;
    private static int a;
    private static int b;
    AlertDialog gameOverAlert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counts = (TextView)findViewById(R.id.count);
        counts.setText(String.valueOf(a));
        counts2 = (TextView)findViewById(R.id.count2);
        counts2.setText(String.valueOf(b));
        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();

    }

    public void clickFunction1(View view){
        counts.setText(String.valueOf(a));
        a++;
        counts.setText(""+a);
    }

    public void clickFunction2(View view){
        counts2.setText(String.valueOf(b));
        b++;
        counts2.setText(""+b);
    }

    public void clickFunction3(View view){
        counts.setText("0");
        counts2.setText("0");
        this.a = 0;
        this.b = 0;
        gameOverAlert.setTitle("Alert Title");
        gameOverAlert.setMessage("Message Text");

        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        gameOverAlert.show();

        if(a > b) {
            gameOverAlert.setMessage("Counter Logic Gaming wins!");
        }

        if(b > a) {
            gameOverAlert.setMessage("Team SoloMid wins!");
        }

        if(a == b) {
            gameOverAlert.setMessage("Draw! Neither team wins!");
        }
    }

}
