
package com.codec.hunter;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends Activity {

    private WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        browser = new WebView(this);

        WebSettings settings = browser.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        browser.setWebViewClient(new WebViewClient());

        setContentView(browser);

        browser.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public void onBackPressed() {
        if (browser != null && browser.canGoBack()) {
            browser.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

