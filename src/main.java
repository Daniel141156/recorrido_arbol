public class main {

    public static void main(String[] args) {
            NodoArbol tree = new NodoArbol();
        tree.setDato(45);
        
        //tree.setHijo(new NodoArbol[]{new NodoArbol(23,null), new NodoArbol(11, null)});
        NodoArbol[] arrNodoArbol = {new NodoArbol(23,null), new NodoArbol(11, null)};
        tree.setHijo(arrNodoArbol);
        tree.preOrden();
        tree.getHijo()[0].setHijo(0, 50);
        tree.getHijo()[1].setHijo(0, 40);
        tree.getHijo()[0].setHijo(1, 99);
        tree.getHijo()[1].getHijo()[0].setHijo(0, 33);
        System.out.println();
        tree.preOrden();
        System.out.println();
    }
    
}
