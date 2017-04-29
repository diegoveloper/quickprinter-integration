package pe.diegoveloper.quickprinterintegration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pe.diegoveloper.quickprinterintegration.integration.IntentIntegrationActivity;
import pe.diegoveloper.quickprinterintegration.integration.WebIntegrationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickIntent(View view){
        Intent intent = new Intent(this, IntentIntegrationActivity.class);
        startActivity(intent);
    }

    public void onClickWeb(View view){
        Intent intent = new Intent(this, WebIntegrationActivity.class);
        startActivity(intent);
    }


}
