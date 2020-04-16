package ntu.vuquanglang.lifecycle59cnttdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate Called");
        txtTG = findViewById(R.id.textTG);
        SimpleDateFormat spf = new SimpleDateFormat("hh:mm:ss");
        String strDate  = spf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onCreate Called");
    }
}
