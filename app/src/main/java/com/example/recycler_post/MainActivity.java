package com.example.recycler_post;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerPost;
    public ArrayList<Post> post;
    public int[] imgPost;
    public PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data();
        initView();
    }
    public void initView(){
        recyclerPost=findViewById(R.id.recyclerPost);
        recyclerPost.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        postAdapter=new PostAdapter(post);
        recyclerPost.setAdapter(postAdapter);
    }
    public void Data(){
        imgPost=new int[]{R.drawable.dog,R.drawable.moon,R.drawable.panda,R.drawable.neptune,R.drawable.flower1,R.drawable.flower2,R.drawable.cpatian,R.drawable.iornman,R.drawable.thanos,R.drawable.spider,R.drawable.groot};
        post=new ArrayList<Post>();

       for(int i=1;i<imgPost.length;i++){
         post.add(new Post(i,"Post"+i,imgPost[i],0));
        }
    }
}