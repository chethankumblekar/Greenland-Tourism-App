package com.kc.places;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Contactus extends AppCompatActivity {

    ImageView backcontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        TextView github = findViewById(R.id.github);
        github.setMovementMethod(LinkMovementMethod.getInstance());
//
//        TextView githubujwal = findViewById(R.id.githuujwal);
//        githubujwal.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkedin = findViewById(R.id.linkedin);
        linkedin.setMovementMethod(LinkMovementMethod.getInstance());

//        TextView linkedinujwal = findViewById(R.id.linkedinujwal);
//        linkedinujwal.setMovementMethod(LinkMovementMethod.getInstance());

//
//        TextView chethanmail = findViewById(R.id.chethanmail);
//        chethanmail.setMovementMethod(LinkMovementMethod.getInstance());
//
//        TextView ujwalmail = findViewById(R.id.ujwalmail);
//        ujwalmail.setMovementMethod(LinkMovementMethod.getInstance());
//
//        TextView abhinavmail = findViewById(R.id.abhinavmail);
//        abhinavmail.setMovementMethod(LinkMovementMethod.getInstance());
//
//        TextView preethmail = findViewById(R.id.textView6);
//        preethmail.setMovementMethod(LinkMovementMethod.getInstance());




        backcontact = findViewById(R.id.backcontact);
        backcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstactivity = new Intent(Contactus.this,firstpage.class);
                startActivity(firstactivity);
            }
        });

    }
}