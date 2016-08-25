package com.acadgild.s5A4LoginFunctionality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by sunny on 25/8/16.
 */
public class HomePage extends Activity {

    TextView welcomeUserText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Intent fromLoginPage = getIntent();
        welcomeUserText = (TextView) findViewById(R.id.welcome_user_text);
        welcomeUserText.setText(fromLoginPage.getStringExtra("userName"));
    }
}
