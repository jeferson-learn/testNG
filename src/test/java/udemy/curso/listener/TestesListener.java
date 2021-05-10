package udemy.curso.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestesListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("TESTES INICIADOS PELO LISTENER");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("O TESTE PASSOU!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("O TESTE FALHOU");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("O TESTE FOI SKIPPED");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("TESTES FINALIZADOS PELO LISTENER");
    }
}
