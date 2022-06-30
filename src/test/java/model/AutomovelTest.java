package model;

import model.etapa.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AutomovelTest {

    EtapaTestes etapaTestes;
    EtapaMontagem etapaMontagem;
    EtapaMotor etapaMotor;
    EtapaPortas etapaPortas;
    EtapaPintura etapaPintura;
    EtapaFunilaria etapaFunilaria;
    EtapaEstruturacao etapaEstruturacao;
    EtapaEstamparia etapaEstamparia;

    @BeforeEach
    void setUp() {
        etapaTestes = new EtapaTestes(null);
        etapaMontagem = new EtapaMontagem(etapaTestes);
        etapaMotor = new EtapaMotor(etapaMontagem);
        etapaPortas = new EtapaPortas(etapaMotor);
        etapaPintura = new EtapaPintura(etapaPortas);
        etapaFunilaria = new EtapaFunilaria(etapaPintura);
        etapaEstruturacao = new EtapaEstruturacao(etapaFunilaria);
        etapaEstamparia = new EtapaEstamparia(etapaEstruturacao);
    }

    @Test
    void deveRetornarTodasAsEtapasDeProducaoEmSequencia() {
        Automovel automovel = new Automovel(TipoAutomovelCarro.getTipoAutomovelCarro());
        assertEquals(
                "Etapa Estamparia\n" +
                        "Etapa Estruturação\n" +
                        "Etapa Funilaria\n" +
                        "Etapa Pintura\n" +
                        "Etapa Portas\n" +
                        "Etapa Motor\n" +
                        "Etapa Montagem\n" +
                        "Etapa Testes\n" +
                        "Fim do processo de produção...",
                etapaEstamparia.iniciarProducao(automovel)
        );
    }
}