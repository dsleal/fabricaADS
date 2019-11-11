package contrato.com.activities.ui.tipoprestador;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TipoPrestadorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TipoPrestadorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tipo de prestador fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}