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

public class HorAdapter extends RecyclerView.Adapter<HorAdapter.HorViewHolder> {

    private Context context;

    public HorAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public HorAdapter.HorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_hor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorViewHolder holder, final int position) {
        holder.textView.setText("hey man!");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"click:"+position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    public class HorViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public HorViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_title);
        }
    }
}
