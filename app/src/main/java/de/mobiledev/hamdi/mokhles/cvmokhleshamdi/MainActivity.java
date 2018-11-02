package de.mobiledev.hamdi.mokhles.cvmokhleshamdi;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle(getString(R.string.title_activity_welcome));
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

//
//    @OnClick(R.id.secHello)
//    void openHelloActivity() {
//        Intent hello = new Intent(HomeActivity.this, HelloActivity.class);
//        startActivity(hello);
//    }
//
//    @OnClick(R.id.secSkill)
//    void openSkillActivity() {
//        Intent skill = new Intent(HomeActivity.this, SkillActivity.class);
//        startActivity(skill);
//    }
//
//    // OnClick About open About Activity
//    @OnClick(R.id.secCertif)
//    void openCertifActivity() {
//            Intent certif = new Intent(HomeActivity.this, CertifActivity.class);
//            startActivity(certif);
//    }
//
//    @OnClick(R.id.secProject)
//    void openProjectDialog() {
//       Intent project = new Intent(HomeActivity.this, ProjectActivity.class);
//            startActivity(project);
//    }


    }
}