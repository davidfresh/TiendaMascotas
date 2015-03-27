package com.example.davidfresh.tiendamascotas.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidfresh.tiendamascotas.R;
import com.example.davidfresh.tiendamascotas.models.perros;

import java.util.ArrayList;

/**
 * Created by Davidfresh on 25/03/15.
 */
public class PerrosAdapter extends RecyclerView.Adapter<PerrosAdapter.ViewHolder> {

    private ArrayList<perros> perrosArrayList;
    private int itemLayout;

    public PerrosAdapter(ArrayList<perros> data,  int itemLayout){

        this.perrosArrayList = data;
        this.itemLayout = itemLayout;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView raz;
        private TextView prec;

        public ViewHolder(View itemView) {

            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            raz = (TextView) itemView.findViewById(R.id.raza);
            prec = (TextView) itemView.findViewById(R.id.precio);

        }
    }

    @Override
    public PerrosAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PerrosAdapter.ViewHolder viewHolder, int position) {

        perros pusheen = perrosArrayList.get(position);

        viewHolder.raz.setText(pusheen.getRaza());
        viewHolder.prec.setText(pusheen.getPrecio());

        if (pusheen.getId()!=null) {

            switch (pusheen.getId()) {

                case 1:
                    viewHolder.image.setImageResource(R.mipmap.perro1);
                    break;

                case 2:
                    viewHolder.image.setImageResource(R.mipmap.perro2);
                    break;

                case 3:
                    viewHolder.image.setImageResource(R.mipmap.perro3);
                    break;

                case 4:
                    viewHolder.image.setImageResource(R.mipmap.perro4);
                    break;

                case 5:
                    viewHolder.image.setImageResource(R.mipmap.perro5);
                    break;
                case 6:
                    viewHolder.image.setImageResource(R.mipmap.perro6);
                    break;
                case 7:
                    viewHolder.image.setImageResource(R.mipmap.perro7);
                    break;
                case 8:
                    viewHolder.image.setImageResource(R.mipmap.perro8);
                    break;
                case 9:
                    viewHolder.image.setImageResource(R.mipmap.perro9);
                    break;
            }

        }else{

            viewHolder.image.setImageResource(R.mipmap.perro1);
        }

        viewHolder.itemView.setTag(pusheen);
    }

    @Override
    public int getItemCount() {
        return this.perrosArrayList.size();
    }


}
