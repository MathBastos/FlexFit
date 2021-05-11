package com.example.flexfit;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<String> academias;
    private List<Integer> imagens;

    public MyAdapter(Context context,List<String> academias,List<Integer> imagens){
        this.context = context;
        this.academias = academias;
        this.imagens = imagens;


    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull MyAdapter.MyViewHolder holder, final int position) {
        holder.mTextView.setText(academias.get(position));
        holder.mTextView.setOnClickListener((view)-> {
            Intent intentFeedback = new Intent(context, FeedbackTreinoActivity.class);
            context.startActivity(intentFeedback);
        });
        holder.mImageView.setImageResource(imagens.get(position));
        holder.mImageView.setOnClickListener((view)-> {
            Intent intentFeedback = new Intent(context, FeedbackTreinoActivity.class);
            context.startActivity(intentFeedback);
        });


    }

    @Override
    public int getItemCount() {
        return academias.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView mImageView;
        TextView mTextView;

        public MyViewHolder(final View view) {
            super(view);

            mImageView = itemView.findViewById(R.id.imageView);
            mTextView = itemView.findViewById(R.id.textView);
        }
    }

}
