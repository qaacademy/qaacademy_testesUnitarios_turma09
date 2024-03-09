package medium;

import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx06 {

    @Test
    public void testeCalcularFatorial(){
        Exercicio06_repeticao_medium exercicio06RepeticaoMedium =  new Exercicio06_repeticao_medium();
        Assert.assertEquals("3628800", exercicio06RepeticaoMedium.calculaFatorial(10).toString());
    }
    @Test
    public void testeCalcularFatorialValoresZero(){
        Exercicio06_repeticao_medium exercicio06RepeticaoMedium =  new Exercicio06_repeticao_medium();
        Assert.assertEquals("1", exercicio06RepeticaoMedium.calculaFatorial(0).toString());
    }
}
