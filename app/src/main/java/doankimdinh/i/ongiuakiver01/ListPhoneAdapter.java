package doankimdinh.i.ongiuakiver01;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListPhoneAdapter extends RecyclerView.Adapter<ListPhoneAdapter.ViewHolder> {

    private ArrayList<ItemPhone> arrayList;
    private Context context;

    public ListPhoneAdapter(ArrayList<ItemPhone> arrayList,Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_layout,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemPhone item = arrayList.get(position);
        holder.txtPrice.setText(String.valueOf(item.getPrice()));
        holder.txtName.setText(String.valueOf(item.getName()));
        holder.imageView.setImageResource(item.getHinhAnh());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,ChiTietActivity.class);
                intent.putExtra("name",item.getName());
                intent.putExtra("price",item.getPrice());
                intent.putExtra("picture",item.getHinhAnh());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView txtName;
        private TextView txtPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.txtName = itemView.findViewById(R.id.txtNamePhone);
            this.txtPrice = itemView.findViewById(R.id.txtPrice);
        }
    }
}
