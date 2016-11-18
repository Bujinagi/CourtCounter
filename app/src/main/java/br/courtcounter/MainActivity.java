package br.courtcounter;

import android.content.DialogInterface;
import android.media.MediaPlayer;
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
    private MediaPlayer sound1;
    private MediaPlayer sound2;
    private MediaPlayer sound3;
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
        sound1 = MediaPlayer.create(this , R.raw.airhorn);
        sound2 = MediaPlayer.create(this , R.raw.hitmarker);
        sound3 = MediaPlayer.create(this , R.raw.hitmarkerz);

    }

    public void clickFunction1(View view){
        sound2.start();
        a++;
        counts.setText(String.valueOf(a));
        counts.setText(""+a);
    }

    public void clickFunction2(View view){
        sound3.start();
        b++;
        counts2.setText(String.valueOf(b));
        counts2.setText(""+b);
    }

    public void clickFunction4(View view){
        sound2.start();
        a--;
        counts.setText(String.valueOf(a));
        counts.setText(""+a);
    }

    public void clickFunction5(View view){
        sound3.start();
        b--;
        counts2.setText(String.valueOf(b));
        counts2.setText(""+b);
    }

    public void clickFunction3(View view){

        gameOverAlert.setTitle("Alert Text");
        gameOverAlert.setMessage("Message Text");

        sound1.start();

        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        gameOverAlert.show();

        if(a > b) {
            gameOverAlert.setTitle("CLG! CLG!");
            gameOverAlert.setMessage("Counter Logic Gaming wins!");
        }

        if(b > a) {
            gameOverAlert.setTitle("TSM! TSM!");
            gameOverAlert.setMessage("Team SoloMid wins!");
        }

        if(a == b) {
            gameOverAlert.setTitle("?!");
            gameOverAlert.setMessage("Draw! Neither team wins!");
        }


        counts.setText("0");
        counts2.setText("0");
        this.a = 0;
        this.b = 0;
    }

}
