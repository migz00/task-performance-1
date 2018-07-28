package com.migue.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void postDetails(View view)
    {
        EditText et1 = (EditText) findViewById(R.id.et_first);
        EditText et2 = (EditText) findViewById(R.id.et_middle);
        EditText et3 = (EditText) findViewById(R.id.et_last);

        String store1 = "Firstname: "+et1.getText().toString();
        String store2 = "Middlename: "+et2.getText().toString();
        String store3 = "Lastname: "+et3.getText().toString();

        Log.d(TAG, store1);
        Log.d(TAG, store2);
        Log.d(TAG, store3);
    }
}
