import easy.Exercicio07_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx07 {
    Exercicio07_easy exercicio07Easy;

    @Before
    public void before() {
        exercicio07Easy = new Exercicio07_easy();
    }

    @Test
    public void testeCalculaInssFaixaUm() {
        Assert.assertEquals("99.0", exercicio07Easy.calcularInns(1320.00).toString());
    }

    @Test
    public void testeCalculaInssFaixaDois() {
        Assert.assertEquals("118.8009", exercicio07Easy.calcularInns(1320.01).toString());
    }

    @Test
    public void testeCalculaInssFaixaTres() {
        Assert.assertEquals("308.556", exercicio07Easy.calcularInns(2571.30).toString());
    }

    @Test
    public void testeCalculaInssFaixaQuatro() {

        Assert.assertEquals("539.9730000000001", exercicio07Easy.calcularInns( 3856.95).toString());
    }

    @Test
    public void testeCalculaInssFaixaCinco() {
        Assert.assertEquals("1051.04", exercicio07Easy.calcularInns(7507.50).toString());
    }
}
