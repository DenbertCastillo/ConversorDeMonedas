import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    String APIkey="470fbf1f302c6e3ac0ee69e2";

    public Moneda buscaMoneda(String monedaBase, String monedaTarget, double monto){

       URI direccion= URI.create("https://v6.exchangerate-api.com/v6/" + APIkey +"/pair/" + monedaBase + "/" + monedaTarget + "/" + monto);
       HttpClient client = HttpClient.newHttpClient();
       HttpRequest request = HttpRequest.newBuilder()
               .uri(direccion)
               .build();


       try {
           HttpResponse<String> response = client
                   .send(request, HttpResponse.BodyHandlers.ofString());
           return new Gson().fromJson(response.body(), Moneda.class);
       } catch (Exception e) {
           throw new RuntimeException("La moneda ingresada no es valida");
       }
   }
}
