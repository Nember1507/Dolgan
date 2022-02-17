package com.example.dolgan.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dolgan.R;
import com.example.dolgan.api.HomeClass;
import com.squareup.picasso.Picasso;

import java.util.List;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

        //private final static String PHOTO_URL = "";
        private List<HomeClass> mFlowers;
        private Context mContext;

        HomeAdapter(List<HomeClass> flowers) {
            this.mFlowers = flowers;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            mContext = parent.getContext();
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.adapter_home, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            HomeClass flower = mFlowers.get(position);
            holder.nameTextView.setText(flower.getName());

            Picasso.with(mContext)
                    .load(flower.getImage())
                    .resize(200, 150)
                    .into(holder.flowerImageView);
        }

        @Override
        public int getItemCount() {
            if (mFlowers == null) {
                return 0;
            }
            return mFlowers.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView nameTextView;
            ImageView flowerImageView;

            ViewHolder(View itemView) {
                super(itemView);
                nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
                flowerImageView = (ImageView) itemView.findViewById(R.id.itemImageView);
            }
        }
    }

