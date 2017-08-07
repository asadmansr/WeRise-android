package com.asadmansoor.werise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// TODO Feature validationText: validate the editText inputs when clicking save
// TODO Feature editProfilePicture: allow users to upload profile picture from gallery

public class RegisterAccountActivity extends AppCompatActivity implements View.OnClickListener {

    TextView selected_causes_tv;
    EditText name_et, about_et, location_et;
    ImageView profile_iv, edit_profile_iv;
    ArrayList<String> causes_list;
    ArrayList<String> selected_causes_list;
    RecyclerView causes_rv;
    CausesAdapter causesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.create_account_title);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        selected_causes_list = new ArrayList<>();
        causes_rv = (RecyclerView) findViewById(R.id.causes_rv);
        selected_causes_tv = (TextView) findViewById(R.id.selected_causes_tv);
        name_et = (EditText) findViewById(R.id.name_et);
        about_et = (EditText) findViewById(R.id.about_et);
        location_et = (EditText) findViewById(R.id.location_et);
        profile_iv = (ImageView) findViewById(R.id.profile_pic_iv);
        edit_profile_iv = (ImageView) findViewById(R.id.edit_profile_pic_iv);

        generateCausesArrayList();

        causesAdapter = new CausesAdapter(causes_list,this);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        causes_rv.setLayoutManager(horizontalLayoutManagaer);
        causes_rv.setAdapter(causesAdapter);

    }


    // Populate the list of causes that the user can select/deselect
    private void generateCausesArrayList(){
        causes_list = new ArrayList<>();
        causes_list.add("Education");
        causes_list.add("Environment");
        causes_list.add("Health Care");
        causes_list.add("Peace");
    }


    // Add selected causes to the arrayList and print them accordingly
    public void addSelectedItem(String item){
        selected_causes_list.add(item);
        printSelectedCauses(selected_causes_list);
    }


    // Remove last selected causes from arrayList and print them accordingly
    public void removeSelectedItem(String item){
        selected_causes_list.remove(item);
        printSelectedCauses(selected_causes_list);
    }


    private void printSelectedCauses(ArrayList<String> selectedCausesList){
        String selectedCausesStr = "";
        for (int i=0;i<selectedCausesList.size();i++){
            selectedCausesStr = selectedCausesStr+selectedCausesList.get(i)+", ";
        }

        if (selectedCausesList.size()>0) {
            selected_causes_tv.setText(selectedCausesStr.substring(0, selectedCausesStr.length() - 2));
        } else if (selectedCausesList.size()==0){
            selected_causes_tv.setText("");
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            default:
                break;
        }
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
                Intent intent = new Intent(RegisterAccountActivity.this, Project.class);
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
