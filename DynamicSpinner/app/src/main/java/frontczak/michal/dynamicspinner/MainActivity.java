package frontczak.michal.dynamicspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner sp;
    private ArrayList<CharSequence> lista;
    private ArrayAdapter<CharSequence> adapter;
    private EditText et;
    private Button b;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner) findViewById(R.id.spinner);

        lista = new ArrayList<CharSequence>();

        lista.add("Krakow");
        lista.add("Warszawa");
        lista.add("Gdansk");
        lista.add("Kamien");
        lista.add("Michałoowice");
        lista.add("Zielonki");
        lista.add("Wolbrom");

        adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item, lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(adapter);

        b = (Button) findViewById(R.id.button);
        et = (EditText) findViewById(R.id.editText);

        b.setOnClickListener(this);

        tv=(TextView)findViewById(R.id.textView);

        AdapterView.OnItemSelectedListener sluchacz = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                tv.setText(lista.get(i));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                tv.setText("");
            }
        };

        sp.setOnItemSelectedListener(sluchacz);
    }

    @Override
    public void onClick(View v) {
        String s = et.getText().toString();
        if(s.length() > 0) {
            lista.add(s);
            et.setText("");
        }
    }
}
