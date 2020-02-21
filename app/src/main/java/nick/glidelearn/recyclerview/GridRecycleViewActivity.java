package nick.glidelearn.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import nick.glidelearn.R;

import android.os.Bundle;

public class GridRecycleViewActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle_view);

        recyclerView=findViewById(R.id.rv_grid);
        recyclerView.setLayoutManager(new GridLayoutManager(GridRecycleViewActivity.this,3));
        recyclerView.setAdapter(new GridAdapter(GridRecycleViewActivity.this));
    }
}
