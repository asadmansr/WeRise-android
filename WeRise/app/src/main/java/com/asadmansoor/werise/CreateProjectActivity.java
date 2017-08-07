package com.asadmansoor.werise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

// TODO Feature addSelectedThemeIndicator: Allow the user to see which theme they had selected

public class CreateProjectActivity extends AppCompatActivity {

    ThemesAdapter themesAdapter;
    RecyclerView themes_rv;
    ArrayList<String> themeText;
    ArrayList<Integer> themeImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        getSupportActionBar().setTitle(R.string.create_project_screen_title);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        themes_rv = (RecyclerView) findViewById(R.id.theme_rv);

        generateThemeList();

        themesAdapter = new ThemesAdapter(themeText,themeImageView,this);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        themes_rv.setLayoutManager(horizontalLayoutManager);
        themes_rv.setAdapter(themesAdapter);

    }

    private void generateThemeList(){
        themeText = new ArrayList<>();
        themeImageView = new ArrayList<>();

        themeText.add("Education");
        themeImageView.add(R.drawable.education);
        themeText.add("Health Care");
        themeImageView.add(R.drawable.healthcare);
        themeText.add("Environment");
        themeImageView.add(R.drawable.environment);
        themeText.add("Peace");
        themeImageView.add(R.drawable.peace);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.next_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save:
                Intent intent = new Intent(CreateProjectActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
