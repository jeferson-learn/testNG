package udemy.curso.testes;

import com.google.inject.internal.ErrorsException;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = "testes-unitarios")
public class TestClasse {

    @BeforeClass
    public void antesClasse() {
        System.out.println("Executa antes dos testes da classe");
    }

    @Test(groups = "unitario")
    public void teste1Classe2() {
        System.out.println("Primeira teste da classe 2 U");
        throw new SkipException("O teste foi Skipped");
    }

    @Test(groups = "unitario")
    public void teste2Classe2() {
        System.out.println("Segunda teste da classe 2 U");
    }

    @Test(groups = "integracao")
    public void teste3Classe2() throws ErrorsException {
        System.out.println("Terceira teste da classe 2 I");
        throw new ErrorsException(null);
    }
    @Test(groups = "integracao")
    public void teste4Classe2() {
        System.out.println("Quarta teste da classe 2 I");
    }

    @Test(groups = "impar")
    public void teste5Classe2() {
        System.out.println("Quinta teste da classe 2");
    }

    @Test(groups = "par")
    public void teste6Classe2() {
        System.out.println("Sexta teste da classe 2");
    }

}
