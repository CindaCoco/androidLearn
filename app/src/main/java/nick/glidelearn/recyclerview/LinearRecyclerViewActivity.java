package nick.glidelearn.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import nick.glidelearn.R;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

public class LinearRecyclerViewActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycler_view);

        recyclerView=findViewById(R.id.rv_main);

        recyclerView.setLayoutManager(new LinearLayoutManager(LinearRecyclerViewActivity.this));
        //通过这个方法可以实现分割线
        recyclerView.addItemDecoration(new MyDecoration());

        recyclerView.setAdapter(new LinearAdapter(LinearRecyclerViewActivity.this));


    }


    //通过集成RecyclerView.ItemDecoration实现
    class MyDecoration extends RecyclerView.ItemDecoration{

        @Override
        public void getItemOffsets(Rect outRect, View view,RecyclerView parent,RecyclerView.State state){
            super.getItemOffsets(outRect,view,parent,state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }

    }
}
