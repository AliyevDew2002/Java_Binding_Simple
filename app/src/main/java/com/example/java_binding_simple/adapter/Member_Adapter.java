package com.example.java_binding_simple.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.java_binding_simple.R;
import com.example.java_binding_simple.databinding.MemberListQolipBinding;
import com.example.java_binding_simple.model.Member;

import java.util.ArrayList;

public class Member_Adapter extends BaseAdapter {

    MemberListQolipBinding listBinding;

    Context context;
    ArrayList<Member> members;
    LayoutInflater inflater;

    public Member_Adapter(Context context, ArrayList<Member> members){
        this.context=context;
        this.members=members;
        this.inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return members.size();
    }

    @Override
    public Member getItem(int position) {
        return members.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            MemberListQolipBinding binding = MemberListQolipBinding.inflate(inflater, parent, false);
            convertView = binding.getRoot();
            convertView.setTag(binding);
        }

        Member member = members.get(position);
        MemberListQolipBinding binding = (MemberListQolipBinding) convertView.getTag();

        binding.ivProfile.setImageResource(member.getProfile());
        binding.tvFullname.setText(member.getFullname());

        return convertView;
    }

}
