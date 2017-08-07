package com.asadmansoor.werise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class ImpactInvestorActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView mBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impact_investor);

        mBackButton = (ImageView) findViewById(R.id.back_btn);
        mBackButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_btn:
                finish();
                break;

            default:
                break;
        }
    }
}
