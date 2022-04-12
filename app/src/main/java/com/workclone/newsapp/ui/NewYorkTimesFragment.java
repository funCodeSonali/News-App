package com.workclone.newsapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.workclone.newsapp.R;
import com.workclone.newsapp.WebViewControllerClass;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewYorkTimesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewYorkTimesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NewYorkTimesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewYorkTimesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NewYorkTimesFragment newInstance(String param1, String param2) {
        NewYorkTimesFragment fragment = new NewYorkTimesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_new_york_times, container, false);

        WebView webView = view.findViewById(R.id.webviewnewyorktimes);
        webView.loadUrl("https://www.nytimes.com/international/");
        webView.setWebViewClient(new WebViewControllerClass());

    return view;
    }
}