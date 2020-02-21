package nick.glidelearn.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import nick.glidelearn.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {

    private Context context;

    public GridAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GridViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_grid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"position"+position,Toast.LENGTH_SHORT).show();
            }
        });
        holder.textView.setText("I'm so handsome!");
    }

    @Override
    public int getItemCount() {
        return 18;
    }


    class GridViewHolder extends RecyclerView.ViewHolder{

        TextView textView;


        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_title);
        }
    }
}
