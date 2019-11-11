package contrato.com.activities.ui.prestador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import contrato.com.R;

public class PrestadorFragment extends Fragment {

    private PrestadorViewModel prestadorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        prestadorViewModel =
                ViewModelProviders.of(this).get(PrestadorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_prestador, container, false);
        final TextView textView = root.findViewById(R.id.text_prestador);
        prestadorViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}