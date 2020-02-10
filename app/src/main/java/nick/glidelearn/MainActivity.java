package nick.glidelearn;

import androidx.appcompat.app.AppCompatActivity;
import nick.glidelearn.listview.ListViewActivity;
import nick.glidelearn.recyclerview.RecyclerViewActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button_1;
    private Button button_listview;
    private Button button_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1=findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });



        button_listview=findViewById(R.id.button_2);
        button_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });


        button_recycler=findViewById(R.id.button_3);
        button_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
