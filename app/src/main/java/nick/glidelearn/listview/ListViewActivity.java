package nick.glidelearn.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import nick.glidelearn.R;

public class ListViewActivity extends Activity {



    private ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);



        listView=findViewById(R.id.lv_1);
        listView.setAdapter(new MyListAdapter(ListViewActivity.this));
    }
}
