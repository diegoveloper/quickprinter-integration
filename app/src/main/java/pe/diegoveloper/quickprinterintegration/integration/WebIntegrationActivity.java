package pe.diegoveloper.quickprinterintegration.integration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import pe.diegoveloper.quickprinterintegration.R;

public class WebIntegrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_integration);
        WebView webView = (WebView)findViewById(R.id.webview);

        //IF YOU ARE USING CUSTOM WEBVIEW CLIENT, CHECK THIS CLASS
        //webView.setWebViewClient(new CustomWebViewClient(this));

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/web_example.html");  //Look at the assets folder
    }

}
