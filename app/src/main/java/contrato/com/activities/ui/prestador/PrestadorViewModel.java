package contrato.com.activities.ui.prestador;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrestadorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PrestadorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is prestador fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}