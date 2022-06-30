package model.etapa;

public class EtapaMontagem extends Etapa {

    public EtapaMontagem(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Montagem";
    }
}
