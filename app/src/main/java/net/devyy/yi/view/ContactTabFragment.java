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
public class ContactTabFragment extends Fragment {


    public ContactTabFragment( ) {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.module_fragment_contact_tab, container, false);
    }

}
