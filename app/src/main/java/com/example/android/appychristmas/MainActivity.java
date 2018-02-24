package com.example.android.appychristmas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;
    public Button button4;
    public void init() {
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent toy = new Intent(MainActivity.this, appychristmas2.class);
                startActivity(toy);
            }
        });
    }
Button b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        final_text = (TextView) findViewById(R.id.final_result);
        final_text.setEnabled(false);
        init();

        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
    }


    public void ok(View view){
                b4.setVisibility(View.VISIBLE);
}

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBoxWalde:

                if (checked) {
                    selection.add("Walde förtjänar en julklapp");
                } else {
                    selection.remove("Walde förtjänar en julklapp");
                }
                break;

            case R.id.checkBoxMolde:

                if (checked) {
                    selection.add("Molde förtjänar en julklapp");
                } else {
                    selection.remove("Molde förtjänar en julklapp");
                }
                break;

            case R.id.checkBoxNicole:

                if (checked) {
                    selection.add("Nicole förtjänar en julklapp");
                } else {
                    selection.remove("Nicole förtjänar en julklapp");
                }
                break;
        }
    }

    public void finalSelection(View view) {
        String final_selection = "";

        for (String Selections : selection) {
            final_selection = final_selection + Selections + "\n";
        }
        final_text.setText(final_selection);
        final_text.setEnabled(true);
    }

}

