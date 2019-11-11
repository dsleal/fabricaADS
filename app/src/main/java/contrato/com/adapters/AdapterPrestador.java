package contrato.com.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;

import contrato.com.R;
import contrato.com.model.Prestador;

public class AdapterPrestador extends BaseAdapter {


    Context context;
    List<Prestador> colecao;
    LayoutInflater inflter;

    public AdapterPrestador(final Context applicationContext,
                            final List<Prestador> colecao) {
        this.context = applicationContext;
        this.colecao = colecao;

    }

    @Override
    public int getCount() {
        return this.colecao != null ? this.colecao.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return this.colecao.get(i);
    }

    private Prestador parsetItem(int i){
        return this.colecao.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // inflate the layout for each list row
        //'Infla' o layout(pega a referencia) para ser trabalhada
        //no método
        if (view == null) {
            view = LayoutInflater.from(context).
                    inflate(R.layout.activity_itens,                            viewGroup, false);
        }

        Prestador prestador = parsetItem(i);

        TextView campoNome, campoEmail;

        campoNome = view.findViewById(R.id.txtName);
        campoEmail = view.findViewById(R.id.txtEmail);

        campoNome.setText(prestador.getNome());
        campoEmail.setText(prestador.getDocumento());

        return view;
    }
}
