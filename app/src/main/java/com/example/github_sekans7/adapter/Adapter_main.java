package com.example.github_sekans7.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.github_sekans7.R;
import com.example.github_sekans7.model.User;
import com.example.github_sekans7.view.UserActivity;

import java.util.List;

public class Adapter_main extends RecyclerView.Adapter<Adapter_main.MyViewHolder>{

    private List<User> users;
    Context context;

    
    public Adapter_main(List<User> users,Context context) {
        this.users = users;
        this.context=context;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_for_main, parent, false);
        return new Adapter_main.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.name.setText(users.get(position).getLogin());
        holder.id.setText(users.get(position).getId());
        holder.type.setText(users.get(position).getType());
        Glide.with(context)
                .load(users.get(position).getAvatarUrl())
                .centerCrop()
                .into(holder.imageholder);

//        holder.container.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Log.e("sss",users.get(position).getLogin());
//                Intent homeIntent =new Intent(v.getContext(), UserActivity.class);
//                homeIntent.putExtra("name",users.get(position).getLogin());
//                v.getContext().startActivity(homeIntent);
//              //  context.finish();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return users.size() ;
    }

    public  static  class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView name,id,type;
        LinearLayout container;
        ImageView imageholder;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name_recycler_main);
            id=itemView.findViewById(R.id.id_recycler_main);
            type=itemView.findViewById(R.id.type_recyler_main);
            container=itemView.findViewById(R.id.container_layout);
            imageholder=itemView.findViewById(R.id.avatar_recycler_main);

        }
    }
}
