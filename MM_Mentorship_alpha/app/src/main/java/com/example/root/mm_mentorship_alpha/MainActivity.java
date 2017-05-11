package com.example.root.mm_mentorship_alpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class  MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        //myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("https://mentor-mentee-app.herokuapp.com/");


        String token = FirebaseInstanceId.getInstance().getToken();
        // Log and toast
        String msg = getString(R.string.msg_token_fmt, token);
        Log.d(TAG, msg);
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
//            case R.id.login:
//                Intent intent = new Intent(this, LoginActivity.class);
//                this.startActivity(intent);
//                break;
            case R.id.mentees:
                Intent intent2 = new Intent(this, Mentees.class);
                this.startActivity(intent2);
                break;
            case R.id.mentors:
                Intent intent3 = new Intent(this, Mentors.class);
                this.startActivity(intent3);
                break;

            case R.id.requests:
                Intent intent4 = new Intent(this, Requests.class);
                this.startActivity(intent4);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }
}


