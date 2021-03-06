package omaru.tumblr.com.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button leftButton = (Button)findViewById(R.id.rollButton);
        final ImageView leftImage = (ImageView)findViewById(R.id.leftDice);
        final ImageView rightImage = (ImageView) findViewById(R.id.rightDice);
        final int[] arrayDice={
          R.drawable.dice1,
          R.drawable.dice2,
          R.drawable.dice3,
          R.drawable.dice4,
          R.drawable.dice5,
          R.drawable.dice6,
        };
        final Random random = new Random();
        leftImage.setImageResource(arrayDice[random.nextInt(6)]);
        rightImage.setImageResource(arrayDice[random.nextInt(6)]);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Dicee","User entered onclick");
                Log.d("Dicee","randomizing left image");
                leftImage.setImageResource(arrayDice[random.nextInt(6)]);
                Log.d("Dicee","randomizing right image");
                rightImage.setImageResource(arrayDice[random.nextInt(6)]);
            }
        });
    }
}
