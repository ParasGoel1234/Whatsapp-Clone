package com.codewithparas.whatsapp_clone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserListViewHolder> {
    ArrayList<UserObject>UserList;
    public UserListAdapter(ArrayList<UserObject>UserList){
        this.UserList = UserList;
    }

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View LayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,null,false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LayoutView.setLayoutParams(lp);
        UserListViewHolder rcv = new UserListViewHolder(LayoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
    holder.mname.setText(UserList.get(position).getName());
        holder.mphone.setText(UserList.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return UserList.size();
    }


    public class UserListViewHolder extends RecyclerView.ViewHolder{
        public TextView mname, mphone;
        public UserListViewHolder(View view){
            super(view);
            mname = view.findViewById(R.id.name);
            mphone = view.findViewById(R.id.phone);
        }
    }
}
