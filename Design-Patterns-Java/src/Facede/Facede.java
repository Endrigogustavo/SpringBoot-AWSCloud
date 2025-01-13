package Facede;

import Facede.CepAPI.CepApi;
import Facede.SubSistema1.CrmCliente;

public class Facede {

    public void MigrarCliente(String nome, String endereco){
        String cep = CepApi.getInstance().recuperarEstado(endereco);
        String cidade = CepApi.getInstance().recuperarCidade(cep);

        CrmCliente.GravarCliente(nome, endereco, cep, cidade);
    }
}
