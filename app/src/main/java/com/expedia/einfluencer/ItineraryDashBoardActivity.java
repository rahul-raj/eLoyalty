package com.expedia.einfluencer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ItineraryDashBoardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary_dashboard);

        Button itin1Button = (Button) findViewById(R.id.button3);
        itin1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItineraryDashBoardActivity.this,SocialInfluencerSignUpActivity.class);
                startActivity(intent);
            }
        });

       /* Button itin1Button = (Button) findViewById(R.id.button);
        itin1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ItinFragmentOne());
            }
        });

        Button itin2Button = (Button) findViewById(R.id.button2);
        itin2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new ItinFragmentTwo());
            }
        });*/

    }

    /*private void loadFragment(Fragment fragment) {
        // create a FragmentManager

        FragmentManager fm = getSupportFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.consLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }*/
}


