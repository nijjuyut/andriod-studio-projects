package com.example.callsmsweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button c,s,w,mm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = findViewById(R.id.call);
        s = findViewById(R.id.sms);
        w = findViewById(R.id.web);
        mm = findViewById(R.id.mm);
        mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent();
                i4.setType("text/plain");
                i4.setAction(Intent.ACTION_SEND);
                i4.putExtra(Intent.EXTRA_TEXT,"come to bday with a gift");
                startActivity(Intent.createChooser(i4,"Hardik app"));
            }
        });





        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alone = new Intent();
                alone.setAction(Intent.ACTION_CALL);
                alone.setData(Uri.parse("tel:7619634485"));
                startActivity(alone);
                //Above line will make a call.
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent();
                i2.setAction(Intent.ACTION_SENDTO);
                i2.setData(Uri.parse("smsto:7619634485"));
                startActivity(i2);
                //Above line will send the message.
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent();
                i3.setAction(Intent.ACTION_VIEW);
                i3.setData(Uri.parse("https://www.google.com"));
                startActivity(i3);
            }
        });
    }
}
