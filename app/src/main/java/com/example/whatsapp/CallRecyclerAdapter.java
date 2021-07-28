package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CallRecyclerAdapter extends RecyclerView.Adapter <CallRecyclerAdapter.CallViewHolder>{
    String[] data;

    public CallRecyclerAdapter(String[] data) {
        this.data = data;
    }

    @NonNull

    @Override
    public CallViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new CallViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.call_item,parent,false));
    }

    @Override
    public void onBindViewHolder( CallRecyclerAdapter.CallViewHolder holder, int position) {
        holder.textView.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class CallViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView ;
        TextView textView;

        public CallViewHolder( View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.name);


        }
    }

}
