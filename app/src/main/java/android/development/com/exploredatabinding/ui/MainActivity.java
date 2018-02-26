package android.development.com.exploredatabinding.ui;

import android.databinding.DataBindingUtil;
import android.development.com.exploredatabinding.R;
import android.development.com.exploredatabinding.databinding.ActivityMainBinding;
import android.development.com.exploredatabinding.model.Person;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setPerson(new Person("Mohd. Asfaq-E-Azam Rifat", "Rifat"));
    }
}
