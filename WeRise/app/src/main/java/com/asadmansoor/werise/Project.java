package com.asadmansoor.werise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Project extends AppCompatActivity {

    Button createProject, viewProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        getSupportActionBar().setTitle("Projects");

        createProject = (Button) findViewById(R.id.create_project);
        viewProject = (Button) findViewById(R.id.view_project);

        createProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Project.this,CreateProject.class);
                startActivity(intent);
            }
        });

        viewProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Project.this,Project.class);
                startActivity(intent);
            }
        });

    }
}
