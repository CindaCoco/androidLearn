package nick.glidelearn.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import nick.glidelearn.R;

public class MyListAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;


    public MyListAdapter(Context context) {
        this.context=context;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle,tvTime,tvContent;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView=layoutInflater.inflate(R.layout.layout_list_item,null);
            holder=new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.iv_item);
            holder.tvTitle=convertView.findViewById(R.id.tv_title);
            holder.tvTime=convertView.findViewById(R.id.tv_time);
            holder.tvContent=convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }


        //给控件赋值
        holder.tvTitle.setText("我是新设置的Text标题");
        holder.tvTime.setText("4567-12-12");
        holder.tvContent.setText("这是内容");
        Glide.with(context).load("http://a3.att.hudong.com/68/61/300000839764127060614318218_950.jpg").into(holder.imageView);
        return convertView;
    }
}
