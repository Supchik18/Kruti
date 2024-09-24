package com.example.pract12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class scriptAdapter extends RecyclerView.Adapter<scriptAdapter.ViewHolder> {
    interface OnStateClickListener{
        void onStateClick(script script, int position);
    }

    private final OnStateClickListener onClickListener;

    private final LayoutInflater inflater;
    private final List<script> scripts;

    public scriptAdapter(OnStateClickListener onClickListener, Context context, List<script> scripts) {
        this.onClickListener = onClickListener;
        this.scripts = scripts;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public scriptAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(scriptAdapter.ViewHolder holder, int position) {
        script script = scripts.get(position);
        holder.picView.setImageResource(script.getPicResource());
        holder.nameView.setText(script.getName());
        holder.colorView.setText(script.getColor());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onStateClick(script, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return scripts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView picView;
        final TextView nameView, colorView;

        ViewHolder(View view) {
            super(view);
            picView = view.findViewById(R.id.pic);
            nameView = view.findViewById(R.id.name);
            colorView = view.findViewById(R.id.color);
        }
    }
}
