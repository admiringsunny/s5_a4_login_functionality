package com.acadgild.s5A4LoginFunctionality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText emailTextBox, passwordTextBox;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        emailTextBox = (EditText) findViewById(R.id.email);
        passwordTextBox = (EditText) findViewById(R.id.password);

        loginButton = (Button) findViewById(R.id.loginButton);
    }

    public void validateForNullValues(View v){
        String email = emailTextBox.getText().toString();
        String password = passwordTextBox.getText().toString();

        if (getResources().getString(R.string.user_name).equalsIgnoreCase(email)
                &&
                getResources().getString(R.string.password).equals(password)) {
            Intent toHomePage = new Intent(getApplicationContext(), HomePage.class);
            toHomePage.putExtra("userName", getResources().getString(R.string.greet_usr) + " " + email);
            startActivity(toHomePage);
        }
        else if (email.length() == 0)
            emailTextBox.setError(getResources().getString(R.string.edittext_empty_error));

        else if (password.length() == 0)
            passwordTextBox.setError(getResources().getString(R.string.edittext_empty_error));

        else
            Toast.makeText(this, getResources().getString(R.string.incorrect_credentials_error), Toast.LENGTH_SHORT).show();

    }
}
