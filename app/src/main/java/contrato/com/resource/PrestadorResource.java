package contrato.com.resource;

import java.util.List;

import contrato.com.model.Prestador;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PrestadorResource {
    @GET("/prestador")
    Call<List<Prestador>> get();

    @POST("/prestador")
    Call<Prestador> post(@Body Prestador prestador);

    @PUT("/prestador/{id}")
    Call<Prestador> put(@Body Prestador prestador);

    @DELETE("/prestador/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/prestador/{id}")
    Call<Prestador> patch(Integer id, @Body Prestador prestador);

}
