package model.etapa;

import model.Automovel;

public abstract class Etapa {

    private Etapa etapaSeguinte;

    public Etapa getEtapaSeguinte() {
        return etapaSeguinte;
    }

    public void setEtapaSeguinte(Etapa etapaSeguinte) {
        this.etapaSeguinte = etapaSeguinte;
    }

    public abstract String getDescricaoEtapa();

    public String iniciarProducao(Automovel automovel) {

        if (getEtapaSeguinte() != null) {
            return getDescricaoEtapa()
                    .concat("\n")
                    .concat(etapaSeguinte.iniciarProducao(automovel));
        }

        return getDescricaoEtapa()
                .concat("\n")
                .concat("Fim do processo de produção...");
    }
}
