package benjamin.gu.assignment2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import benjamin.gu.assignment2.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity implements TabLayout.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }

    public benjamin.gu.assignment2.Retrofit getApiInterface(){
        retrofit2.Retrofit retrofit = new Retrofit.Builder().baseUrl("https://itunes.apple.com/search?")
                .addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(benjamin.gu.assignment2.Retrofit.class);
    }

    @Override
    public void onClick(View view) {

    }
}