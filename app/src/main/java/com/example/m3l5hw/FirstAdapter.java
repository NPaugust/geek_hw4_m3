package com.example.m3l5hw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.ElementViewHolder> {

    private ArrayList<Element> elements;
    private Context context;
    private OnClickListener clickListener;

    public FirstAdapter(ArrayList<Element> elements, Context context, OnClickListener onClickListener){
        this.elements = elements;
        this.context = context;
        this.clickListener = onClickListener;
    }

    @NonNull
    @Override
    public ElementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ElementViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ElementViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(elements.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onClick(elements.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return elements.size();
    }

    class ElementViewHolder extends RecyclerView.ViewHolder {

        private TextView continent_tv;
        private ImageView imageView;

        public ElementViewHolder(@NonNull View itemView) {
            super(itemView);
            continent_tv =itemView.findViewById(R.id.tv_continent);
            imageView = itemView.findViewById(R.id.image);
        }

        public void bind(Element element) {
            continent_tv.setText(element.getElement_name());
            imageView.setImageResource(element.getImage());
        }
    }

}
