package com.lychee.commentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerComment = findViewById(R.id.mRecyclerComment);
        mRecyclerComment.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        String commentJson = AssetsUtils.readAssetsTxt(this, "comment");
        CommentEntity commentEntity = new Gson().fromJson(commentJson, CommentEntity.class);

        CommentAdapter mCommentAdapter = new CommentAdapter(this, commentEntity.getData());
        mRecyclerComment.setAdapter(mCommentAdapter);
    }
}
