package frontczak.michal.zadanietreningowe4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText liczba1;
    private EditText liczba2;

    private Button sumuj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liczba1 = (EditText) findViewById(R.id.liczba1);
        liczba2 = (EditText) findViewById(R.id.liczba2);

        sumuj = (Button) findViewById(R.id.sumuj);

        sumuj.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, SumActivity.class);
        Float l1 = Float.valueOf(liczba1.getText().toString());
        Float l2 = Float.valueOf(liczba2.getText().toString());
        i.putExtra("liczba1", l1);
        i.putExtra("liczba2", l2);
        startActivity(i);
    }
}
