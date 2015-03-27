package com.example.davidfresh.tiendamascotas.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidfresh.tiendamascotas.R;
import com.example.davidfresh.tiendamascotas.models.aves;
import com.example.davidfresh.tiendamascotas.models.peces;

import java.util.ArrayList;

/**
 * Created by Davidfresh on 25/03/15.
 */
public class AvesAdapter extends RecyclerView.Adapter<AvesAdapter.ViewHolder> {

    private ArrayList<aves> aveArrayList;
    private int itemLayout;

    public AvesAdapter(ArrayList<aves> data,  int itemLayout){

        this.aveArrayList = data;
        this.itemLayout = itemLayout;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView name;
        private TextView precio;

        public ViewHolder(View itemView) {

            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image_aves);
            name = (TextView) itemView.findViewById(R.id.nombre);
            precio = (TextView) itemView.findViewById(R.id.precio_aves);

        }
    }

    @Override
    public AvesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AvesAdapter.ViewHolder viewHolder, int position) {

        aves pusheen = aveArrayList.get(position);

        viewHolder.name.setText(pusheen.getNombre());
        viewHolder.precio.setText(pusheen.getPrecio());

        if (pusheen.getId()!=null) {

            switch (pusheen.getId()) {

                case 1:
                    viewHolder.image.setImageResource(R.mipmap.ave1);
                    break;

                case 2:
                    viewHolder.image.setImageResource(R.mipmap.ave2);
                    break;

                case 3:
                    viewHolder.image.setImageResource(R.mipmap.ave3);
                    break;

                case 4:
                    viewHolder.image.setImageResource(R.mipmap.ave4);
                    break;

                case 5:
                    viewHolder.image.setImageResource(R.mipmap.ave5);
                    break;
                case 6:
                    viewHolder.image.setImageResource(R.mipmap.ave6);
                    break;
                case 7:
                    viewHolder.image.setImageResource(R.mipmap.ave7);
                    break;
                case 8:
                    viewHolder.image.setImageResource(R.mipmap.ave8);
                    break;
                case 9:
                    viewHolder.image.setImageResource(R.mipmap.ave9);
                    break;
            }

        }else{

            viewHolder.image.setImageResource(R.mipmap.perro1);
        }

        viewHolder.itemView.setTag(pusheen);
    }

    @Override
    public int getItemCount() {
        return this.aveArrayList.size();
    }


}
