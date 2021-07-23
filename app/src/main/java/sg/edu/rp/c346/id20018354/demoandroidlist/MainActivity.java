package sg.edu.rp.c346.id20018354.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<AndroidVersion> alAndroidVersions;
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;

    //ArrayAdapter<AndroidVersion> aaAndroidVersions;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);

        alAndroidVersions = new ArrayList<AndroidVersion>();
        AndroidVersion av1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion av2 = new AndroidVersion("Oreo", "8.0");
        AndroidVersion av3 = new AndroidVersion("Nougat", "7.0");
        alAndroidVersions.add(av1);
        alAndroidVersions.add(av2);
        alAndroidVersions.add(av3);

        //aaAndroidVersions = new ArrayAdapter<>(this,
        //android.R.layout.simple_list_item_1, alAndroidVersions);
        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersions);

        //lvAndroidVersions.setAdapter(aaAndroidVersions);
        lvAndroidVersions.setAdapter(adapter);
    }
}
