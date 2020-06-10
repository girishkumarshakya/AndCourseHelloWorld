package in.lavit.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","My Codes are running fine");

        try {
            int x = 4/0;
        }catch (Exception e){
            Log.e("MainActivity",e.getLocalizedMessage());
        }
    }
}
