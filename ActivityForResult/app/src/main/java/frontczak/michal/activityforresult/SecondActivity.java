package frontczak.michal.activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Button addB;
    private Button cancelB;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        addB = (Button) findViewById(R.id.Add_Button);
        cancelB = (Button) findViewById(R.id.Cancel_Button);
        et = (EditText) findViewById(R.id.editText);

        addB.setOnClickListener(this);
        cancelB.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.Add_Button:
                if(et.getText().length() > 0) {
                    Intent i = new Intent();
                    i.putExtra("notatka", et.getText().toString());
                    setResult(Activity.RESULT_OK, i);
                    finish();
                }
                break;
            case R.id.Cancel_Button:
                setResult(Activity.RESULT_CANCELED);
                finish();
                break;
        }
    }
}
