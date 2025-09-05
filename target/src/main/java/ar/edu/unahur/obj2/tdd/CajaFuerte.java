package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
    private Boolean estadoAbierta = Boolean.FALSE;
    private Integer codigo = 1234;

    public Object estaAbierta() {
        return estadoAbierta;
    }

    public void abrir(Integer codigo) {
        if (codigo.equals(this.codigo))
        estadoAbierta = Boolean.TRUE;
    }

    public void cerrar() {
        estadoAbierta = Boolean.FALSE;
    }
    public void cambiarCodigo(Integer codigo){
        if((boolean) estaAbierta())
            this.codigo = codigo;
    }
}
