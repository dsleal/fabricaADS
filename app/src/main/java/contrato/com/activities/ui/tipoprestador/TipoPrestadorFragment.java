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
import contrato.com.activities.ui.prestador.PrestadorViewModel;
import contrato.com.adapters.AdapterTipoPrestador;
import contrato.com.boostrap.APIClient;
import contrato.com.model.TipoPrestador;
import contrato.com.resource.TipoPrestadorResource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class TipoPrestadorFragment extends Fragment {
    public TextView txtNome;
    public TextView txtEmail;
    public List<TipoPrestador> lista = new ArrayList<>();
    public List<TipoPrestador> listPrestador;

    private TipoPrestadorViewModel tipoPrestadorViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tipoPrestadorViewModel =
                ViewModelProviders.of(this).get(TipoPrestadorViewModel.class);

        View root = inflater.inflate(R.layout.fragment_tipoprestador, container, false);

        final TextView textView = root.findViewById(R.id.text_tipoprestador);
        final ListView listaPrestador = root.findViewById(R.id.listaTPPrestador);

        /*Pega a referencia do ENDPOINT e do converter(gson)
         * */
        Retrofit retrofit = APIClient.getClient();

        //Faz o 'bind' da instância do retrofit com interface
        //que contém as operações (GET,POST,PUT,DELETE)
        TipoPrestadorResource tipoPrestadorResource = retrofit.create(TipoPrestadorResource.class);

        //Faz a chamada do serviço
        Call<List<TipoPrestador>> get = tipoPrestadorResource.get();

        get.enqueue(new Callback<List<TipoPrestador>>() {

            @Override
            public void onResponse(Call<List<TipoPrestador>> call, Response<List<TipoPrestador>> response) {
                //ENTRADA DE DADOS

                listPrestador = response.body();

                for(TipoPrestador tipoPrestador :  listPrestador){
                    TipoPrestador tp = new TipoPrestador(tipoPrestador.getDescricao(), tipoPrestador.isDesativado());
                    lista.add(tp);
                }

                AdapterTipoPrestador tipoPrestadorAdapter = new AdapterTipoPrestador(getContext(), lista);
                listaPrestador.setAdapter(tipoPrestadorAdapter);

            }

            @Override
            public void onFailure(Call<List<TipoPrestador>> call, Throwable t) {
            }
        });


        return root;
    }
}