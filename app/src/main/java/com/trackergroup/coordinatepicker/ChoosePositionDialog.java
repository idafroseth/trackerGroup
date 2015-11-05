package com.trackergroup.coordinatepicker;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Ida Marie Froseth on 05.11.2015.
 */
public class ChoosePositionDialog extends Fragment{

    Button selectPositionBtn;
    /**
     *
     * @param inflater a LayoutInflater that created a view instance based on layout XML files
     * @param parentViewGroup is the view group to insert the fragment
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState){
        super.onCreateView(inflater, parentViewGroup, savedInstanceState);

        /*Creates the view by using the inflate method of the inflater. The parameters are the id of the Layout XML file,
        * a parent view group
        *  When you pass false as last parameter to inflate(), the parent ViewGroup is still used for layout calculations of the inflated View, so you cannot pass null as parent ViewGroup .
        */
        View rootView = inflater.inflate(R.layout.fragment_choose_pos, parentViewGroup, false);
        selectPositionBtn = (Button) rootView.findViewById(R.id.set_coordinate);
        selectPositionBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("SavingPos", "Saving pos: " );//+ clickedPosition.getPosition().toString());
            }
        });
        return rootView;
    }
}

