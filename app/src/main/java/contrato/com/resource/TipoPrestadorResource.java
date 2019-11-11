package contrato.com.resource;

import java.util.List;

import contrato.com.model.Prestador;
import contrato.com.model.TipoPrestador;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface TipoPrestadorResource {
    @GET("/tipoprestador")
    Call<List<TipoPrestador>> get();

    @POST("/tipoprestador")
    Call<TipoPrestador> post(@Body TipoPrestador tipoPrestador);

    @PUT("/tipoprestador/{id}")
    Call<TipoPrestador> put(@Body TipoPrestador tipoPrestador);

    @DELETE("/tipoprestador/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/tipoprestador/{id}")
    Call<TipoPrestador> patch(Integer id, @Body TipoPrestador tipoPrestador);

}
