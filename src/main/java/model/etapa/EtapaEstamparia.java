package model.etapa;

public class EtapaEstamparia extends Etapa {

    public EtapaEstamparia(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Estamparia";
    }
}