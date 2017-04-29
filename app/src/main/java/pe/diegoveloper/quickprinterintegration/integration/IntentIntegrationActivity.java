package pe.diegoveloper.quickprinterintegration.integration;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import pe.diegoveloper.quickprinterintegration.R;

public class IntentIntegrationActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_integration);
        editText = (EditText) findViewById(R.id.edittext);

        String commandsToPrint =
                "<LOGO>\n" +
                        "<BIG><BOLD><CENTER> Quick Printer <BR>\n" +
                        "<CENTER>San Francisco, USA<BR>\n" +
                        "<CENTER>9999-5555-666<BR>\n" +
                        "<BOLD>Quantity     Product    Subtotal<BR>\n" +
                        "<LEFT>2            XYZ        5<BR>\n" +
                        "<RIGHT><BOLD>Total $ 5.00<BR>\n" +
                        "<BR>\n" +
                        "<CUT>\n" +
                        "<DRAWER>\n" // OPEN THE CASH DRAWER
                ;

        editText.setText(commandsToPrint);
    }

    public void onClickPrint(View view) {
        String textToPrint = editText.getText().toString();
        try {

            Intent intent = new Intent("pe.diegoveloper.printing");
            intent.setType("text/plain");
            intent.putExtra(android.content.Intent.EXTRA_TEXT, textToPrint);
            startActivity(intent);

        } catch (ActivityNotFoundException ex) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=pe.diegoveloper.printerserverapp"));
            startActivity(intent);
        }
    }
}
