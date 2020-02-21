package nick.glidelearn.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import nick.glidelearn.R;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

public class HorizontalActivity extends AppCompatActivity {


    private RecyclerView mRvHor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);

        mRvHor=findViewById(R.id.rv_hor);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(HorizontalActivity.this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        mRvHor.setLayoutManager(linearLayoutManager);
        mRvHor.addItemDecoration(new MyDecoration());
        mRvHor.setAdapter(new HorAdapter(HorizontalActivity.this));
    }


    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect,View view,RecyclerView parent,RecyclerView.State state) {
            super.getItemOffsets(outRect,view,parent,state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight),0);
        }
    }
}
