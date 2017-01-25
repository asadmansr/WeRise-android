package com.asadmansoor.werise;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {

    TextView education_tv, healthcare_tv, environment_tv, peace_tv;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Create an Account");

        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        education_tv = (TextView) findViewById(R.id.education_tv);
        healthcare_tv = (TextView) findViewById(R.id.healthcare_tv);
        environment_tv = (TextView) findViewById(R.id.environment_tv);
        peace_tv = (TextView) findViewById(R.id.peace_tv);

        education_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((a % 2) == 0){
                    education_tv.setBackgroundResource(R.drawable.text_color_background);
                    education_tv.setTextColor(getResources().getColor(R.color.white));
                } else {
                    education_tv.setBackgroundResource(R.drawable.text_background);
                    education_tv.setTextColor(getResources().getColor(R.color.background_color));

                }

                a++;
            }
        });

        healthcare_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((b % 2) == 0){
                    healthcare_tv.setBackgroundResource(R.drawable.text_color_background);
                    healthcare_tv.setTextColor(getResources().getColor(R.color.white));
                } else {
                    healthcare_tv.setBackgroundResource(R.drawable.text_background);
                    healthcare_tv.setTextColor(getResources().getColor(R.color.background_color));
                }
                b++;
            }
        });

        environment_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((c % 2) == 0){
                    environment_tv.setBackgroundResource(R.drawable.text_color_background);
                    environment_tv.setTextColor(getResources().getColor(R.color.white));
                } else {
                    environment_tv.setBackgroundResource(R.drawable.text_background);
                    environment_tv.setTextColor(getResources().getColor(R.color.background_color));
                }
                c++;
            }
        });

        peace_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((d % 2) == 0){
                    peace_tv.setBackgroundResource(R.drawable.text_color_background);
                    peace_tv.setTextColor(getResources().getColor(R.color.white));
                } else {
                    peace_tv.setBackgroundResource(R.drawable.text_background);
                    peace_tv.setTextColor(getResources().getColor(R.color.background_color));
                }
                d++;
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
                Intent intent = new Intent(CreateAccount.this, Project.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
