package solutions.graviton.jpi;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

/**
 * Created by skendzicr on 12/20/2014.
 */
public class PrigradskiAdapter extends FragmentPagerAdapter {

    public static String[] prigradskiImena = {"Smer A","Smer B","Ljukovo - Jarkovci"};

    public PrigradskiAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int i) {

        switch (i)
        {
            case 0:
                return new SmerAPrigradski();
            case 1:
                return new SmerBPrigradski();
            case 2:
                return new LjukovoJarkovci();

        }
        return null;
    }

    @Override
    public int getCount() {
        return prigradskiImena.length;
    }

    public static String[] getPrigradskiImena() {
        return prigradskiImena;
    }

    public static void setPrigradskiImena(String[] prigradskiImena) {
        PrigradskiAdapter.prigradskiImena = prigradskiImena;
    }
}
