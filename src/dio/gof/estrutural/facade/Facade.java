package dio.gof.estrutural.facade;

import dio.gof.estrutural.subsistema1.crm.CrmService;
import dio.gof.estrutural.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
