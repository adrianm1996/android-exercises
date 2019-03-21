package pl.krakow.up.mf.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_me(View v) {
        Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_SHORT);


    }
}
