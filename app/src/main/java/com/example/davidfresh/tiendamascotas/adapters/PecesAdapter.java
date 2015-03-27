package com.example.davidfresh.tiendamascotas.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidfresh.tiendamascotas.R;
import com.example.davidfresh.tiendamascotas.models.peces;

import java.util.ArrayList;

/**
 * Created by Davidfresh on 25/03/15.
 */
public class PecesAdapter extends RecyclerView.Adapter<PecesAdapter.ViewHolder> {

    private ArrayList<peces> pezArrayList;
    private int itemLayout;

    public PecesAdapter(ArrayList<peces> data,  int itemLayout){

        this.pezArrayList = data;
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
    public PecesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PecesAdapter.ViewHolder viewHolder, int position) {

        peces pusheen = pezArrayList.get(position);

        viewHolder.name.setText(pusheen.getNombre());
        viewHolder.precio.setText(pusheen.getPrecio());

        if (pusheen.getId()!=null) {

            switch (pusheen.getId()) {

                case 1:
                    viewHolder.image.setImageResource(R.mipmap.pez1);
                    break;

                case 2:
                    viewHolder.image.setImageResource(R.mipmap.pez2);
                    break;

                case 3:
                    viewHolder.image.setImageResource(R.mipmap.pez3);
                    break;

                case 4:
                    viewHolder.image.setImageResource(R.mipmap.pez4);
                    break;

                case 5:
                    viewHolder.image.setImageResource(R.mipmap.pez5);
                    break;
                case 6:
                    viewHolder.image.setImageResource(R.mipmap.pez6);
                    break;
                case 7:
                    viewHolder.image.setImageResource(R.mipmap.pez7);
                    break;
                case 8:
                    viewHolder.image.setImageResource(R.mipmap.pez8);
                    break;
                case 9:
                    viewHolder.image.setImageResource(R.mipmap.pez9);
                    break;
            }

        }else{

            viewHolder.image.setImageResource(R.mipmap.perro1);
        }

        viewHolder.itemView.setTag(pusheen);
    }

    @Override
    public int getItemCount() {
        return this.pezArrayList.size();
    }


}
