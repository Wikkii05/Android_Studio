package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstPage extends MainActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.first);

        TextView Name =(TextView) findViewById(R.id.editTextTextPersonName);
        TextView Username =(TextView) findViewById(R.id.editTextTextPersonName2);
        TextView Emailaddress =(TextView) findViewById(R.id.editTextTextPersonName3);
        TextView Password =(TextView) findViewById(R.id.editTextTextPersonName4);
        TextView Confirm =(TextView) findViewById(R.id.editTextTextPersonName5);
        Button but =findViewById(R.id.button);

       but.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (Name.getText().toString().equals("admin")&& Username,getText().toString().equals("admin")){
           }
       });

    }
}
