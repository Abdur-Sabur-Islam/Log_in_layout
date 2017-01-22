package com.bproperty.textinputlayoutexample;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextInputLayout textInputLayoutEmail, textInputLayoutPassword;
    EditText userEmailEt, userPasswordEt;

    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.emailTextInputLayout);
        textInputLayoutPassword = (TextInputLayout) findViewById(R.id.passwordTextInputLayout);

        userEmailEt = (EditText) findViewById(R.id.emailEditText);
        userPasswordEt= (EditText) findViewById(R.id.passwordEditText);

        loginBtn = (Button) findViewById(R.id.signInButton);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = userEmailEt.getText().toString();
                String password = userPasswordEt.getText().toString();
                if(email.isEmpty() && password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Input valid data", Toast.LENGTH_SHORT).show();
                }else{
                    loginBtn.setText("Sing in Successfull");
                }
            }
        });
    }
}
