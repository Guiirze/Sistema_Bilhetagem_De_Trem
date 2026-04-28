package SistemaBilhetagemDeTrem;

import java.math.BigDecimal;

public enum TipoDeClasseParaViagem {
    ECONOMICA(new BigDecimal("1.0")),
    EXECUTIVA(new BigDecimal("2.5")),
    PRIMEIRA_CLASSE(new BigDecimal("5.0"));

    private final BigDecimal multiplicador;

    TipoDeClasseParaViagem(BigDecimal multiplicador){
        this.multiplicador = multiplicador;
    }

    public BigDecimal getMultiplicador() {
        return this.multiplicador;
    }
}
