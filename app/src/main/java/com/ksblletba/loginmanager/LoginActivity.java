package com.ksblletba.loginmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity {

    private EditText usrEdit;
    private EditText pwdEdit;
    private Button btnSignup;
    private Button btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usrEdit = findViewById(R.id.user_input);
        pwdEdit = findViewById(R.id.pwd_input);
        btnSignup = findViewById(R.id.sign_up);
        btnSignin = findViewById(R.id.sign_in);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usrEdit.getText().toString();
                String pwd = pwdEdit.getText().toString();
                if(username.equals("ksballetba")&&pwd.equals("cool")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this,"用户名或者密码错误",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
