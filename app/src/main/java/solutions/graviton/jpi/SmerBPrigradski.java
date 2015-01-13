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
 * Created by skendzicr on 12/20/2014.
 */
public class SmerBPrigradski extends Fragment{

    ListView mListView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.smer4prigradski, container, false);

        String mojNiz [] = {};


        mListView = (ListView) rootView.findViewById(R.id.list);


        Spinner mySpinner = (Spinner) rootView.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.smerb_stanice, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(arrayAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String odabranaLista[] = {};
                Calendar rightNow = Calendar.getInstance();

                switch (position) {
                    case 0:

                        odabranaLista = getResources().getStringArray(R.array.pbautobuska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbautobuskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbautobuskaned);
                        }
                        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 1:

                        odabranaLista = getResources().getStringArray(R.array.pbmaradik);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbmaradiksub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbmaradikned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 2:

                        odabranaLista = getResources().getStringArray(R.array.pbgladnos);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbgladnossub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbgladnosned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 3:

                        odabranaLista = getResources().getStringArray(R.array.pbcortanovci);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbcortanovcisub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbcortanovcined);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 4:

                        odabranaLista = getResources().getStringArray(R.array.pbbeska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbbeskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbbeskaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 5:

                        odabranaLista = getResources().getStringArray(R.array.pbkrcedin);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbkrcedinsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbkrcedinned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 6:

                        odabranaLista = getResources().getStringArray(R.array.pbslvinogradi);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbslvinogradisub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbslvinogradined);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 7:

                        odabranaLista = getResources().getStringArray(R.array.pbsslankamen);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbsslankamensub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbsslankamenned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 8:

                        odabranaLista = getResources().getStringArray(R.array.pbnslankamen);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbnslankamensub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbnslankamenned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 9:

                        odabranaLista = getResources().getStringArray(R.array.pbsase);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbsasesub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbsasened);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 10:

                        odabranaLista = getResources().getStringArray(R.array.pbautlet);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbautletsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbautletned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 11:

                        odabranaLista = getResources().getStringArray(R.array.pbgrundfos);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbgrundfossub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbgrundfosned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 12:

                        odabranaLista = getResources().getStringArray(R.array.pbindjija);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbindjijasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbindjijaned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 13:

                        odabranaLista = getResources().getStringArray(R.array.pbigb);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbigbsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbigbned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 14:

                        odabranaLista = getResources().getStringArray(R.array.pbgombit);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbgombitsub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbgombitned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    default:
                        odabranaLista = getResources().getStringArray(R.array.pbautobuska);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbautobuskasub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.pbautobuskaned);
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
