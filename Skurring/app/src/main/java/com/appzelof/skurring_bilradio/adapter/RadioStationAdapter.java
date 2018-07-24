package com.appzelof.skurring_bilradio.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appzelof.skurring_bilradio.R;
import com.appzelof.skurring_bilradio.holder.RadioViewHolder;
import com.appzelof.skurring_bilradio.model.RadioObject;

import java.util.ArrayList;

public class RadioStationAdapter extends RecyclerView.Adapter<RadioViewHolder> {
    ArrayList<RadioObject> radioObjectArrayList;

    public RadioStationAdapter(ArrayList<RadioObject> radioObjectArrayList) {
        this.radioObjectArrayList = radioObjectArrayList;

    }

    @NonNull
    @Override
    public RadioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_radio_card, parent, false);
        return new RadioViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RadioViewHolder holder, final int position) {
        holder.updateUI(radioObjectArrayList.get(position).getRadioImage(),radioObjectArrayList.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return radioObjectArrayList.size();
    }
}