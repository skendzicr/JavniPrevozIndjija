package solutions.graviton.jpi;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.Calendar;

/**
 * Created by skendzicr on 4/11/14.
 */
public class SmerAPrigradski  extends Fragment {

    ListView mListView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View rootView =  inflater.inflate(R.layout.smer4prigradski, container, false);



        String mojNiz [] = {};


        mListView = (ListView) rootView.findViewById(R.id.list);


        Spinner mySpinner = (Spinner) rootView.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.smera_stanice, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(arrayAdapter);

       mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               String odabranaLista [] = {};
               Calendar rightNow = Calendar.getInstance();

               switch (position){
                   case 0:

                    odabranaLista = getResources().getStringArray(R.array.indjija);

                     if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                     {
                           odabranaLista = getResources().getStringArray(R.array.indjijasub);
                     }
                     if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                     {
                           odabranaLista = getResources().getStringArray(R.array.indjijaned);
                     }

                    ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                    mListView.setAdapter(adapter);
                    break;

                   case 1:

                   odabranaLista = getResources().getStringArray(R.array.grundfos);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.grundfossub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.grundfosned);
                       }
                   adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                   mListView.setAdapter(adapter);
                   break;

                   case 2:

                       odabranaLista = getResources().getStringArray(R.array.autlet);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.autletsub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.autletned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 3:

                       odabranaLista = getResources().getStringArray(R.array.sase);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.sasesub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.sasened);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 4:

                       odabranaLista = getResources().getStringArray(R.array.nslankamen);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.nslankamensub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.nslankamenned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 5:

                       odabranaLista = getResources().getStringArray(R.array.sslankamen);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.sslankamensub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.sslankamenned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 6:

                       odabranaLista = getResources().getStringArray(R.array.slvinogradi);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.slvinogradisub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.slvinogradined);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 7:

                       odabranaLista = getResources().getStringArray(R.array.krcedin);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.krcedinsub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.krcedinned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 8:

                       odabranaLista = getResources().getStringArray(R.array.beska);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.beskasub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.beskaned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 9:

                       odabranaLista = getResources().getStringArray(R.array.cortanovci);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.cortanovcisub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.cortanovcined);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 10:

                       odabranaLista = getResources().getStringArray(R.array.gladnos);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.gladnossub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.gladnosned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 11:

                       odabranaLista = getResources().getStringArray(R.array.maradik);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.maradiksub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.maradikned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 12:

                       odabranaLista = getResources().getStringArray(R.array.autobuska);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.autobuskasub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.autobuskaned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   case 13:

                       odabranaLista = getResources().getStringArray(R.array.igb);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.igbsub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.igbned);
                       }
                       adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                       mListView.setAdapter(adapter);
                       break;

                   default:
                   odabranaLista = getResources().getStringArray(R.array.indjija);
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.indjijasub);
                       }
                       if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                       {
                           odabranaLista = getResources().getStringArray(R.array.indjijaned);
                       }
                   adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                   mListView.setAdapter(adapter);
                   break;

               }


           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

               String odabranaLista [];
               odabranaLista = getResources().getStringArray(R.array.indjija);
               ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
               mListView.setAdapter(adapter);

           }
       });


        return rootView;
    }





}
