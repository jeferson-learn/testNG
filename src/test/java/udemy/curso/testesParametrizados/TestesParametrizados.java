package udemy.curso.testesParametrizados;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestesParametrizados {

    @Ignore
    @Test(dataProvider = "dadosTeste")
    public void nomes(String nome, int idade, Double altura) {
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Altura: " +altura);
    }

    @Parameters({"nome", "sobrenome"})
    @Test
    public void nomes(String nome, String sobrenome) {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
    }

    @Parameters("cor")
    @Test
    public void cores(String cor) {
        System.out.println(cor);
    }

    @DataProvider(name = "dadosTeste")
    public Object[][] dados() {

        return new Object[][]{
                {"Erick", new Integer(34), new Double(1.80)},
                {"Maria", new Integer(50), new Double(1.75)}
        };
    }
}
