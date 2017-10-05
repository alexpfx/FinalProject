package alexpfx.github.jokeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeViewActivity extends AppCompatActivity {

    public static final String KEY_JOKE = "KEY_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_view);

        TextView textView = (TextView) findViewById(R.id.text_joke);

        if (getIntent().hasExtra(KEY_JOKE)){
            String joke = getIntent().getStringExtra(KEY_JOKE);
            textView.setText(joke);
        }

    }
}
