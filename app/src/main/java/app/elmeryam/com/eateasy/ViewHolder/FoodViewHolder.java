package app.elmeryam.com.eateasy.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import app.elmeryam.com.eateasy.Interface.ItemClickListener;
import app.elmeryam.com.eateasy.R;

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView food_name;
    public ImageView food_image;

    private ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public FoodViewHolder(View itemView) {
        super(itemView);

        food_image = itemView.findViewById(R.id.food_image);
        food_name = itemView.findViewById(R.id.food_name);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.OnClick(view,getAdapterPosition(),false);
    }
}
