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
import com.example.davidfresh.tiendamascotas.adapters.PerrosAdapter;
import com.example.davidfresh.tiendamascotas.models.perros;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Perros_fragment extends Fragment {

    ArrayList<perros> perrosData;



    public Perros_fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View perros_view = inflater.inflate(R.layout.fragment_perros, container, false);


        ArrayList<perros> perroses = new ArrayList<>();

        perros perros0 = new perros();
        perros0.setId(1);
        perros0.setRaza("Akita");
        perros0.setPrecio("$  15,000");
        perroses.add(perros0);


        perros perros1 = new perros();
        perros1.setId(2);
        perros1.setRaza("Boxer");
        perros1.setPrecio("$ 11,000");
        perroses.add(perros1);



        perros perros2 = new perros();
        perros2.setId(3);
        perros2.setRaza("Bulldog ingles");
        perros2.setPrecio("$ 9,000");
        perroses.add(perros2);


        perros perros3 = new perros();
        perros3.setId(4);
        perros3.setRaza("Chow Chow");
        perros3.setPrecio("$ 15,000");
        perroses.add(perros3);



        perros perros4 = new perros();
        perros4.setId(5);
        perros4.setRaza("Dalmata");
        perros4.setPrecio("$ 12,000");
        perroses.add(perros4);


        perros perros5 = new perros();
        perros5.setId(6);
        perros5.setRaza("Maltes");
        perros5.setPrecio("$ 6,000");
        perroses.add(perros5);


        perros perros6 = new perros();
        perros6.setId(7);
        perros6.setRaza("Pug");
        perros6.setPrecio("$ 9,000");
        perroses.add(perros6);


        perros perros7 = new perros();
        perros7.setId(8);
        perros7.setRaza("Beagle");
        perros7.setPrecio("$ 8,000");
        perroses.add(perros7);


        perros perros8 = new perros();
        perros8.setId(9);
        perros8.setRaza("Chihuaheño");
        perros8.setPrecio("$ 5,000");
        perroses.add(perros8);



        //Fin de nuestro dataset

        //Configuración del recyclerView, con nuestro dataSet y nuestro Adapter

        //Aqui buscamos el Widget recyclerView
        RecyclerView recyclerView = (RecyclerView) perros_view.findViewById(R.id.my_recycler_view);

        //A pesar del tamaño de la pantalla, asegurar que los elementos se vean siempre igual.
        recyclerView.setHasFixedSize(true);

        //Configuramos la animación por defecto
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        //Ahora le pasamos nuestro dataset y la forma en que se vera cada fila.
        recyclerView.setAdapter(new PerrosAdapter(perroses, R.layout.row_perro));

        //Importante, ahora podemos indicar si mostrar los elementos como fila o como grilla, en este
        //caso setLayoutManager() esta  configurado como grilla de una columna, es por es eso que se ve
        //como fila, recordar que el mismo resultado se obtiene con
        // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);

        return perros_view;







    }


}
