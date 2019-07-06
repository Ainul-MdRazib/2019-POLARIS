package com.example.polaris_2019.activity;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.polaris_2019.R;

import java.util.List;

import resourceClass.SingleMessage;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<SingleMessage> mMessageList;

    // TODO: implement user authentication

    public MessageAdapter( List<SingleMessage> mMessageList){
        this.mMessageList = mMessageList;
    }


    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_message_me,parent,false
                );

        return new MessageViewHolder(v);
    }

    class MessageViewHolder extends RecyclerView.ViewHolder{
        TextView messageText;
        TextView messageSentBy;
        TextView messageTimestamp;

        MessageViewHolder(View view){
            super(view);
            messageText = (TextView) view.findViewById(R.id.message_text_layout);
            messageSentBy = (TextView) view.findViewById(R.id.message_sentBy);
            messageTimestamp = (TextView) view.findViewById(R.id.message_timestamp);

        }
    }

    @Override
    public void onBindViewHolder(MessageViewHolder viewHolder, int i) {
        //TODO: Implement user authentication: get username
        String currentName = "Booga";
        SingleMessage m = mMessageList.get(i);

        if(currentName.equals(m.getSentBy())){
            viewHolder.messageText.setBackgroundColor(Color.CYAN);
        }else{

            viewHolder.messageText.setBackgroundResource(R.drawable.single_message_bg_other);
        }

        viewHolder.messageSentBy.setText(m.getSentBy());
        viewHolder.messageText.setText(m.getMessage());
        viewHolder.messageTimestamp.setText(m.getTime());

    }

    @Override
    public int getItemCount() {
        return mMessageList.size();
    }
}
