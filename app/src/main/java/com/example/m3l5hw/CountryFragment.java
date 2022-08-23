package com.example.m3l5hw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CountryFragment extends Fragment implements OnClickListener {



    private RecyclerView recyclerView;
    private ArrayList<Element> countries;
    private FirstAdapter firstAdapter;

    public static final String KEY = "493";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.country_recycler);
        firstAdapter = new FirstAdapter(countries, requireContext(), this);
        recyclerView.setAdapter(firstAdapter);
    }

    private void loadData() {

        countries = new ArrayList<>();

        Bundle bundle = getArguments();
        switch (bundle.getInt(KEY)) {
            case 1:
                countries.add(new Element(R.drawable.europe_britain, "Great Britain"));
                countries.add(new Element(R.drawable.europe_czech, "Czech"));
                countries.add(new Element(R.drawable.europe_finland, "Finland"));
                countries.add(new Element(R.drawable.europe_france, "France"));
                countries.add(new Element(R.drawable.europe_norway, "Norway"));
                break;
            case 2:
                countries.add(new Element(R.drawable.africa_nigeria, "Nigeria"));
                countries.add(new Element(R.drawable.africa_marokko, "Marokko"));
                countries.add(new Element(R.drawable.africa_senegal, "Senegal"));
                countries.add(new Element(R.drawable.africa_south_africa, "South Africa"));
                countries.add(new Element(R.drawable.africa_congo, "Congo"));
                break;
            case 3:
                countries.add(new Element(R.drawable.asia_japan, "Japan"));
                countries.add(new Element(R.drawable.asia_kazakh, "Kazakhstan"));
                countries.add(new Element(R.drawable.asia_kyrgyz, "Kyrgyzstan"));
                countries.add(new Element(R.drawable.asia_korea, "Korea"));
                countries.add(new Element(R.drawable.asia_india, "India"));
                break;
            case 4:
                countries.add(new Element(R.drawable.na_mexico, "Mexico"));
                countries.add(new Element(R.drawable.na_usa, "USA"));
                countries.add(new Element(R.drawable.na_canada, "Canada"));
                countries.add(new Element(R.drawable.na_cuba, "Cuba"));
                countries.add(new Element(R.drawable.na_jamaica, "Jamaica"));
                break;
            case 5:
                countries.add(new Element(R.drawable.sa_brazil, "Brazil"));
                countries.add(new Element(R.drawable.sa_argentina, "Argentina"));
                countries.add(new Element(R.drawable.sa_chili, "Chile"));
                countries.add(new Element(R.drawable.sa_venezuela, "Venezuela"));
                countries.add(new Element(R.drawable.sa_columbia, "Columbia"));
                break;
        }

    }

    @Override
    public void onClick(Element element) {

    }
}