package jp.mursts.android.viewpagersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabFragment extends Fragment {

    private static final String ARG_PARAM1 = "selectedPosition";

    private int selectedPosition;

    public static TabFragment newInstance(int selectedPosition) {
        TabFragment fragment = new TabFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, selectedPosition);
        fragment.setArguments(args);
        return fragment;
    }
    public TabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            selectedPosition = args.getInt(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);
        TextView tv = (TextView) view.findViewById(R.id.greet);
        tv.setText("Hello TAB" + (selectedPosition + 1));
        return view;
    }


}
