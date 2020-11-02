
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Catarina Gonçalves Almeida
 *  
 */
public class TestHojaCalculo
{
    Fila fila4;
    /**
     * Constructor  
     */
    public TestHojaCalculo()    {
        fila4 = new Fila ("Fila4");
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {
        HojaCalculo Test1 = new HojaCalculo("Hoja1");
        Test1.addFila("fila1", new Fecha(4,10,2020), 25.50,132);
        Test1.addFila("fila2", new Fecha(5,10,2020), 300,350);
        Test1.addFila(new Fila("fila3"));
        Test1.addFila(fila4);
        HojaCalculo Test11 = Test1.duplicarHoja();
        System.out.println(Test1.toString());
        System.out.println(Test11.toString()); 
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
        HojaCalculo Test2 = new HojaCalculo("Hoja2");
        Test2.addFila("fila1", new Fecha(7,10,2020),260,125);
        Test2.addFila("fila2", new Fecha(8,10,2020), 125,245);
        HojaCalculo Test12 = Test2.duplicarHoja();
        System.out.println(Test2.toString());
        System.out.println(Test12.toString());  
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        HojaCalculo Test3 = new HojaCalculo("Hoja3");
        Test3.addFila("fila1", new Fecha(8,10,2020),670,234);   
        HojaCalculo Test13 = Test3.duplicarHoja();
        System.out.println(Test3.toString());
        System.out.println(Test13.toString()); 
    }
}
