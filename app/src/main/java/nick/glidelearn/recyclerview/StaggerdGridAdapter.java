package nick.glidelearn.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import nick.glidelearn.R;

public class StaggerdGridAdapter extends RecyclerView.Adapter<StaggerdGridAdapter.GridViewHolder> {

    private Context context;

    public StaggerdGridAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GridViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_staggered_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"position"+position,Toast.LENGTH_SHORT).show();
            }
        });
        if(position%3==0){
            holder.imageView.setImageResource(R.drawable.a1);
        }else{
            holder.imageView.setImageResource(R.drawable.a2);
        }

    }

    @Override
    public int getItemCount() {
        return 18;
    }


    class GridViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);
        }
    }
}
