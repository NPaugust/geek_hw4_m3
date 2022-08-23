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


public class ContinentFragment extends Fragment implements OnClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Element> elements;
    private FirstAdapter firstAdapter;
    public static final String KEY = "493";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initRecyclerView(view);
    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.continent_recycler);
        firstAdapter = new FirstAdapter(elements, requireContext(), (OnClickListener) this);
        recyclerView.setAdapter(firstAdapter);
    }

    private void loadData() {
        elements = new ArrayList<>();
        elements.add(new Element(1, R.drawable.c_europe, "Europe"));
        elements.add(new Element(2, R.drawable.c_africa, "Africa"));
        elements.add(new Element(3, R.drawable.c_asia, "Asia"));
        elements.add(new Element(4, R.drawable.c_north_america, "North America"));
        elements.add(new Element(5, R.drawable.c_south_america, "South America"));
    }

    @Override
    public void onClick(Element element) {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY, element.getModel());
        Fragment fragment = new CountryFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container, fragment).commit();
    }
}