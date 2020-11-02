
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author -   Catarina Gonçalves Almeida
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila1 = null;
        this.fila1 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        int contador = 1;
        if(fila1 == null){
            System.out.println("NO EXISTE CONTADOR");
        } else
        {
            contador++;
        }   if (fila2 == null){
            System.out.println("NO EXISTE CONTADOR");
        } else 
        {
            contador++;
        } if (fila3 == null){
            System.out.println("NO EXISTE CONTADOR");
        } else 
        { contador++;
        }
        return contador++;
    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        if (getNumeroFilas() == 3){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
        if(getNumeroFilas() == 3){
            System.out.println("FilaX no se puede añadir en HOJAX");
        }else {
            if(getNumeroFilas() == 2){
                fila3 = fila;
            } else if (getNumeroFilas() == 1){
                fila2 = fila;
            }if (getNumeroFilas() == 0){
                fila1 = fila;
            }
        }

    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
        Fila OtraFila = new Fila (id, fecha, ingresos, gastos);
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        double ingresosAbsolutos = 0;
        
        ingresosAbsolutos += fila1.getIngresos();
        ingresosAbsolutos += fila2.getIngresos();
        ingresosAbsolutos += fila3.getIngresos();
        return ingresosAbsolutos;
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        double gastosAbsolutos = 0;
        
        gastosAbsolutos  += fila1.getGastos();
        gastosAbsolutos  += fila2.getGastos();
        gastosAbsolutos  += fila3.getGastos();
        return gastosAbsolutos;
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        double beneficiosAbsolutos = 0;
        
        beneficiosAbsolutos += fila1.getBeneficio();
        beneficiosAbsolutos += fila2.getBeneficio();
        beneficiosAbsolutos += fila3.getBeneficio();
        return beneficiosAbsolutos;
    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {
        return String.format("%-8s\n %23s %16s %16s\n" +
            fila1.toString() + "\n" +
            fila2.toString() + "\n" +
            fila3.toString() + "\n-------------------\n" +
            "%40.2f€ %15.2f€ %15.2f€",
            getNombre(), "FECHA",getTotalIngresos() + "INGRESOS", getTotalGastos() + "GASTOS",
            "BENEFICIOS" + getBeneficio());

    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {
        HojaCalculo Calculo = new HojaCalculo("DUPLICADA" + this.getNombre());
        Calculo.addFila(this.fila1);
        Calculo.addFila(this.fila3);
        Calculo.addFila(this.fila3);
        return Calculo;
    }

}
