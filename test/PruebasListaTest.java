import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class PruebasListaTest {
    @Test
    public void testInsertarLista() {
        // Test 1
        Lista<Integer> listaOriginal1 = new Lista<>();
        listaOriginal1.agregar(1);
        listaOriginal1.agregar(2);

        Lista<Integer> porAnexar1 = new Lista<>();
        porAnexar1.agregar(3);
        porAnexar1.agregar(4);

        listaOriginal1.insertarLista(porAnexar1);

        assertEquals(4, listaOriginal1.tamaño());
        assertEquals(Integer.valueOf(1), listaOriginal1.getCabeza().getValor());
        assertEquals(Integer.valueOf(2), listaOriginal1.getCabeza().getSiguiente().getValor());
        assertEquals(Integer.valueOf(3), listaOriginal1.getCabeza().getSiguiente().getSiguiente().getValor());
        assertEquals(Integer.valueOf(4), listaOriginal1.getCabeza().getSiguiente().getSiguiente().getSiguiente().getValor());

        // Test 2
        Lista<Integer> listaOriginal2 = new Lista<>();
        listaOriginal2.agregar(5);
        listaOriginal2.agregar(6);

        Lista<Integer> porAnexar2 = new Lista<>();
        porAnexar2.agregar(7);
        porAnexar2.agregar(8);

        listaOriginal2.insertarLista(porAnexar2);

        assertEquals(4, listaOriginal2.tamaño());
        assertEquals(Integer.valueOf(5), listaOriginal2.getCabeza().getValor());
        assertEquals(Integer.valueOf(6), listaOriginal2.getCabeza().getSiguiente().getValor());
        assertEquals(Integer.valueOf(7), listaOriginal2.getCabeza().getSiguiente().getSiguiente().getValor());
        assertEquals(Integer.valueOf(8), listaOriginal2.getCabeza().getSiguiente().getSiguiente().getSiguiente().getValor());

        // Test 3
        Lista<Integer> listaOriginal3 = new Lista<>();
        listaOriginal3.agregar(9);
        listaOriginal3.agregar(10);

        Lista<Integer> porAnexar3 = new Lista<>();
        porAnexar3.agregar(11);
        porAnexar3.agregar(12);

        listaOriginal3.insertarLista(porAnexar3);

        assertEquals(4, listaOriginal3.tamaño());
        assertEquals(Integer.valueOf(9), listaOriginal3.getCabeza().getValor());
        assertEquals(Integer.valueOf(10), listaOriginal3.getCabeza().getSiguiente().getValor());
        assertEquals(Integer.valueOf(11), listaOriginal3.getCabeza().getSiguiente().getSiguiente().getValor());
        assertEquals(Integer.valueOf(12), listaOriginal3.getCabeza().getSiguiente().getSiguiente().getSiguiente().getValor());
    }

    @Test
    public void testSubLista() {
        //Test 1
        Lista<Integer> listaOriginal1 = new Lista<>();
        listaOriginal1.agregar(1);
        listaOriginal1.agregar(2);
        listaOriginal1.agregar(3);
        listaOriginal1.agregar(4);

        Lista<Integer> subLista1 = listaOriginal1.subLista(1, 2);

        assertEquals(2, subLista1.tamaño());
        assertEquals(Integer.valueOf(2), subLista1.getCabeza().getValor());
        assertEquals(Integer.valueOf(3), subLista1.getCabeza().getSiguiente().getValor());

        //Test 2
        Lista<Integer> listaOriginal2 = new Lista<>();
        listaOriginal2.agregar(5);
        listaOriginal2.agregar(6);
        listaOriginal2.agregar(7);
        listaOriginal2.agregar(8);

        Lista<Integer> subLista2 = listaOriginal2.subLista(2, 3);

        assertEquals(2, subLista2.tamaño());
        assertEquals(Integer.valueOf(7), subLista2.getCabeza().getValor());
        assertEquals(Integer.valueOf(8), subLista2.getCabeza().getSiguiente().getValor());

        //Test 3
        Lista<Integer> listaOriginal3 = new Lista<>();
        listaOriginal3.agregar(9);
        listaOriginal3.agregar(10);
        listaOriginal3.agregar(11);
        listaOriginal3.agregar(12);

        Lista<Integer> subLista3 = listaOriginal3.subLista(0, 4);

        assertEquals(4, subLista3.tamaño());
        assertEquals(Integer.valueOf(9), subLista3.getCabeza().getValor());
        assertEquals(Integer.valueOf(10), subLista3.getCabeza().getSiguiente().getValor());
        assertEquals(Integer.valueOf(11), subLista3.getCabeza().getSiguiente().getSiguiente().getValor());
        assertEquals(Integer.valueOf(12), subLista3.getCabeza().getSiguiente().getSiguiente().getSiguiente().getValor());
    }

    @Test
    public void testInvertirLista() {
        //Test 1
        Lista<Integer> listaOriginal1 = new Lista<>();
        listaOriginal1.agregar(1);
        listaOriginal1.agregar(2);
        listaOriginal1.agregar(3);
        listaOriginal1.agregar(4);

        listaOriginal1.invertir();

        assertEquals(4, listaOriginal1.tamaño());
        assertEquals(Integer.valueOf(4), listaOriginal1.getCabeza().getValor());
        assertEquals(Integer.valueOf(3), listaOriginal1.getCabeza().getSiguiente().getValor());
        assertEquals(Integer.valueOf(2), listaOriginal1.getCabeza().getSiguiente().getSiguiente().getValor());
        assertEquals(Integer.valueOf(1), listaOriginal1.getCabeza().getSiguiente().getSiguiente().getSiguiente().getValor());

        //Test 2
        Lista<Integer> listaOriginal2 = new Lista<>();
        listaOriginal2.agregar(5);
        listaOriginal2.agregar(6);
        listaOriginal2.agregar(7);

        listaOriginal2.invertir();

        assertEquals(3, listaOriginal2.tamaño());
        assertEquals(Integer.valueOf(7), listaOriginal2.getCabeza().getValor());
        assertEquals(Integer.valueOf(6), listaOriginal2.getCabeza().getSiguiente().getValor());
        assertEquals(Integer.valueOf(5), listaOriginal2.getCabeza().getSiguiente().getSiguiente().getValor());

        //Test 3
        Lista<Integer> listaOriginal3 = new Lista<>();
        listaOriginal3.agregar(8);
        listaOriginal3.agregar(9);
        listaOriginal3.agregar(10);
        listaOriginal3.agregar(11);

        listaOriginal3.invertir();

        assertEquals(4, listaOriginal3.tamaño());
        assertEquals(Integer.valueOf(11), listaOriginal3.getCabeza().getValor());
        assertEquals(Integer.valueOf(10), listaOriginal3.getCabeza().getSiguiente().getValor());
        assertEquals(Integer.valueOf(9), listaOriginal3.getCabeza().getSiguiente().getSiguiente().getValor());
        assertEquals(Integer.valueOf(8), listaOriginal3.getCabeza().getSiguiente().getSiguiente().getSiguiente().getValor());
    }

    @Test
    public void testIterador() {
        //Test 1
        Lista<Integer> lista1 = new Lista<>();
        lista1.agregar(1);
        lista1.agregar(2);
        lista1.agregar(3);

        Iterator<Integer> iterator1 = lista1.iterator();

        assertTrue(iterator1.hasNext());
        assertEquals(Integer.valueOf(1), iterator1.next());
        assertTrue(iterator1.hasNext());
        assertEquals(Integer.valueOf(2), iterator1.next());
        assertTrue(iterator1.hasNext());
        assertEquals(Integer.valueOf(3), iterator1.next());
        assertFalse(iterator1.hasNext());

        //Test 2
        Lista<String> lista2 = new Lista<>();
        lista2.agregar("a");
        lista2.agregar("b");
        lista2.agregar("c");

        Iterator<String> iterator2 = lista2.iterator();

        assertTrue(iterator2.hasNext());
        assertEquals("a", iterator2.next());
        assertTrue(iterator2.hasNext());
        assertEquals("b", iterator2.next());
        assertTrue(iterator2.hasNext());
        assertEquals("c", iterator2.next());
        assertFalse(iterator2.hasNext());

        //Test 3
        Lista<Double> lista3 = new Lista<>();
        lista3.agregar(1.5);
        lista3.agregar(2.5);
        lista3.agregar(3.5);

        Iterator<Double> iterator3 = lista3.iterator();

        assertTrue(iterator3.hasNext());
        assertEquals(1.5, iterator3.next());
        assertTrue(iterator3.hasNext());
        assertEquals(2.5, iterator3.next());
        assertTrue(iterator3.hasNext());
        assertEquals(3.5, iterator3.next());
        assertFalse(iterator3.hasNext());
    }
}