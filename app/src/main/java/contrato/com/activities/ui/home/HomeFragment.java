package contrato.com.activities.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import java.util.ArrayList;
import java.util.List;

import contrato.com.R;
import contrato.com.adapters.AdapterAlbums;
import contrato.com.boostrap.APIClient;
import contrato.com.model.Albums;
import contrato.com.resource.AlbumsResource;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomeFragment extends Fragment {

    public TextView txtNome;
    public TextView txtEmail;
    public List<Albums> lista = new ArrayList<>();
    public List<Albums> listUsers;


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        final ListView minhaLista = root.findViewById(R.id.listaTPPrestador);

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

                /*Pega a referencia do ENDPOINT e do converter(gson)
                 * */
                Retrofit retrofit = APIClient.getClient();

                //Faz o 'bind' da instância do retrofit com interface
                //que contém as operações (GET,POST,PUT,DELETE)
                AlbumsResource albumsResource = retrofit.create(AlbumsResource.class);

                //Faz a chamada do serviço
                Call<List<Albums>> get = albumsResource.get();

                get.enqueue(new Callback<List<Albums>>() {

                    @Override
                    public void onResponse(Call<List<Albums>> call, Response<List<Albums>> response) {
                        //ENTRADA DE DADOS

                        listUsers = response.body();

                        for(Albums user :  listUsers){
                            Albums u = new Albums(user.getTitle());
                            lista.add(u);
                        }

                        AdapterAlbums clienteAdapter = new AdapterAlbums(getContext(), lista);
                        minhaLista.setAdapter(clienteAdapter);

                    }

                    @Override
                    public void onFailure(Call<List<Albums>> call, Throwable t) {
                    }
                });




        return root;
    }
}