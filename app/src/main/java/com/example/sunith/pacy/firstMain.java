package com.example.sunith.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by sunith on 15-10-2017.
 */

public class firstMain extends AppCompatActivity implements View.OnClickListener {
    GridView gv;
    //GridAdapter ga;
    String [] name={"Begge","Medium","Advace","Race a question","About Us","Visit our site"};
    //int [] img={"","","","","","",""};

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "hai", Toast.LENGTH_SHORT).show();
    }
}
