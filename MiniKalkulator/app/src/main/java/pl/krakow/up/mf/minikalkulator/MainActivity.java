package pl.krakow.up.mf.minikalkulator;

import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button bp;
    private Button bm;

    private EditText wart1;
    private EditText wart2;

    private TextView wynik;
    private TextView kolor;

    private CheckBox cb;

    private RadioGroup rgc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bp = (Button) findViewById(R.id.ButtonPlus);
        bm = (Button) findViewById(R.id.ButtonMinus);

        wart1 = (EditText) findViewById(R.id.Wartosc1);
        wart2 = (EditText) findViewById(R.id.Wartosc2);

        wynik = (TextView) findViewById(R.id.TextResult);
        kolor = (TextView) findViewById(R.id.textView3);


        rgc = (RadioGroup) findViewById(R.id.RgColor);

        cb = (CheckBox) findViewById(R.id.checkBox);

        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wynik.setText(Double.toString(Double.valueOf(wart1.getText().toString()) + Double.valueOf(wart2.getText().toString())));

            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wynik.setText(Double.toString(Double.valueOf(wart1.getText().toString()) - Double.valueOf(wart2.getText().toString())));
            }
        });

        rgc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton rb = (RadioButton) findViewById(i);
                if(cb.isChecked()) {
                    kolor.setText(rb.getText());
                } else {
                    kolor.setText("Kolor");
                }
            }
        });
    }

}
