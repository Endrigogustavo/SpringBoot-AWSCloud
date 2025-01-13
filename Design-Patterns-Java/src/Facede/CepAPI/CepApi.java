package Facede.CepAPI;

public class CepApi {
    private static class InstanceHolder{
        public static CepApi instance = new CepApi();
    }

    private CepApi() {
        super();
    }

    public static CepApi getInstance(){
        return InstanceHolder.instance;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
