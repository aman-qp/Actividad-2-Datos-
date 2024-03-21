import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
    public class Nodo {
        public T valor;
        public Nodo siguiente;

        public Nodo(T valor) {
            this.valor = valor;
            this.siguiente = null;
        }

        public T getValor() {
            return valor;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }
    }

    private Nodo cabeza;
    private int tamaño;

    public Nodo getCabeza() {
        return cabeza;
    }

    public Lista() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public void agregar(T elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
        tamaño++;
    }

    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        Nodo siguiente = null;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        cabeza = anterior;
    }

    public void insertarLista(Lista<T> otraLista) {
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = otraLista.cabeza;
        tamaño += otraLista.tamaño;
    }

    public Lista<T> subLista(int inicio, int tamañoSublista) {
        Lista<T> subLista = new Lista<>();
        Nodo actual = cabeza;
        int indice = 0;
        while (actual != null && indice < inicio + tamañoSublista) {
            if (indice >= inicio) {
                subLista.agregar(actual.valor);
            }
            actual = actual.siguiente;
            indice++;
        }
        return subLista;
    }

    public int tamaño() {
        return tamaño;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator();
    }

    private class ListaIterator implements Iterator<T> {
        private Nodo current = cabeza;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T valor = current.valor;
            current = current.siguiente;
            return valor;
        }
    }
}
