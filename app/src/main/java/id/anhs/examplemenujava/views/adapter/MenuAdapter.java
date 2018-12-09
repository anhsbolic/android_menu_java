package id.anhs.examplemenujava.views.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import id.anhs.examplemenujava.R;
import id.anhs.examplemenujava.model.Menu;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    private List<Menu> menuList;
    private MenuAdapter.OnItemClickListener onItemClickListener;

    public interface OnItemClickListener{
        void onItemClick(Menu menu);
    }

    public MenuAdapter(List<Menu> menuList,
                       MenuAdapter.OnItemClickListener onItemClickListener) {
        this.menuList = menuList;
        this.onItemClickListener = onItemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView textTitle;

        ViewHolder(View itemView) {
            super(itemView);

            imgIcon = itemView.findViewById(R.id.adapter_menu_img_icon);
            textTitle = itemView.findViewById(R.id.adapter_menu_txt_title);
        }

        // Item Click Listener
        void setOnClickListener(View.OnClickListener onClickListener){
            itemView.setOnClickListener(onClickListener);
        }
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.adapter_menu, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MenuAdapter.ViewHolder holder, int position) {
        // image
        int imgResId = menuList.get(position).iconResourceId;
        holder.imgIcon.setImageResource(imgResId);

        // title
        String title = menuList.get(position).title;
        holder.textTitle.setText(title);

        // item click listener
        holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Menu menu = menuList.get(holder.getAdapterPosition());
                onItemClickListener.onItemClick(menu);
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}
