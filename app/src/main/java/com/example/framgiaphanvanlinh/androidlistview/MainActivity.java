package com.example.framgiaphanvanlinh.androidlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();
    private String[] devices = {
            "Android", "iOS", "Blackberry", "WindowPhone", "WebOS", "Ubuntu", "Windows7",
            "Max OS X", "ABC", "DEF", "GHJ"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.list_view_device);
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.item_device, devices);
        listView.setAdapter(adapter);

        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                if (scrollState == SCROLL_STATE_IDLE) {
                    Log.i(TAG, "first: "
                            + listView.getFirstVisiblePosition()
                            + " last:"
                            + listView.getLastVisiblePosition()
                            + " childCount:"
                            + listView.getChildCount());
                }
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
                    int totalItemCount) {
            }
        });
    }
}
