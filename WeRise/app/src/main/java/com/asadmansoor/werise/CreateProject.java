package com.asadmansoor.werise;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CreateProject extends AppCompatActivity {

    ImageView theme1,theme2,theme3,theme4;
    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        getSupportActionBar().setTitle("Create Project");

        theme1 = (ImageView) findViewById(R.id.theme1);
        theme2 = (ImageView) findViewById(R.id.theme2);
        theme3 = (ImageView) findViewById(R.id.theme3);
        theme4 = (ImageView) findViewById(R.id.theme4);

        tv1 = (TextView) findViewById(R.id.education_text);
        tv2 = (TextView) findViewById(R.id.healthcare_text);
        tv3 = (TextView) findViewById(R.id.environment_text);
        tv4 = (TextView) findViewById(R.id.peace_text);




        theme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setTypeface(null, Typeface.BOLD);
                tv2.setTypeface(null, Typeface.NORMAL);
                tv3.setTypeface(null, Typeface.NORMAL);
                tv4.setTypeface(null, Typeface.NORMAL);

            }
        });

        theme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setTypeface(null, Typeface.NORMAL);
                tv2.setTypeface(null, Typeface.BOLD);
                tv3.setTypeface(null, Typeface.NORMAL);
                tv4.setTypeface(null, Typeface.NORMAL);

            }
        });

        theme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setTypeface(null, Typeface.NORMAL);
                tv2.setTypeface(null, Typeface.NORMAL);
                tv3.setTypeface(null, Typeface.BOLD);
                tv4.setTypeface(null, Typeface.NORMAL);

            }
        });

        theme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setTypeface(null, Typeface.NORMAL);
                tv2.setTypeface(null, Typeface.NORMAL);
                tv3.setTypeface(null, Typeface.NORMAL);
                tv4.setTypeface(null, Typeface.BOLD);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.next_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.next:
                Intent intent = new Intent(CreateProject.this, Dashboard.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
