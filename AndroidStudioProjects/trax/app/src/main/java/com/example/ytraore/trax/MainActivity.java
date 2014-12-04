package com.example.ytraore.trax;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
//Définition des constantes pour distinguer les rubriques

    private static final int FRUIT=0;
    private static final int LAITIERS=1;
    private static final int LEGUMES=2;
    private static final int BOUCHERIE=3;
    private static final int POISSONNERIE=4;
    private static final int BOULANGERIE=5;
    private static final int CHARCUTERIE=6;

    //les boutons sont stockés dans un tableau
    private Button[] listeBoutons = new Button[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Afficher les composants graphiques définis dans le fichiers activity_main.xml
       setContentView(R.layout.activity_main);

        //Stocker les boutons dans le tableau en fonction de l'id
//défini dans le fichier accueil.xml

        listeBoutons[FRUIT] = ((Button)this.findViewById(R.id.fruit));
        listeBoutons[LAITIERS] = ((Button)this.findViewById(R.id.laitier));
        listeBoutons[LEGUMES] = ((Button)this.findViewById(R.id.legume));
        listeBoutons[BOUCHERIE] = ((Button)this.findViewById(R.id.boucherie));
        listeBoutons[POISSONNERIE] = ((Button) this.findViewById(R.id.poissonerie));
        listeBoutons[BOULANGERIE] = ((Button) this.findViewById(R.id.boulangerie));
        listeBoutons[CHARCUTERIE] = ((Button) this.findViewById(R.id.charcuterie));

//Chaque bouton écoute l'évènement onClick
        for (int i = 0; i < listeBoutons.length; i++) {
            listeBoutons[i].setOnClickListener((android.view.View.OnClickListener) this);
        }
    }


    //Action à réaliser lorsqu'un évènement onClick est entendu
    public void onClick(View v) {
        String msg="";
        int activite;

//Tester l'identifiant de l'objet ayant capturer
// l'évènement onClick et agir en conséquences

        switch (v.getId()){

            case R.id.fruit :
                msg="Choisir des fruits";
                activite=FRUIT;
                break;
            case R.id.laitier:
                msg="Choisir des produits laitiers";
                activite=LAITIERS;
                break;
            case R.id.legume :
                msg="Choisir des légumes";
                activite=LEGUMES;
                break;
            case R.id.boucherie:
                msg="Choisir dans la boucherie";
                activite=BOUCHERIE;
                break;
            case R.id.poissonerie:
                msg="Choisir dans la poissonerie";
                activite=POISSONNERIE;
                break;
            case R.id.boulangerie:
                msg="Choisir dans la boulagerie";
                activite=BOULANGERIE;
                break;
            case R.id.charcuterie:
                msg="Choisir dans la charcuterie";
                activite=CHARCUTERIE;
                break;

        }
//Afficher le message correspondant au bouton sélectionné
        Toast msgT= Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        msgT.show();
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

    public static class Mydialog extends DialogFragment{


    }

}
