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
 * Created by skendza on 12.1.2015.
 */
public class SmerAGradski extends Fragment {

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
                        odabranaLista = getResources().getStringArray(R.array.gaautobuska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                             odabranaLista = getResources().getStringArray(R.array.gaautobuskasubota);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaautobuskaned);
                        }

                        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 1:

                        odabranaLista = getResources().getStringArray(R.array.gasmarinkovic);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gasmarinkovicsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gassumanovicaned);
                        }

                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 2:

                        odabranaLista = getResources().getStringArray(R.array.ganjegoseva1);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.ganjegoseva1sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.ganjegoseva1ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 3:

                        odabranaLista = getResources().getStringArray(R.array.ganjegoseva2);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.ganjegoseva2sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.ganjegoseva2ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 4:

                        odabranaLista = getResources().getStringArray(R.array.gazjovina1);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gazjovina1sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gazjovina1ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 5:

                        odabranaLista = getResources().getStringArray(R.array.gabstrahinje);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gabstrahinjesub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gabstrahinjened);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 6:

                        odabranaLista = getResources().getStringArray(R.array.gaacarnojevica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaacarnojevicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaacarnojevicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 7:

                        odabranaLista = getResources().getStringArray(R.array.gavbrigada);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gavbrigadasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gavbrigadaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 8:

                        odabranaLista = getResources().getStringArray(R.array.gazjovina2);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gazjovina2sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gazjovina2ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 9:

                        odabranaLista = getResources().getStringArray(R.array.gadradovica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadradovicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadradovicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 10:

                        odabranaLista = getResources().getStringArray(R.array.gassumanovica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gassumanovicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gassumanovicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 11:

                        odabranaLista = getResources().getStringArray(R.array.gahala);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gahalasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gahalaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 12:

                        odabranaLista = getResources().getStringArray(R.array.gapumpa);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gapumpasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gapumpaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 13:

                        odabranaLista = getResources().getStringArray(R.array.gadjvojnovica1);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadjvojnovica1sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadjvojnovica1ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 14:

                        odabranaLista = getResources().getStringArray(R.array.gadjvojnovica2);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadjvojnovica2sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadjvojnovica2ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 15:

                        odabranaLista = getResources().getStringArray(R.array.gacentar);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gacentarsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gacentarned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 16:

                        odabranaLista = getResources().getStringArray(R.array.gaas);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaassub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaasned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 17:

                        odabranaLista = getResources().getStringArray(R.array.gajpopovica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gajpopovicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gajpopovicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 18:

                        odabranaLista = getResources().getStringArray(R.array.gajuvitana);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gajuvitanasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gajuvitananed);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 19:

                        odabranaLista = getResources().getStringArray(R.array.gagombit);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gagombitsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gagombitned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 20:

                        odabranaLista = getResources().getStringArray(R.array.gapivara);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gapivarasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gapivaraned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 21:

                        odabranaLista = getResources().getStringArray(R.array.gabradicevica1);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gabradicevica1sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gabradicevica1ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 22:

                        odabranaLista = getResources().getStringArray(R.array.gabradicevica2);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gabradicevica2sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gabradicevica2ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;
                    case 23:

                        odabranaLista = getResources().getStringArray(R.array.gazeleznicka);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gazeleznickasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gazeleznickaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;


                    case 24:

                        odabranaLista = getResources().getStringArray(R.array.gahenkel);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gahenkelsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gahenkelned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 25:

                        odabranaLista = getResources().getStringArray(R.array.gautlet);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gautletsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gautletned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 26:

                        odabranaLista = getResources().getStringArray(R.array.gasase);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gasasesub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gasasened);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;
                    case 27:

                        odabranaLista = getResources().getStringArray(R.array.gasasecentar);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gasasecentarsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gasasecentarned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 28:

                        odabranaLista = getResources().getStringArray(R.array.gaigb);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaigbsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaigbned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 29:

                        odabranaLista = getResources().getStringArray(R.array.gakc);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gakcsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gakcned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 30:

                        odabranaLista = getResources().getStringArray(R.array.gadunavska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadunavskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gadunavskaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 31:

                        odabranaLista = getResources().getStringArray(R.array.gaskolska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaskolskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaskolskaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    default:
                        odabranaLista = getResources().getStringArray(R.array.gaautobuska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaautobuskaned);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gaautobuskaned);
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
