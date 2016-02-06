package com.example.nabeel.crunchtime;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edit1, edit2, edit3, edit4;
    Button button;
    Button button2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        edit1 = (EditText) findViewById(R.id.editText);
        edit2 = (EditText) findViewById(R.id.editText2);
        edit3 = (EditText) findViewById(R.id.editText3);
        edit4 = (EditText) findViewById(R.id.editText4);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);

        /**FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
         fab.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show();
        }
        });*/

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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

    /**
     * public void onRadioButtonClicked(View view) {
     * // Is the button now checked?
     * boolean checked = ((RadioButton) view).isChecked();
     * // Check which radio button was clicked
     * switch(view.getId()) {
     * case R.id.radio_pushups:
     * if (checked)
     * break;
     * case R.id.radio_situps:
     * if (checked)
     * break;
     * case R.id.radio_jumpingjacks:
     * if (checked)
     * break;
     * case R.id.radio_jogging:
     * if (checked)
     * break;
     * }
     * switch(view.getId()) {
     * case R.id.radio_reps:
     * if (checked)
     * break;
     * case R.id.radio_mins:
     * if (checked)
     * break;
     * }
     * }
     */

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                if ((edit1.getText().toString().length()) > 0) {
                    int e1 = Integer.parseInt(edit1.getText().toString());
                    double e2 = e1 / 1.75;
                    double e3 = e1 * 12 / 350;
                    double e4 = e1 / 35.0;
                    double c1 = e1/3.5;
                    double c2 = e2/2.0;
                    double c3 = e3*100/12;
                    double c4 = e4*10.0;
                    edit1.setText("" + e1 + " or " + Math.round(c1*100d)/100d + " cals");
                    edit2.setText("" + Math.round(e2*100d)/100d + " or " + Math.round(c1*100d)/100d + " cals");
                    edit3.setText("" + Math.round(e3*100d)/100d + " or " + Math.round(c1*100d)/100d + " cals");
                    edit4.setText("" + Math.round(e4*100d)/100d + " or " + Math.round(c1*100d)/100d + " cals");
                } else if ((edit2.getText().toString().length()) > 0) {
                    int ed2 = Integer.parseInt(edit2.getText().toString());
                    double ed1 = ed2 * 1.75;
                    double ed3 = ed2 * 12 / 200;
                    double ed4 = ed2 / 20.0;
                    double c1 = ed1/3.5;
                    double c2 = ed2/2.0;
                    double c3 = ed3*100/12;
                    double c4 = ed4*10.0;
                    edit1.setText("" + Math.round(ed1*100d)/100d + " or " + Math.round(c2*100d)/100d + " cals");
                    edit2.setText("" + ed2 + " or " + Math.round(c2*100d)/100d + " cals");
                    edit3.setText("" + Math.round(ed3*100d)/100d + " or " + Math.round(c2*100d)/100d + " cals");
                    edit4.setText("" + Math.round(ed4*100d)/100d + " or " + Math.round(c2*100d)/100d + " cals");
                } else if ((edit3.getText().toString().length()) > 0) {
                    int edi3 = Integer.parseInt(edit3.getText().toString());
                    double edi1 = edi3 * 350 / 12;
                    double edi2 = edi3 * 200 / 12;
                    double edi4 = edi3 * 10 / 12;
                    double c1 = edi1/3.5;
                    double c2 = edi2/2.0;
                    double c3 = edi3*100/12;
                    double c4 = edi4*10.0;
                    edit1.setText("" + Math.round(edi1*100d)/100d + " or " + Math.round(c3*100d)/100d + " cals");
                    edit2.setText("" + Math.round(edi2*100d)/100d + " or " + Math.round(c3*100d)/100d + " cals");
                    edit3.setText("" + edi3 + " or " + Math.round(c3*100d)/100d + " cals");
                    edit4.setText("" + Math.round(edi4*100d)/100d + " or " + Math.round(c3*100d)/100d + " cals");
                } else {
                    int edits4 = Integer.parseInt(edit4.getText().toString());
                    double edits1 = edits4 * 35.0;
                    double edits2 = edits4 * 20.0;
                    double edits3 = edits4 * 12 / 10;
                    double c1 = edits1/3.5;
                    double c2 = edits2/2.0;
                    double c3 = edits3*100/12;
                    double c4 = edits4*10.0;
                    edit1.setText("" + Math.round(edits1*100d)/100d + " or " + Math.round(c4*100d)/100d + " cals");
                    edit2.setText("" + Math.round(edits2*100d)/100d + " or " + Math.round(c4*100d)/100d + " cals");
                    edit3.setText("" + Math.round(edits3*100d)/100d + " or " + Math.round(c4*100d)/100d + " cals");
                    edit4.setText("" + edits4 + " or " + Math.round(c4*100d)/100d + " cals");
                }
                break;
            case R.id.button2:
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
                break;
        }
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.nabeel.crunchtime/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.nabeel.crunchtime/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
