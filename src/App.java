import controllers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int [] a = {-10,0,4,7,2,1,9,6,5};
        // Instancia 
        ShellSort sS = new ShellSort();
        System.out.println("Arreglo Original");
        sS.printArray(a);
        System.out.println("Orden Asendente");
        sS.sort(a,true);
        sS.printArray(a);
        System.out.println("Orden Desendente");
        sS.sort(a, false);
        sS.printArray(a);


    }
}
