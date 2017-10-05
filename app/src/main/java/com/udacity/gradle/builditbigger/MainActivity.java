package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.Toast;

import alexpfx.github.jokeview.JokeViewActivity;


public class MainActivity extends AppCompatActivity implements EndPointAsyncTask.Listener {

    private FrameLayout frameLayout;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout = (FrameLayout) findViewById(R.id.fragment_container);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


    }


    @Override
    protected void onResume() {
        super.onResume();
        hideLoading();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        EndPointAsyncTask endPointAsyncTask = new EndPointAsyncTask(this);
        endPointAsyncTask.execute();
        showLoading ();
    }

    private void showLoading() {
        frameLayout.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);
    }

    private void hideLoading (){
        frameLayout.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.INVISIBLE);
    }


    @Override
    public void onResult(String joke) {
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), JokeViewActivity.class);
        intent.putExtra(JokeViewActivity.KEY_JOKE, joke);
        startActivity(intent);
    }
}
