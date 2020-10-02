package com.example.mylistdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView mobile;
String[] item={"Asus","Samsung","Moto","Oneplus","LG","HTC"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mobile=findViewById(R.id.mobile);
        ArrayAdapter ad=new ArrayAdapter(this,android.R.layout.simple_list_item_1,item);
        mobile.setAdapter(ad);
mobile.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this, "You have selected "+item[position], Toast.LENGTH_SHORT).show();
    }
});


    }
}
