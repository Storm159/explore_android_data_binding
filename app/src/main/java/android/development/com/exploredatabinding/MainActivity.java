package android.development.com.exploredatabinding;

import android.databinding.DataBindingUtil;
import android.development.com.exploredatabinding.databinding.ActivityMainBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.textViewContent.setText("New Text");
    }
}
