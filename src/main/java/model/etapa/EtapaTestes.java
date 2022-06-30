package model.etapa;

public class EtapaTestes extends Etapa {

    public EtapaTestes(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Testes";
    }
}
