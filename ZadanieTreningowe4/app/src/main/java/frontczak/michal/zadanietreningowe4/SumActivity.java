package frontczak.michal.zadanietreningowe4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    private TextView sumaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        Intent i = getIntent();

        Float l1 = i.getFloatExtra("liczba1", 0);
        Float l2 = i.getFloatExtra("liczba2", 0);

        Float suma = l1 + l2;

        sumaTextView = (TextView) findViewById(R.id.sumaTextView);

        sumaTextView.setText(suma.toString());
    }
}
