package contrato.com.activities.ui.tipoprestador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import java.util.ArrayList;
import java.util.List;

import contrato.com.R;
import contrato.com.boostrap.APIClient;
import contrato.com.model.TipoPrestador;
import contrato.com.resource.TipoPrestadorResource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class TipoPrestadorFragment_bkp extends Fragment {
    public TextView txtNome;
    public TextView txtEmail;
    public List<TipoPrestador> lista = new ArrayList<>();
    public ListView listaPrestador;
    public List<TipoPrestador> listPrestador;

    private TipoPrestadorViewModel tipoPrestadorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tipoPrestadorViewModel =
                ViewModelProviders.of(this).get(TipoPrestadorViewModel.class);

        View root = inflater.inflate(R.layout.fragment_tipoprestador, container, false);

        final TextView textView = root.findViewById(R.id.text_tipoprestador);

        tipoPrestadorViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });


        return root;
    }
}