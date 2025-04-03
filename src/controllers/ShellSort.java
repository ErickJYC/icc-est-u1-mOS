package controllers;

public class ShellSort {
    public void sort(int[] array, boolean asendete){
        int n = array.length;
        for (int gap = n/2;gap>=1;gap=gap/2 ) {
            //insercion 
        if (asendete) {
            int contCambios=0;
            for (int i = gap;i<n;i++){
                int temp = array[i];
                int j = i;
                // Aqui se desplaza 'tamp' a su posicion correcta 
                while (j>=gap && array[j-gap]>temp) {
                    contCambios++;
                    array[j]=array[j-gap];
                    j -= gap;
                }
                
                array[j]=temp;
            }            
            System.out.println("Cambios: "+ contCambios); 
        }else{
            int contCambios=0;
            for (int i = gap;i<n;i++){
                int temp = array[i];
                int j = i;
                
                while (j>=gap && array[j-gap]<temp) {
                    contCambios++;
                    array[j]=array[j-gap];
                    j -= gap;
                }
                
                array[j]=temp;
            }            
            System.out.println("Cambios: "+ contCambios);
        }
        }
    }
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println("\n");
    }
}
