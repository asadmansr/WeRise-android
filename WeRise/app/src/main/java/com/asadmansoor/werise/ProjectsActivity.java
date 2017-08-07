package com.asadmansoor.werise;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProjectsActivity extends AppCompatActivity implements View.OnClickListener {

    Button createProjectBtn, joinProjectBtn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        getSupportActionBar().setTitle(R.string.project_screen_title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        createProjectBtn = (Button) findViewById(R.id.create_project_btn);
        joinProjectBtn = (Button) findViewById(R.id.join_project_btn);

        createProjectBtn.setOnClickListener(this);
        joinProjectBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.create_project_btn:
                intent = new Intent(ProjectsActivity.this,CreateProjectActivity.class);
                startActivity(intent);
                break;

            case R.id.join_project_btn:
                Snackbar snackbar = Snackbar.make(v,"Coming soon. Please try again later.",Snackbar.LENGTH_LONG);
                snackbar.show();
                break;

            default:
                break;
        }
    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
