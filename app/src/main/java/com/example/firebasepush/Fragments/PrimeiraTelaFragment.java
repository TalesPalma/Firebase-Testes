package com.example.firebasepush.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firebasepush.R;


public class PrimeiraTelaFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    public PrimeiraTelaFragment() {

    }


    public static PrimeiraTelaFragment newInstance(String param1, String param2) {
        PrimeiraTelaFragment fragment = new PrimeiraTelaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_primeira_tela2, container, false);

    view.findViewById(R.id.buttonTela1Votlar).setOnClickListener(v->{
        Navigation.findNavController(view).navigate(R.id.action_primeiraTelaFragment_to_loginFragments);
    });


        return view;
    }
}