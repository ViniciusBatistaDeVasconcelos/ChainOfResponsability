package model.etapa;

public class EtapaPortas extends Etapa {

    public EtapaPortas(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Portas";
    }
}
