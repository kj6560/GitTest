package tk.keshavjha.gittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    List<Integer> img;
    List<String> profile_name, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.listView);
        img = new ArrayList<>();
        profile_name = new ArrayList<>();
        msg = new ArrayList<>();

        img.add(R.mipmap.ic_launcher_round);
        profile_name.add("Amit");
        msg.add("hello Amit");

        img.add(R.mipmap.ic_launcher_round);
        profile_name.add("Keshav Jha");
        msg.add("hello Keshav");

        img.add(R.mipmap.ic_launcher_round);
        profile_name.add("Ketan");
        msg.add("hello Ketan");

        MyAdapter adapter = new MyAdapter(img, profile_name, msg, MainActivity.this);
        lv.setAdapter(adapter);
    }
}
