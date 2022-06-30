package model.etapa;

public class EtapaFunilaria extends Etapa {

    public EtapaFunilaria(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Funilaria";
    }
}