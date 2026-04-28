package SistemaBilhetagemDeTrem;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SistemaBilhetagemDeTransporte implements  EmitirBilhete{
    java.util.Random random = new java.util.Random();

    @Override
    public void emitir(String passaporte, BigDecimal precoNormalDaPassagem, TipoDeClasseParaViagem classeDaViagem) throws Exception {

        // Padrão passaporte -------
        Pattern padraoDePassaporte = Pattern.compile("^[A-Za-z]{2}\\d{6}$");
            Matcher verificarPadraoDoPassaporte = padraoDePassaporte.matcher(passaporte);

            if(!verificarPadraoDoPassaporte.matches()){
                throw new PassaporteInvalido("O passaporte " + passaporte + " é iválido, por favor tente novamente ou ligue para o suporte.");

        } // Padrão passaporte ------


        // Padrão de acomodação do cliente ----
        int numeroDoAssentoDoCliente = ThreadLocalRandom.current().nextInt(1, 101);

        int portaoDeEmbarqueDoCliente = ThreadLocalRandom.current().nextInt(1, 11);
        // Padrão de acomadação do cliente ---

        BigDecimal multiplicador = classeDaViagem.getMultiplicador();
        BigDecimal precoBaseDaClasse = precoNormalDaPassagem.multiply(classeDaViagem.getMultiplicador()).setScale(2, RoundingMode.HALF_UP);

        // Taxas e impostos ---
        BigDecimal taxaDeImposto = new BigDecimal("0.15");
        BigDecimal impostoSobrePassagem = precoBaseDaClasse.multiply(taxaDeImposto).setScale(2, RoundingMode.HALF_UP);
        BigDecimal taxaFixaDeEmbarque = new BigDecimal("2.30");
        BigDecimal precoFinal = precoBaseDaClasse.add(impostoSobrePassagem).add(taxaFixaDeEmbarque).setScale(2, java.math.RoundingMode.HALF_UP);
        // Taxas e impostos ---


        //informações de embarque
        System.out.println("--- DETALHAMENTO DE CUSTOS ---");
        System.out.println("Passagem Base: R$ " + precoNormalDaPassagem);
        System.out.println("Impostos (15%): R$ " + impostoSobrePassagem);
        System.out.println("Taxa Fixa: R$ " + taxaFixaDeEmbarque);
        System.out.print("TOTAL A PAGAR: R$ " + precoFinal);
        System.out.println("\n");
        System.out.println("--- Bilhete emitido, obrigado pela preferência!! ---");
        System.out.println("Passaporte: " + passaporte);
        System.out.println("Classe escolhida: " + classeDaViagem);
        System.out.println("Embarque: " + "Vagão " + portaoDeEmbarqueDoCliente);
        System.out.println("Assento: " + numeroDoAssentoDoCliente);




    }
}
