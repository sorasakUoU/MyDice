package kawinpart.sorasak.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView DiceImageView;
    private Button RandomButton;
    private ImageView ForwardButton, BackButton;
    private int intdice = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();
        BackController();
        ForwardController();
        RandomConttroller();
        DiceImageView();


    }

    private void DiceImageView() {

    }

    private void RandomConttroller() {

        RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRandomPicture(1);

                myRandomPicture(intdice);

            }
        });
    }

    private void ForwardController() {

        ForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRandomPicture(1);
                intdice -= 1;
                if (intdice == 0) {
                    intdice = 6;
                }
                changeplay(DiceImageView);


            }
        });
    }

    private void changeplay(ImageView diceImageView) {


        switch (intdice) {
            case 1:
                DiceImageView.setImageResource(R.drawable.dice1);
                break;
            case 2:
                DiceImageView.setImageResource(R.drawable.dice2);
                break;
            case 3:
                DiceImageView.setImageResource(R.drawable.dice3);
                break;
            case 4:
                DiceImageView.setImageResource(R.drawable.dice4);
                break;
            case 5:
                DiceImageView.setImageResource(R.drawable.dice5);
                break;
            case 6:
                DiceImageView.setImageResource(R.drawable.dice6);
                break;
        }
    }


    private void myRandomPicture(int i) {

    }

    private void BackController() {

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myRandomPicture(1);
                intdice -= 1;
                if (intdice == 0) {
                    intdice = 6;
                }
                changeplay(DiceImageView);
            }
        });
    }

    private void bindwidget() {

        DiceImageView = (ImageView) findViewById(R.id.DiceimageView);
        RandomButton = (Button) findViewById(R.id.Randombutton);
        ForwardButton = (ImageView) findViewById(R.id.ForwardButton);
        BackButton = (ImageView) findViewById(R.id.BackButton);


    }
}
