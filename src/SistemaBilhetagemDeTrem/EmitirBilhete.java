package SistemaBilhetagemDeTrem;

import java.math.BigDecimal;

public interface EmitirBilhete {

    void emitir(String passaporte, BigDecimal precoNormalDaPassagem, TipoDeClasseParaViagem classeDaViagem) throws Exception;
}
