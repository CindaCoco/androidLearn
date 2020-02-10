package nick.glidelearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
public class ImageViewActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);


        imageView=findViewById(R.id.iv_2);
        Glide.with(this).load("http://a3.att.hudong.com/68/61/300000839764127060614318218_950.jpg").into(imageView);

    }
}
