package com.example.firebasepush.Fragments;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firebasepush.R;

public class LoginFragments extends Fragment {
    public LoginFragments() {

    }
    public static LoginFragments newInstance() {
        LoginFragments fragment = new LoginFragments();
        Bundle args = new Bundle();
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

        final View view =  inflater.inflate(R.layout.fragment_login_fragments, container, false);

        view.findViewById(R.id.buttonRegistrar).setOnClickListener(v->{
           Navigation.findNavController(view).navigate(R.id.action_loginFragments_to_cadastroFragment);
        });

        view.findViewById(R.id.buttonEntrar).setOnClickListener(v->{
            Navigation.findNavController(view).navigate(R.id.action_loginFragments_to_primeiraTelaFragment);
        });







        return view ;
    }
}