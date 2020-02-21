package nick.glidelearn.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import nick.glidelearn.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RecyclerViewActivity extends AppCompatActivity {


    private Button mBtnLinear;
    private Button mBtnHor;
    private Button mBtnGrid;
    private Button mBtnPu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


        mBtnLinear=findViewById(R.id.btn_linear);
        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });


        mBtnHor=findViewById(R.id.btn_hor);
        mBtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this,HorizontalActivity.class);
                startActivity(intent);
            }
        });


        mBtnGrid=findViewById(R.id.btn_grid);
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this,GridRecycleViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnPu=findViewById(R.id.btn_pu);
        mBtnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RecyclerViewActivity.this,PuRecyclerviewActivity.class);
                startActivity(intent);
            }
        });
    }
}
