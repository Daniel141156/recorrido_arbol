
public class NodoArbol <T> {
    private T dato;
    private NodoArbol[] hijo;

    public NodoArbol(T dato, NodoArbol[] hijo) {
        this.dato = dato;
        this.hijo = hijo;
    }
    NodoArbol(){}
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoArbol[] getHijo() {
        return hijo;
    }

    public void setHijo(NodoArbol[] hijo) {
        this.hijo = hijo;
    }
    public void preOrden(){
        System.out.print(this.dato);
        if(hijo == null) return;
        for(NodoArbol n : hijo ){
            if(n!=null){
            System.out.print(", ");       
        n.preOrden();
            }
        }
    }
  public void setHijo(int posicion, T dato){
      if(hijo==null){
          hijo= new NodoArbol[2];
      }
        hijo[posicion] = new NodoArbol(dato,null);
  }
//System.out.println(","+n.dato);
    
}
