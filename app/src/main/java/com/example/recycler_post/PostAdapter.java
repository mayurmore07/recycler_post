package com.example.recycler_post;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private ArrayList<Post> post;

    public PostAdapter(ArrayList<Post> post){

        this.post=post;
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        public TextView txtTitle;
        public ImageView imagePost;
        public TextView txtLike;

        public PostViewHolder(View itemView){

            super(itemView);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            imagePost=itemView.findViewById(R.id.imagePost);
            txtLike=itemView.findViewById(R.id.txtLike);

           txtLike.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   /*int likes=Integer.parseInt(txtLike.getText().toString());
                   likes++;
                   txtLike.setText(""+likes);*/

                   Post posts=post.get(getAdapterPosition());
                   int likes;
                   likes=Integer.parseInt(txtLike.getText().toString());
                   likes++;
                   posts.setLike(likes);
                   txtLike.setText(""+likes);
               }
           });


        }

    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.post,null);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        Post posts=post.get(position);
        holder.txtTitle.setText(posts.getTitle());
        holder.imagePost.setImageResource(posts.getImage());
        holder.txtLike.setText(""+posts.getLike());


    }
    public int getItemCount(){
        return post.size();
    }
}
