package sg.edu.rp.c346.id20018354.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroidVersions;
    ArrayList<String> alAndroidVersions;
    ArrayAdapter<String> aaAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersions = findViewById(R.id.listViewAndroidVersions);
        alAndroidVersions = new ArrayList<String>();
        alAndroidVersions.add("Pie 9.0");
        alAndroidVersions.add("Oreo 8.0");
        alAndroidVersions.add("Nougat 7.0");

        aaAndroidVersions = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        lvAndroidVersions.setAdapter(aaAndroidVersions);
    }
}