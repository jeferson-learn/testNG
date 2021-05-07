package udemy.curso.testes;

import org.testng.annotations.*;

@Test(groups = "teste-anotacao")
public class TestAnotacoes {

    @BeforeTest
    public void antesTeste() {
        System.out.print("EXECUTA UM VEZ ANTES DE TODOS TESTES");
    }

    @BeforeClass
    public void antesClasse() {
        System.out.print("Executado antes de todos metodos da classe");
    }

    @BeforeMethod
    public void antesMetodo() {
        System.out.print("Executado antes de cada metodo");
    }

    @Test(enabled = false)
    public void testMetodo1() {
        System.out.println("Esse é teste metodo 1");
    }

    @Test(groups = "par")
    public void testMetodo2() {
        System.out.print("Esse é teste metodo 2");
    }

    @Ignore
    @Test
    public void testMetodo3() {
        System.out.print("Esse é teste metodo 3");
    }

    @Test(groups = "par")
    public void testMetodo4() {
        System.out.print("Esse é teste metodo 4");
    }

    @Test(groups = "impar")
    public void testMetodo5() {
        System.out.print("Esse é teste metodo 5");
    }

    @Test(groups = "lateral")
    public void testMetodo6() {
        System.out.print("Esse é teste metodo 6 L");
    }

    @Test(groups = "impar")
    public void testMetodo7() {
        System.out.print("Esse é teste metodo 7");
    }

    @AfterMethod
    public void depoisMetodo() {
        System.out.print("Executado depois de cada metodo");
    }

    @AfterClass
    public void depoisClasse() {
        System.out.print("Executado depois da classe");
    }

    @AfterTest
    public void depoisTodosTestes() {
        System.out.print("EXECUTA UMA VEZ APOS TODOS TESTES");
    }

}
