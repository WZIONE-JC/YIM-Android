package net.devyy.yi.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.devyy.yi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingTabFragment extends Fragment {


    public SettingTabFragment( ) {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.module_fragment_setting_tab, container, false);
    }

}
