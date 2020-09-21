package com.example.laboratoire2_yassmineelw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_password;
    EditText et_mdpValid;
    CheckBox chk_mdp;

    String msg = "Android :";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_password = (EditText) findViewById(R.id.et_password);
        et_mdpValid = (EditText) findViewById(R.id.et_mdpValid);
        chk_mdp = (CheckBox) findViewById(R.id.chk_mdp);
    }
    public void onClickChk_conditions(View view) {
        if(chk_mdp.isChecked()) {
            et_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            et_mdpValid.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

        } else {
            et_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            et_mdpValid.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(msg, "The onRestart() event");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg,"The onPause() event");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg, "The onStop() event");
    }


}