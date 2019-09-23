package com.example.dagger2_retrofit_impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<Photo> photoArrayList = new ArrayList<>();
    private Context context;

    public Adapter(Context context, ArrayList<Photo> photoArrayList) {
        this.photoArrayList = photoArrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_list, parent, false);
        return new Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.albumId.setText(photoArrayList.get(position).getAlbumId().toString());
        holder.id.setText(photoArrayList.get(position).getId().toString());
        holder.title.setText(photoArrayList.get(position).getTitle());


        Picasso.with(context).load(photoArrayList.get(position).getThumbnailUrl()).into(holder.thumbNail);
    }

    @Override
    public int getItemCount() {
        return photoArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView albumId;
        private TextView id;
        private TextView title;
        private ImageView bigPhoto;
        private ImageView thumbNail;

        public ViewHolder(View itemView) {
            super(itemView);
            albumId = itemView.findViewById(R.id.album_id);
            id = itemView.findViewById(R.id.photo_id);
            title = itemView.findViewById(R.id.tv_title);
            thumbNail = itemView.findViewById(R.id.thumbnailUrl);

        }
    }
}
