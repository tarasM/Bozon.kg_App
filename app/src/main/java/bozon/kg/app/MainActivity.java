package bozon.kg.app;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    public String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        //Hide actionBar for better GUI
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

    }

    //Action for buttons
    public void goToRegisterView(View v){
        switch (v.getId()) {
            case R.id.btnLinkToRegisterScreen:
                Intent intent = new Intent(this, Register.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void goHomeScreenView(View v){
        switch (v.getId()) {
            case R.id.btnLogin:
                Intent intent = new Intent(this, Main_screen.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity: onDestroy()");
    }




}
