package SistemaBilhetagemDeTrem;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        SistemaBilhetagemDeTransporte Latam = new SistemaBilhetagemDeTransporte();

        Latam.emitir("BR987654", new BigDecimal("1500.50"), TipoDeClasseParaViagem.PRIMEIRA_CLASSE);

    }
}


