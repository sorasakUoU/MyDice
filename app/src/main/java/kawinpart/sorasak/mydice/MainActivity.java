package kawinpart.sorasak.mydice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView DiceImageView;
    private Button BackButton, ForwardButton, RandomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindwidget();
        BackController();
        ForwardController();
        RandomConttroller();


    }

    private void RandomConttroller() {

        RandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void ForwardController() {

        ForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void BackController() {

        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void bindwidget() {

        DiceImageView = (ImageView) findViewById(R.id.DiceimageView);
        RandomButton = (Button) findViewById(R.id.Randombutton);
        ForwardButton = (Button) findViewById(R.id.ForwardButton);
        BackButton = (Button) findViewById(R.id.BackButton);


    }
}
