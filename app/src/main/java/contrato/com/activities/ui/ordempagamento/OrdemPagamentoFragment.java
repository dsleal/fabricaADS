package contrato.com.activities.ui.ordempagamento;

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
import contrato.com.activities.ui.notifications.NotificationsViewModel;

public class OrdemPagamentoFragment extends Fragment {

    private OrdemPagamentoViewModel ordemPagamentoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ordemPagamentoViewModel =
                ViewModelProviders.of(this).get(OrdemPagamentoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ordempagamento, container, false);
        final TextView textView = root.findViewById(R.id.text_ordempagamento);
        ordemPagamentoViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}