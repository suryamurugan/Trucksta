package app.mindweaversolutions.trucksta.trucksta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by suryamurugan on 26/3/18.
 */


public class SplashActivity extends AppCompatActivity {


   // UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Intent to Start LanguageSelectionActivity
        startActivity(new Intent(SplashActivity.this,LanguageSelectionActivity.class));
        finish();
    }
}

//    Toast.makeText(this, "idk"+userLocalStore.getLoggedInUser(), Toast.LENGTH_SHORT).show();
//}
/*
        if(savedInstanceState.get("username").equals("")){

           Intent LoginIntent = new Intent(SplashActivity.this,Main2Activity.class);
           startActivity(LoginIntent);
           finish();
        }
*/
/*
UserLocalStore userLocalStore = new UserLocalStore(getApplicationContext());


        if (userLocalStore.getLoggedInUser() ==null){

            Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show();
            *//*Intent intent2 = new Intent(SplashActivity.this,Main2Activity.class);*//*
            Intent intent2 = new Intent(SplashActivity.this, BottomNavActivity.class);
            SplashActivity.this.startActivity(intent2);
            finish();

        }
        else if (!(userLocalStore.getLoggedInUser() ==null)) {

            Toast.makeText(this, ""+userLocalStore.getLoggedInUser().username, Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(SplashActivity.this, AdverSizeHomeNavDrawActivity.class);
            Intent intent = new Intent(SplashActivity.this, BottomNavActivity.class);
            SplashActivity.this.startActivity(intent);
            finish();
        }*/
