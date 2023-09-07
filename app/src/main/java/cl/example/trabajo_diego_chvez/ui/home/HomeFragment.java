package cl.example.trabajo_diego_chvez.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import cl.example.trabajo_diego_chvez.MainActivity2;
import cl.example.trabajo_diego_chvez.MainActivity3;
import cl.example.trabajo_diego_chvez.R;
import cl.example.trabajo_diego_chvez.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
        ImageButton btnCambiarPantalla;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton btnCambiarPantalla = rootView.findViewById(R.id.btSpanish);
        btnCambiarPantalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), MainActivity2.class);
                startActivity(intent);
            }
        });
        ImageButton btAzul = rootView.findViewById(R.id.btAzul);
        btAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), MainActivity3.class);
                startActivity(intent);
            }
        });


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        //final TextView textView = binding.textHome;
        //homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}