// Amanda Quesada Porras -2023086337
// Mauricio Rojas Machado -2023282452
public class Main {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();

        // Agregar elementos a la lista
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        // Imprimir la lista
        System.out.println("Contenido de la lista:");
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }

        // Insertar otra lista al final
        Lista<Integer> otraLista = new Lista<>();
        otraLista.agregar(4);
        otraLista.agregar(5);
        lista.insertarLista(otraLista);

        // Imprimir la lista después de insertar otra lista
        System.out.println("\nContenido de la lista después de insertar otra lista:");
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }

        // Obtener una sublista
        Lista<Integer> subLista = lista.subLista(2, 3);

        // Imprimir la sublista
        System.out.println("\nContenido de la sublista:");
        for (Integer elemento : subLista) {
            System.out.println(elemento);
        }

        // Invertir la lista
        lista.invertir();

        // Imprimir la lista invertida
        System.out.println("\nContenido de la lista después de invertirla:");
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }
    }
}
