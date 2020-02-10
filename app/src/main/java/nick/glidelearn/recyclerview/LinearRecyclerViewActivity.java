package nick.glidelearn.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import nick.glidelearn.R;

import android.os.Bundle;

public class LinearRecyclerViewActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);

        recyclerView=findViewById(R.id.rv_main);

        recyclerView.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        recyclerView.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));

    }
}
