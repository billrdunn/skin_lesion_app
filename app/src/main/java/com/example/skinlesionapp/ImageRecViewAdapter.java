package com.example.skinlesionapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import static com.example.skinlesionapp.ImageActivity.IMAGE_ID_KEY;

public class ImageRecViewAdapter extends RecyclerView.Adapter<ImageRecViewAdapter.ViewHolder> {
    private static final String TAG = "ImageRecViewAdapter";

    private ArrayList<Image> images = new ArrayList<>();
    private Context mContext;

    public ImageRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_image, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: Called");
        holder.txtName.setText(images.get(position).getClassification());
        Glide.with(mContext)
                .asBitmap()
                .load(images.get(position).getImageURL())
                .into(holder.imgImage);
        
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ImageActivity.class);
                intent.putExtra(IMAGE_ID_KEY, images.get(position).getId());
                mContext.startActivity(intent);
            }
        });

        holder.txtExamination.setText(images.get(position).getExamination());
        holder.txtShortDescription.setText(images.get(position).getShortDesc());

        if (images.get(position).isExpanded()) {
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelLayout.setVisibility(View.VISIBLE);
            holder.downArrow.setVisibility(View.GONE);
        } else {
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelLayout.setVisibility(View.GONE);
            holder.downArrow.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private ImageView imgImage;
        private TextView txtName;
        private ImageView downArrow, upArrow;
        private RelativeLayout expandedRelLayout;
        private TextView txtExamination, txtShortDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgImage = itemView.findViewById(R.id.imgImage);
            txtName = itemView.findViewById(R.id.txtImageClassification);
            downArrow = itemView.findViewById(R.id.btnDownArrow);
            upArrow = itemView.findViewById(R.id.btnUpArrow);
            expandedRelLayout = itemView.findViewById(R.id.expandedRelLayout);
            txtExamination = itemView.findViewById(R.id.txtExamination);
            txtShortDescription = itemView.findViewById(R.id.txtShortDescription);

            downArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Image image = images.get(getAdapterPosition());
                    image.setExpanded(!image.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            upArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Image image = images.get(getAdapterPosition());
                    image.setExpanded(!image.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }
}
