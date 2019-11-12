package contrato.com.resource;

import java.util.List;

import contrato.com.model.Albums;
import contrato.com.model.TipoPrestador;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface AlbumsResource {
    @GET("/albums")
    Call<List<Albums>> get();


}
