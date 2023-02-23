package com.example.myapplication;

import android.view.ViewGroup;

public interface ContactAdapter_ {
    ContactAdapter.ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(ContactAdapter.ContactViewHolder holder, int position);

    int getItemCount();
}
