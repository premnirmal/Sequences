package com.github.premnirmal.sequences;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.os.Bundle;

/**
 * Created by premnirmal on 9/10/14.
 */
public class MyActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        String[] sequences = getResources().getStringArray(R.array.sequences);
        for (String sequence : sequences) {
            actionBar.addTab(actionBar.newTab().setText(sequence).setTabListener(tabListener));
        }
    }

    private ActionBar.TabListener tabListener = new ActionBar.TabListener() {

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            NumberSequence numberSequence = null;
            switch (tab.getPosition()) {
                case 0:
                    numberSequence = new FibonacciSequence();
                    break;
                case 1:
                    numberSequence = new SquareSequence();
                    break;
                case 2:
                    numberSequence = new RecamanSequence();
                    break;
            }
            setListAdapter(new NumberAdapter(numberSequence));
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }
    };
}
