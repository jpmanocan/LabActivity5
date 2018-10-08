package com.manocan.johnphillip;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        setTitle("Activity 2");
        Log.d("4ITH", "onCreate() has sucessfully executed");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("4ITH","onResume() has sucessfully executed");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("4ITH","onPause() has sucessfully executed");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("4ITH","onStop() has sucessfully executed");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("4ITH","onDestroy() has sucessfully executed");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("4ITH","onRestart() has sucessfully executed");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v)
    {
        Intent i = null;
        Intent chooser = null;

        //passing into another page
        if(v.getId()==R.id.activityOne)
        {
            i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
        //implicit intent
        //opening a map
        if(v.getId()==R.id.activityTwoMap)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 11.164976, 119.397253"));
            chooser = Intent.createChooser(i,"Select a map");
            startActivity(chooser);
        }
    }

}
