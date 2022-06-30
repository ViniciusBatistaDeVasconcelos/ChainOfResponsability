package model.etapa;

public class EtapaEstruturacao extends Etapa {

    public EtapaEstruturacao(Etapa etapaSeguinte) {
        setEtapaSeguinte(etapaSeguinte);
    }

    @Override
    public String getDescricaoEtapa() {
        return "Etapa Estruturação";
    }
}
