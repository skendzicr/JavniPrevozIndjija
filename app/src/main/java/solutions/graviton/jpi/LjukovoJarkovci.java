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
public class LjukovoJarkovci extends Fragment {

    ListView mListView = null;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.smer4prigradski, container, false);

        String mojNiz [] = {};


        mListView = (ListView) rootView.findViewById(R.id.list);


        Spinner mySpinner = (Spinner) rootView.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.ljukovojarkovci, android.R.layout.simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(arrayAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String odabranaLista[] = {};
                Calendar rightNow = Calendar.getInstance();

                switch (position) {
                    case 0:

                        odabranaLista = getResources().getStringArray(R.array.indjija3);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.indjija3sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.indjija3ned);
                        }
                        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 1:

                        odabranaLista = getResources().getStringArray(R.array.ljukovo3);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.ljukovo3sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.ljukovo3ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 2:

                        odabranaLista = getResources().getStringArray(R.array.jarkovci3);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.jarkovci3sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.jarkovci3ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 3:

                        odabranaLista = getResources().getStringArray(R.array.autobuska3);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.autobuska3ned);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.autobuska3ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    case 4:

                        odabranaLista = getResources().getStringArray(R.array.igb3);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.igb3sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.igb3ned);
                        }
                        adapter = new ArrayAdapter<>(getActivity().getBaseContext(), R.layout.row, R.id.vremeView, odabranaLista);
                        mListView.setAdapter(adapter);
                        break;

                    default:

                        odabranaLista = getResources().getStringArray(R.array.indjija3);
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.indjija3sub);
                        }
                        if (rightNow.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY)
                        {
                            odabranaLista = getResources().getStringArray(R.array.indjija3ned);
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
