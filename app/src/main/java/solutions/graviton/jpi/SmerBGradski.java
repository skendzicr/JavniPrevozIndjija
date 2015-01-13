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
public class SmerBGradski extends Fragment {

    ListView mListView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.smer4prigradski, container, false);

        String mojNiz [] = {};


        mListView = (ListView) rootView.findViewById(R.id.list);


        Spinner mySpinner = (Spinner) rootView.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.smerb_gradski, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(arrayAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String odabranaLista[] = {};
                Calendar rightNow = Calendar.getInstance();

                switch (position) {
                    case 0:

                        odabranaLista = getResources().getStringArray(R.array.gbautobuska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbautobuskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbautobuskaned);
                        }
                        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 1:

                        odabranaLista = getResources().getStringArray(R.array.gbjpopovica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbjpopovicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbjpopovicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 2:

                        odabranaLista = getResources().getStringArray(R.array.gbgombit);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbgombitsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbgombitned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 3:

                        odabranaLista = getResources().getStringArray(R.array.gbpivara);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbpivarasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbpivaraned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 4:

                        odabranaLista = getResources().getStringArray(R.array.gbcentar);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbcentarsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbcentarned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 5:

                        odabranaLista = getResources().getStringArray(R.array.gbpumpa);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbpumpasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbpumpaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 6:

                        odabranaLista = getResources().getStringArray(R.array.gbdunavska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbdunavskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbdunavskaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 7:

                        odabranaLista = getResources().getStringArray(R.array.gbkc);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbkcsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbkcned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 8:

                        odabranaLista = getResources().getStringArray(R.array.gbigb);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbigbsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbigbned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 9:

                        odabranaLista = getResources().getStringArray(R.array.gbgrundfos);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbgrundfossub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbgrundfosned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 10:

                        odabranaLista = getResources().getStringArray(R.array.gbautlet);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbautletsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbautletned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 11:

                        odabranaLista = getResources().getStringArray(R.array.gbsase);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbsasesub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbsasened);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 12:

                        odabranaLista = getResources().getStringArray(R.array.gbsasecentar);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbsasecentarsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbsasecentarned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 13:

                        odabranaLista = getResources().getStringArray(R.array.gbhenkel);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbhenkelsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbhenkelned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 14:

                        odabranaLista = getResources().getStringArray(R.array.gbzeleznicka);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbzeleznickasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbzeleznickaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 15:

                        odabranaLista = getResources().getStringArray(R.array.gbbradicevica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbbradicevicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbbradicevicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 16:

                        odabranaLista = getResources().getStringArray(R.array.gbasbradicevica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbasbradicevicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbasbradicevicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 17:

                        odabranaLista = getResources().getStringArray(R.array.gbdjvojnovica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbdjvojnovicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbdjvojnovicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 18:

                        odabranaLista = getResources().getStringArray(R.array.gbgroblje);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbgrobljesub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbgrobljened);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 19:

                        odabranaLista = getResources().getStringArray(R.array.gbhala);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbhalasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbhalaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 20:

                        odabranaLista = getResources().getStringArray(R.array.gbdradovica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbdradovicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbdradovicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 21:

                        odabranaLista = getResources().getStringArray(R.array.gbssumanovica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbssumanovicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbssumanovicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 22:

                        odabranaLista = getResources().getStringArray(R.array.gbvbrigada1);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbvbrigada1sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbvbrigada1ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;
                    case 23:

                        odabranaLista = getResources().getStringArray(R.array.gbvbrigada2);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbvbrigada2sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbvbrigada2ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;


                    case 24:

                        odabranaLista = getResources().getStringArray(R.array.gbacarnojevica);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbacarnojevicasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbacarnojevicaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 25:

                        odabranaLista = getResources().getStringArray(R.array.gbbstrahinje);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbbstrahinjesub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbbstrahinjened);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 26:

                        odabranaLista = getResources().getStringArray(R.array.gbbreg);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbbregsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbbregned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;
                    case 27:

                        odabranaLista = getResources().getStringArray(R.array.gbnjegoseva2);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbnjegoseva2sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbnjegoseva2ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 28:

                        odabranaLista = getResources().getStringArray(R.array.gbomladinska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbomladinskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbomladinskaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 29:

                        odabranaLista = getResources().getStringArray(R.array.gbsmarinkovic);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbsmarinkovicsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbsmarinkovicned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    default:
                        odabranaLista = getResources().getStringArray(R.array.gbautobuska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbautobuskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.gbautobuskaned);
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

