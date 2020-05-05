package si.uni_lj.fri.pbd.lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import si.uni_lj.fri.pbd.lab8.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
