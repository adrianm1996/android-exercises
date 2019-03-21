package frontczak.michal.zadanietreningowe4b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final int SUM_VALUES_REQUEST = 111;

    private TextView sumatv;
    private Button nextbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumatv = (TextView) findViewById(R.id.sumatv);
        nextbt = (Button) findViewById(R.id.button);

        nextbt.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case MainActivity.SUM_VALUES_REQUEST:
                if (resultCode == RESULT_OK) {
                    Float l1 = data.getFloatExtra("liczba1", 0);
                    Float l2 = data.getFloatExtra("liczba2", 0);
                    Float suma = l1 + l2;
                    sumatv.setText(suma.toString());
                } else {
                    sumatv.setText("operacja została anulowana");
                }
                break;
        }
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this, SumActivity.class);
        startActivityForResult(i, MainActivity.SUM_VALUES_REQUEST);
    }
}
