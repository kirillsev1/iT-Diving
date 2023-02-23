package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private List<Contact> contacts;
    private LayoutInflater inflater;

    public ContactAdapter(Context context, List<Contact> contacts) {
        this.contacts = contacts;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.contact_list_item, parent, false);
            holder = new ViewHolder();
            holder.nameTextView = convertView.findViewById(R.id.nameTextView);
            holder.phoneTextView = convertView.findViewById(R.id.phoneTextView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Contact contact = (Contact) getItem(position);
        holder.nameTextView.setText(contact.getName());
        holder.phoneTextView.setText(contact.getPhone());

        return convertView;
    }

    private static class ViewHolder {
        TextView nameTextView;
        TextView phoneTextView;
    }
}
