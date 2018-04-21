package com.androiddesdecero.proguardandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.androiddesdecero.proguardandroid.user.UserPrueba;

public class MainActivity extends AppCompatActivity {

    UserPrueba user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = new UserPrueba();
        user.getEmailProfessor();
        user.setEmailProfessor("alberto");
    }
}
