package contrato.com.activities.ui.ordempagamento;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrdemPagamentoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OrdemPagamentoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ordem pagamento fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}