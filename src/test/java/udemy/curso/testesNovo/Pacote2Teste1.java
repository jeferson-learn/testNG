package udemy.curso.testesNovo;

import org.testng.annotations.Test;

@Test(groups = "teste-ordem")
public class Pacote2Teste1 {

    @Test(groups = "integracao")
    public void pacote2Teste1() {
        System.out.println("Primeira teste da classe 1 do pacote 2 I");
    }
    @Test(groups = "unitario")
    public void pacote2Teste2() {
        System.out.println("Segunda teste da classe 1 do pacote 2 U");
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
