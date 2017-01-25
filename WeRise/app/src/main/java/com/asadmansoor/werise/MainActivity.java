package com.asadmansoor.werise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button registerBtn;
    TextView alreadyMemberTv, impactInvestorTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(" ");

        registerBtn = (Button) findViewById(R.id.register_btn);
        alreadyMemberTv = (TextView) findViewById(R.id.already_member_btn);
        impactInvestorTv = (TextView) findViewById(R.id.impact_investor_btn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CreateAccount.class);
                startActivity(intent);
            }
        });

        alreadyMemberTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

        impactInvestorTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Investor.class);
                startActivity(intent);
            }
        });
    }
}
