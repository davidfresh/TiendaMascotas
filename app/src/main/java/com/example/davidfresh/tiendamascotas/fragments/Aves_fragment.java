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
import com.example.davidfresh.tiendamascotas.adapters.AvesAdapter;
import com.example.davidfresh.tiendamascotas.models.aves;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Aves_fragment extends Fragment {

    ArrayList<aves> avesdata;

    public Aves_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View aves_view = inflater.inflate(R.layout.fragment_aves, container, false);

        ArrayList<aves> aveses = new ArrayList<>();

        aves aves = new aves();
        aves.setId(1);
        aves.setNombre("Agaporni Personata Azul");
        aves.setPrecio("$  500");
        aveses.add(aves);


        aves aves1 = new aves();
        aves1.setId(2);
        aves1.setNombre("Cacatúa Cresta Amarilla");
        aves1.setPrecio("$ 9,000");
        aveses.add(aves1);



        aves aves2 = new aves();
        aves2.setId(3);
        aves2.setNombre("Canario Amarillo Inglés");
        aves2.setPrecio("$ 1,000");
        aveses.add(aves2);


        aves aves3 = new aves();
        aves3.setId(4);
        aves3.setNombre("Canario Border");
        aves3.setPrecio("$ 1,200");
        aveses.add(aves3);


        aves aves4 = new aves();
        aves4.setId(5);
        aves4.setNombre("Diamante Bichenov");
        aves4.setPrecio("$ 1,500");
        aveses.add(aves4);



        aves aves5 = new aves();
        aves5.setId(6);
        aves5.setNombre("Diamante Moteado");
        aves5.setPrecio("$1,100");
        aveses.add(aves5);


        aves aves6 = new aves();
        aves6.setId(7);
        aves6.setNombre("Finche Pico de Cera Pecho Dorado");
        aves6.setPrecio("$ 800");
        aveses.add(aves6);


        aves aves7 = new aves();
        aves7.setId(8);
        aves7.setNombre("Guacamaya Enana");
        aves7.setPrecio("$ 10,000");
        aveses.add(aves7);


        aves aves8 = new aves();
        aves8.setId(9);
        aves8.setNombre("Rosella Carmesi Mutacion Azul");
        aves8.setPrecio("$ 5,000");
        aveses.add(aves8);








        //Fin de nuestro dataset

        //Configuración del recyclerView, con nuestro dataSet y nuestro Adapter

        //Aqui buscamos el Widget recyclerView
        RecyclerView recyclerView = (RecyclerView) aves_view.findViewById(R.id.my_recycler_view_aves);

        //A pesar del tamaño de la pantalla, asegurar que los elementos se vean siempre igual.
        recyclerView.setHasFixedSize(true);

        //Configuramos la animación por defecto
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Ahora le pasamos nuestro dataset y la forma en que se vera cada fila.
        recyclerView.setAdapter(new AvesAdapter(aveses, R.layout.row_aves));

        //Importante, ahora podemos indicar si mostrar los elementos como fila o como grilla, en este
        //caso setLayoutManager() esta  configurado como grilla de una columna, es por es eso que se ve
        //como fila, recordar que el mismo resultado se obtiene con
        // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);

        return aves_view;







    }

    }



