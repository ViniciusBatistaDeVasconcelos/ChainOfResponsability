package model;

public class Automovel {

    private TipoAutomovel tipoAutomovel;

    public Automovel(TipoAutomovel tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    public TipoAutomovel getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(TipoAutomovel tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }
}