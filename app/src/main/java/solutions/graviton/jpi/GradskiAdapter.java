package solutions.graviton.jpi;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

/**
 * Created by skendza on 12.1.2015.
 */
public class GradskiAdapter extends FragmentPagerAdapter {

    public static String[] gradskiImena = {"Smer A","Smer B"};

    public GradskiAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                return new SmerAGradski();
            case 1:
                return new SmerBGradski();


        }
        return null;
    }

    @Override
    public int getCount() {
        return gradskiImena.length;
    }

    public static String[] getGradskiImena() {
        return gradskiImena;
    }

    public static void setGradskiImena(String[] gradskiImena) {
        GradskiAdapter.gradskiImena = gradskiImena;
    }
}
