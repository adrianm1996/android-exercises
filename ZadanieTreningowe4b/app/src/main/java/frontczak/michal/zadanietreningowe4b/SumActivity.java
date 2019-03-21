package frontczak.michal.zadanietreningowe4b;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SumActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText liczba1et;
    private EditText liczba2et;

    private Button anulujBt;
    private Button sumujBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        anulujBt = (Button) findViewById(R.id.anulujbt);
        sumujBt = (Button) findViewById(R.id.sumujbt);

        liczba1et = (EditText) findViewById(R.id.liczba1et);
        liczba2et = (EditText) findViewById(R.id.liczba2et);

        anulujBt.setOnClickListener(this);
        sumujBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, MainActivity.class);
        switch(view.getId()) {
            case R.id.anulujbt:
                setResult(Activity.RESULT_CANCELED);
                finish();
                break;
            case R.id.sumujbt:
                String s1 = liczba1et.getText().toString();
                String s2 = liczba2et.getText().toString();
                if(s1.length() > 0 && s2.length() > 0) {
                    Float l1 = Float.valueOf(s1);
                    Float l2 = Float.valueOf(s2);
                    i.putExtra("liczba1", l1);
                    i.putExtra("liczba2", l2);
                    setResult(Activity.RESULT_OK, i);
                    finish();
                }
                break;
        }
    }
}
