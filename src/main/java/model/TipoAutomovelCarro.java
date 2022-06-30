package model;

public class TipoAutomovelCarro implements TipoAutomovel {

    private static TipoAutomovelCarro tipoAutomovelCarro = new TipoAutomovelCarro();

    private TipoAutomovelCarro() {
    }

    public static TipoAutomovelCarro getTipoAutomovelCarro() {
        return tipoAutomovelCarro;
    }
}
