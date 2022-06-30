package model.etapa;

public class EtapaMotor extends Etapa {

    public EtapaMotor(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Motor";
    }
}