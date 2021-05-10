package udemy.curso.testesRetorno;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(groups = {"testes-retorno","testes-unitarios"})
public class TesteRetorno {

    @Parameters("saudacao")
    @Test(groups = {"retorno","unitario"})
    public String saudacao(String saudacao) {
        System.out.println(saudacao);
        return saudacao;
    }

    @Test(groups = {"booleano","integracao"})
    public boolean verdadeiroFalso() {
        System.out.println("verdadeiro");
        return true;
    }

    @Test(groups = {"void","unitario"})
    public void teste3ClasseRetorno() {
        System.out.println("Teste void classe de retorno");
    }

    @Test(groups = {"void","unitario"})
    public void teste4ClasseRetorno() {
        System.out.println("Teste void 2 classe de retorno");
        System.out.println(verdadeiroFalso());
    }

    @Test
    public void teste5ClasseRetorno() {
        System.out.println("Teste void 3 classe de retorno");
    }
}
