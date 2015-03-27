package com.example.davidfresh.tiendamascotas.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.davidfresh.tiendamascotas.R;
import com.example.davidfresh.tiendamascotas.adapters.PecesAdapter;
import com.example.davidfresh.tiendamascotas.models.peces;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Peces_fragment extends Fragment {

    ArrayList<peces> pecesdata;


    public Peces_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View peces_view = inflater.inflate(R.layout.fragment_peces, container, false);

        ArrayList<peces> peceses = new ArrayList<>();

        peces peces = new peces();
        peces.setId(1);
        peces.setNombre("Pez Angel Negro");
        peces.setPrecio("$ 100  ");
        peceses.add(peces);

        peces peces1 = new peces();
        peces1.setId(2);
        peces1.setNombre("Pez Besador");
        peces1.setPrecio("$  80");
        peceses.add(peces1);


        peces peces2 = new peces();
        peces2.setId(3);
        peces2.setNombre("Pez Ciclido Joya");
        peces2.setPrecio("$  120");
        peceses.add(peces2);

        peces peces3 = new peces();
        peces3.setId(4);
        peces3.setNombre("Pez Ciclido Acci");
        peces3.setPrecio("$  180");
        peceses.add(peces3);

        peces peces4 = new peces();
        peces4.setId(5);
        peces4.setNombre("Pez Ciclido Cara Azul");
        peces4.setPrecio("$  140");
        peceses.add(peces4);

        peces peces5 = new peces();
        peces5.setId(6);
        peces5.setNombre("Pez Ciclido Rey Midas");
        peces5.setPrecio("$  300");
        peceses.add(peces5);


        peces peces6 = new peces();
        peces6.setId(7);
        peces6.setNombre("Pez Colisa Turquesa");
        peces6.setPrecio("$  100");
        peceses.add(peces6);


        peces peces7 = new peces();
        peces7.setId(8);
        peces7.setNombre("Pez Disco Sangre de Pichon");
        peces7.setPrecio("$  500");
        peceses.add(peces7);

        peces peces8 = new peces();
        peces8.setId(9);
        peces8.setNombre("Pez Mollie Polvo Dorado");
        peces8.setPrecio("$  50");
        peceses.add(peces8);













        //Fin de nuestro dataset

        //Configuración del recyclerView, con nuestro dataSet y nuestro Adapter

        //Aqui buscamos el Widget recyclerView
        RecyclerView recyclerView = (RecyclerView) peces_view.findViewById(R.id.my_recycler_view_pez);

        //A pesar del tamaño de la pantalla, asegurar que los elementos se vean siempre igual.
        recyclerView.setHasFixedSize(true);

        //Configuramos la animación por defecto
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Ahora le pasamos nuestro dataset y la forma en que se vera cada fila.
        recyclerView.setAdapter(new PecesAdapter(peceses, R.layout.row_peces));

        //Importante, ahora podemos indicar si mostrar los elementos como fila o como grilla, en este
        //caso setLayoutManager() esta  configurado como grilla de una columna, es por es eso que se ve
        //como fila, recordar que el mismo resultado se obtiene con
        // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);

        return peces_view;







    }


    }



