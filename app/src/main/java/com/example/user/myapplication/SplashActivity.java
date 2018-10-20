package com.example.user.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    protected void onCreate(Bundle savedlnstanceState){
        super.onCreate(savedlnstanceState);

        try{
            Thread.sleep(3000);//대기초3초
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//end of try catch

        startActivity(new Intent(this,MainActivity.class));
        finish();

    }//end of onCreate

}
