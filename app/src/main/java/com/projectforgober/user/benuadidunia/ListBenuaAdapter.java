package com.projectforgober.user.benuadidunia;

import android.content.ClipboardManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Objects;

public class ListBenuaAdapter extends RecyclerView.Adapter<ListBenuaAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Benua> listBenua;

    private ArrayList<Benua> getListBenua() {
        return listBenua;
    }

    void setListBenua(ArrayList<Benua> listBenua) {
        this.listBenua = listBenua;
    }

    ListBenuaAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_benua, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        CategoryViewHolder.tvName.setText(getListBenua().get(position).getName());
        CategoryViewHolder.tvRemarks.setText(getListBenua().get(position).getRemarks());

        Glide.with(context)
                .load(getListBenua().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListBenua().size();
    }

    static class CategoryViewHolder extends RecyclerView.ViewHolder {
        public static ClipboardManager tvName;
        public static ClipboardManager tvRemarks;
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);

            private void showRecyclerList{
                RecyclerView rvCategory = null;
                Objects.requireNonNull(rvCategory).setLayoutManager(new LinearLayoutManager(this));
                ListBenuaAdapter listBenuaAdapter = new ListBenuaAdapter(this);
                ArrayList<Benua> list = null;
                listBenuaAdapter.setListBenua(list);
                rvCategory.setAdapter(listBenuaAdapter);

                ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                        FloatBuffer list = null;
                        showRecyclerList(list.get(position));
                    }

                    private void showRecyclerList(float v) {
                    }
                });
            }
        }
    }
}