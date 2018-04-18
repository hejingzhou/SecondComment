package com.lychee.commentdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Lychee of on 2018/4/18 11:41.
 * <p>
 * Author: HeJingzhou
 * <p>
 * Email: tcowork@163.com
 */
public class LvCommentAdapter extends BaseAdapter {
    private Context mContext;
    private List<CommentEntity.DataBean.MbCommentListBean> mbCommentList;

    /**
     * 评论下评论View
     */
    private final int VIEW_TYPE_FIRST = 0;

    /**
     * 评论下评论回复View
     */
    private final int VIEW_TYPE_REPLY = 1;
    private int[] viewTypeArray = {VIEW_TYPE_FIRST, VIEW_TYPE_REPLY};

    public LvCommentAdapter(Context mContext, List<CommentEntity.DataBean.MbCommentListBean> mbCommentList) {
        this.mContext = mContext;
        this.mbCommentList = mbCommentList;
    }

    @Override
    public int getCount() {
        return mbCommentList.size();
    }

    @Override
    public Object getItem(int position) {
        return mbCommentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        if (TextUtils.isEmpty(mbCommentList.get(position).getToUserName())) {
            return VIEW_TYPE_FIRST;
        } else {
            return VIEW_TYPE_REPLY;
        }
    }

    @Override
    public int getViewTypeCount() {
        return viewTypeArray.length;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolderViewTypeFirst viewHolderViewTypeFirst = null;
        ViewHolderViewTypeReply viewHolderViewTypeReply = null;

        int itemViewType = getItemViewType(position);

        LayoutInflater from = LayoutInflater.from(mContext);
        if (convertView == null) {
            switch (itemViewType) {
                case VIEW_TYPE_FIRST:
                    convertView = from.inflate(R.layout.item_lv_comment_first, null, false);
                    viewHolderViewTypeFirst = new ViewHolderViewTypeFirst(convertView);
                    convertView.setTag(viewHolderViewTypeFirst);
                    break;
                case VIEW_TYPE_REPLY:
                    convertView = from.inflate(R.layout.item_lv_comment_reply, null, false);
                    viewHolderViewTypeReply = new ViewHolderViewTypeReply(convertView);
                    convertView.setTag(viewHolderViewTypeReply);
                    break;
                default:
                    break;
            }
        } else {
            switch (itemViewType) {
                case VIEW_TYPE_FIRST:
                    viewHolderViewTypeFirst = (ViewHolderViewTypeFirst) convertView.getTag();
                    break;
                case VIEW_TYPE_REPLY:
                    viewHolderViewTypeReply = (ViewHolderViewTypeReply) convertView.getTag();
                    break;
                default:
                    break;
            }
        }

        final CommentEntity.DataBean.MbCommentListBean currComment = mbCommentList.get(position);
        switch (itemViewType) {
            case VIEW_TYPE_FIRST:
                viewHolderViewTypeFirst.mTvTime.setText(currComment.getDate());

                String commentContent = currComment.getUserName() + "：" + currComment.getContent();

                SpannableString spannableString = new SpannableString(commentContent);

                spannableString.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View widget) {
                        Toast.makeText(mContext, currComment.getUserName(), Toast.LENGTH_SHORT).show();
                    }
                }, 0, currComment.getUserName().length() + 1, Spanned.SPAN_COMPOSING);

                spannableString.setSpan(new DeleteColorLineSpan(), 0, currComment.getUserName().length() + 1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

                spannableString.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View widget) {
                        Toast.makeText(mContext, currComment.getContent(), Toast.LENGTH_SHORT).show();
                    }
                }, currComment.getUserName().length() + 2, commentContent.length(), Spanned.SPAN_COMPOSING);

                spannableString.setSpan(new DeleteBlackLineSpan(), currComment.getUserName().length() + 1, commentContent.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

                viewHolderViewTypeFirst.mTvCommentContent.setText(spannableString);
                viewHolderViewTypeFirst.mTvCommentContent.setMovementMethod(LinkMovementMethod.getInstance());

                break;
            case VIEW_TYPE_REPLY:
                final String commentReply = currComment.getUserName() + "回复" + currComment.getToUserName() + "：" + currComment.getContent();
                SpannableString spannableStringReply = new SpannableString(commentReply);

                //用户名
                spannableStringReply.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View widget) {
                        Toast.makeText(mContext, currComment.getUserName(), Toast.LENGTH_SHORT).show();
                    }
                }, 0, currComment.getUserName().length(), Spanned.SPAN_COMPOSING);
                spannableStringReply.setSpan(new DeleteColorLineSpan(), 0, currComment.getUserName().length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

                //回复俩字
                spannableStringReply.setSpan(new DeleteBlackLineSpan(), currComment.getUserName().length() + 1, currComment.getUserName().length() + 3, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

                //toUser
                spannableStringReply.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View widget) {
                        Toast.makeText(mContext, currComment.getToUserName(), Toast.LENGTH_SHORT).show();
                    }
                }, currComment.getUserName().length() + 2, currComment.getUserName().length() + 2 + currComment.getToUserName().length() + 1, Spanned.SPAN_COMPOSING);
                spannableStringReply.setSpan(new DeleteColorLineSpan(), currComment.getUserName().length() + 2, currComment.getUserName().length() + 2 + currComment.getToUserName().length() + 1, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);

                //其余黑色
                spannableStringReply.setSpan(new ClickableSpan() {
                    @Override
                    public void onClick(View widget) {
                        Toast.makeText(mContext, currComment.getContent(), Toast.LENGTH_SHORT).show();
                    }
                }, currComment.getUserName().length() + 2 + currComment.getToUserName().length() + 1, commentReply.length(), Spanned.SPAN_COMPOSING);
                spannableStringReply.setSpan(new DeleteBlackLineSpan(), currComment.getUserName().length() + 2 + currComment.getToUserName().length() + 1, commentReply.length(), Spannable.SPAN_EXCLUSIVE_INCLUSIVE);


                viewHolderViewTypeReply.mTvCommentContent.setText(spannableStringReply);
                viewHolderViewTypeReply.mTvCommentContent.setMovementMethod(LinkMovementMethod.getInstance());
                viewHolderViewTypeReply.mTvTime.setText(currComment.getDate());
                break;
            default:
                break;
        }
        return convertView;
    }

    /**
     * 去掉黑色文字下划线
     */
    class DeleteBlackLineSpan extends UnderlineSpan {
        @Override
        public void updateDrawState(TextPaint ds) {
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
            ds.setColor(Color.parseColor("#000000"));
        }
    }


    /**
     * 去掉彩色文字下滑线
     */
    class DeleteColorLineSpan extends UnderlineSpan {
        @Override
        public void updateDrawState(TextPaint ds) {
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
            ds.setColor(Color.parseColor("#990033"));
        }
    }

    /**
     * 第一次回复的ViewHolder
     */
    private class ViewHolderViewTypeFirst {

        private TextView mTvCommentContent, mTvTime;

        private ViewHolderViewTypeFirst(View view) {
            mTvCommentContent = view.findViewById(R.id.mTvCommentContent);
            mTvTime = view.findViewById(R.id.mTvTime);
        }
    }

    /**
     * 复回复的ViewHolder
     */
    private class ViewHolderViewTypeReply {
        private TextView mTvCommentContent, mTvTime;

        private ViewHolderViewTypeReply(View view) {
            mTvCommentContent = view.findViewById(R.id.mTvCommentContent);
            mTvTime = view.findViewById(R.id.mTvTime);
        }
    }


}
