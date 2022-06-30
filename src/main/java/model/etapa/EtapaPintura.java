package model.etapa;

public class EtapaPintura extends Etapa {

    public EtapaPintura(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Pintura";
    }
}
