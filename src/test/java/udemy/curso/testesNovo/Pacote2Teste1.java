package udemy.curso.testesNovo;

import org.testng.annotations.*;

@Test(groups = "testes-integracao")
public class Pacote2Teste1 {

    @Parameters("nome")
    @BeforeClass
    public void nomeClass(String nome) {
        System.out.println(nome);
    }

    @Parameters("nome")
    @BeforeMethod
    public void nomeMethod(String nome) {
        System.out.println(nome);
    }

    @Parameters("nome")
    @BeforeTest
    public void nome(String nome) {
        System.out.println(nome);
    }

    @Parameters("nome")
    @Test
    public void pacote2Teste1(@Optional String nome) {
        System.out.println("Primeira teste da classe 1 do pacote 2 I");
        System.out.println(nome);
    }
    @Parameters("sobrenome")
    @Test
    public void pacote2Teste2(@Optional String sobrenome) {
        System.out.println("Segunda teste da classe 1 do pacote 2 U");
        System.out.println(sobrenome);
    }
    @Test(groups = "integracao")
    public void pacote2Teste3() {
        System.out.println("Terceira teste da classe 1 do pacote 2 I");
    }
    @Test(groups = "unitario")
    public void pacote2Teste4() {
        System.out.println("Quarta teste da classe 1 do pacote 2 U");
    }
}
