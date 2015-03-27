package com.example.davidfresh.tiendamascotas;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.davidfresh.tiendamascotas.fragments.Aves_fragment;
import com.example.davidfresh.tiendamascotas.fragments.Peces_fragment;
import com.example.davidfresh.tiendamascotas.fragments.Perros_fragment;


public class MainActivity extends ActionBarActivity {

    Spinner spinner;
    View perro,ave,pez;

    private Fragment[] fragments = new Fragment[]{

            new Perros_fragment(),
            new Aves_fragment(),
            new Peces_fragment()

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();


        perro = findViewById(R.id.fragment_dog);
        ave = findViewById(R.id.fragment_aves);
        pez = findViewById(R.id.fragment_pez);



        /*FragmentManager manager = getFragmentManager();
         final FragmentTransaction fragmentTransaction= manager.beginTransaction();

        for(Fragment fragment : fragments){
            fragmentTransaction.add(R.id.main_animales,fragment).hide(fragment);
        }

        fragmentTransaction.show(fragments[0]).commit();*/





        Spinner spinner = (Spinner) findViewById(R.id.animales_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
         ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Animales, android.R.layout.simple_spinner_item);



            //items.add( (CharSequence)spinner.getItemAtPosition(i) );
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parentView, View selectedItemView,
                                       int position, long id) {
                   switch (position)
                   {
                       case 0:
                           perro.setVisibility(View.VISIBLE);
                           ave.setVisibility(View.INVISIBLE);
                           pez.setVisibility(View.INVISIBLE);

                           break;
                       case 1:
                           perro.setVisibility(View.INVISIBLE);
                           ave.setVisibility(View.VISIBLE);
                           pez.setVisibility(View.INVISIBLE);
                           break;
                       case 2:
                           perro.setVisibility(View.INVISIBLE);
                           ave.setVisibility(View.INVISIBLE);
                           pez.setVisibility(View.VISIBLE);
                           break;
                   }





                     /*for(Fragment fragment : fragments){
                          fragmentTransaction.hide(fragment);
                      }

                      fragmentTransaction.show(fragments[position]);*/



            }




            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


            //Toast.makeText(parentView.getContext(), "Has seleccionado " +
                               // parentView.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();




        });

    }











    public void setToolbar(){

        //Configurando que el Toolbar como ActionBar
        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_my_toolbar);
        //En este ejemplo, ocultamos el titulo de la aplicación, esto es opcional
        toolbar.setTitle("Tienda de Macotas");
        setSupportActionBar(toolbar);

    }





















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
