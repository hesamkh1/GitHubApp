package com.example.github_sekans7.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.github_sekans7.R;
import com.example.github_sekans7.model.Repo;

import java.util.List;

public class Adapter_repo extends RecyclerView.Adapter<Adapter_repo.MyViewHolder>{

private List<Repo> repos;
        Context context;


public Adapter_repo(List<Repo> repos,Context context) {
        this.repos = repos;
        this.context=context;


        }

@NonNull
@Override
public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_for_repo, parent, false);
        return new Adapter_repo.MyViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
    holder.name.setText(repos.get(position).getName());
    holder.size.setText(repos.get(position).getSize());
    holder.langu.setText(repos.get(position).getLanguage());
    holder.id.setText(repos.get(position).getId());
    holder.branch.setText(repos.get(position).getDefaultBranch());
    holder.browers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(repos.get(position).getHtmlUrl()));
            v.getContext().startActivity(browserIntent);
        }
    });

}
@Override
public int getItemCount() {
        return repos.size() ;
        }

public  static  class  MyViewHolder extends RecyclerView.ViewHolder{
    TextView name,size,langu,id,branch,browers;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name_recycler_repo);
        size=itemView.findViewById(R.id.size_recyler_repo);
        langu=itemView.findViewById(R.id.langu_recyler_repo);
        id=itemView.findViewById(R.id.id_recycler_repo);
        branch=itemView.findViewById(R.id.branch_recyler_repo);
        browers=itemView.findViewById(R.id.brower_repo);

    }
}
}
