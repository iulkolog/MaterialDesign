package yuliya.loginova.ru.mdl4;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ToolbarActivity extends AppCompatActivity {

    private static final String TAG = "ToolbarActivity";
    private ProgressBar roundProgressBar;
    private ProgressBar lineProgressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

        roundProgressBar = findViewById(R.id.progress_roundbar_activity);
        lineProgressBar = findViewById(R.id.progress_linebar_activity);

        lineProgressBar.setMax(100);
        lineProgressBar.setProgress(50);

    }

    public void hide(View view){
        roundProgressBar.setVisibility(View.INVISIBLE);
        lineProgressBar.setVisibility(View.INVISIBLE);
    }

    public void show(View view){
        roundProgressBar.setVisibility(View.VISIBLE);
        lineProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                Log.d(TAG, "onOptionsItemSelected: ");
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}