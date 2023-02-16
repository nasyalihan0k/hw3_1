package com.geektech.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
public class ContactViewHolder extends RecyclerView.ViewHolder {

    private TextView tvContact;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvContact = itemView.findViewById(R.id.tw_contacts);
    }

    void bind(String contact){
        tvContact.setText(contact);
    }
}
