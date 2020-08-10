package my.com.anak2u.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    EditText ageEditText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view) {
       // Log.d("debug","Hello world");

        // Refer your pdf to see how long LENGTH_LONG vs LENGTH_SHORT
        Toast.makeText(MainActivity.this,
                "Hello World", Toast.LENGTH_SHORT).show();
    }
}
