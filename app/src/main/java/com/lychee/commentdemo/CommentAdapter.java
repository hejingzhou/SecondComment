package com.lychee.commentdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lychee of on 2018/4/18 11:12.
 * <p>
 * Author: HeJingzhou
 * <p>
 * Email: tcowork@163.com
 */
public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {

    private Context mContext;
    private List<CommentEntity.DataBean> dataBeans;

    public CommentAdapter(Context mContext, List<CommentEntity.DataBean> dataBeans) {
        this.mContext = mContext;
        this.dataBeans = dataBeans;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_comment, null, false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mTvId.setText(dataBeans.get(position).getUserName() + " 问  " + dataBeans.get(position).getContent());
        LvCommentAdapter lvCommentAdapter = new LvCommentAdapter(mContext, dataBeans.get(position).getMbCommentList());
        holder.mStopRecyclerLv.setAdapter(lvCommentAdapter);
    }

    @Override
    public int getItemCount() {
        return dataBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTvId;
        private StopRecyclerListView mStopRecyclerLv;

        public ViewHolder(View itemView) {
            super(itemView);
            mTvId = itemView.findViewById(R.id.mTvId);
            mStopRecyclerLv = itemView.findViewById(R.id.mStopRecyclerLv);
        }
    }
}
