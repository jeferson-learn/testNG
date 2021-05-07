package udemy.curso.testes;

import org.testng.annotations.*;

public class Test1 {

    @BeforeClass
    public void antesClasse() {
        System.out.println("Executado antes de todos metodos da classe");
    }

    @BeforeMethod
    public void antesMetodo() {
        System.out.println("Executado antes de cada metodo");
    }

    @Test
    public void testMetodo1() {
        System.out.println("Esse é teste metodo 1");
    }

    @Test
    public void testMetodo2() {
        System.out.println("Esse é teste metodo 2");
    }

    @Test
    public void testMetodo3() {
        System.out.println("Esse é teste metodo 3");
    }

    @Test
    public void testMetodo4() {
        System.out.println("Esse é teste metodo 4");
    }

    @AfterMethod
    public void depoisMetodo() {
        System.out.println("Executado depois de cada metodo");
    }

    @AfterClass
    public void depoisClasse() {
        System.out.println("Executado depois da classe");
    }

}
