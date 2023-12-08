package com.example.firebasepush.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firebasepush.R;

public class CadastroFragment extends Fragment {



    public CadastroFragment() {
        // Required empty public constructor
    }


    public static CadastroFragment newInstance() {
        CadastroFragment fragment = new CadastroFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_cadastro, container, false);


        view.findViewById(R.id.buttonVoltar).setOnClickListener(v->{
            Navigation.findNavController(view).navigate(R.id.action_cadastroFragment_to_loginFragments);
        });

        return  view;
    }
}