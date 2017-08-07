package com.asadmansoor.werise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    Button registerBtn;
    TextView alreadyMemberTv, impactInvestorTv;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle(R.string.login_activity_title);

        registerBtn = (Button) findViewById(R.id.register_btn);
        alreadyMemberTv = (TextView) findViewById(R.id.already_member_tv);
        impactInvestorTv = (TextView) findViewById(R.id.impact_investor_tv);

        registerBtn.setOnClickListener(this);
        alreadyMemberTv.setOnClickListener(this);
        impactInvestorTv.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register_btn:
                intent = new Intent(LoginActivity.this, RegisterAccountActivity.class);
                startActivity(intent);
                break;

            case R.id.already_member_tv:
                intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
                break;

            case R.id.impact_investor_tv:
                intent = new Intent(LoginActivity.this, ImpactInvestorActivity.class);
                startActivity(intent);
                break;

            default:
                break;

        }
    }
}
