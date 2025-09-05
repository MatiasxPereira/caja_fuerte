package ar.edu.unahur.obj2.tdd;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    @Test
    void dadaUnaCajaFuerteComprueboSiEstaCerrada(){
        CajaFuerte cajaFuerte = new CajaFuerte();
        assertFalse(cajaFuerte.estaAbierta());
    }    
    @Test
    void dadaUnaCajaAbroConCodigoCorrecto(){
        CajaFuerte cajaFuerte = new CajaFuerte();
        cajaFuerte.abrir(1234);
        assertTrue(cajaFuerte.estaAbierta());
    }    
    @Test
    void dadaUnaCajaAbroConCodigoIncorrecto(){
        CajaFuerte cajaFuerte = new CajaFuerte();
        cajaFuerte.abrir(3241);
        assertTrue(!cajaFuerte.estaAbierta());
    }

    @Test
    void dadaUnaCajaFuerteLaCierro(){
        CajaFuerte cajaFuerte = new CajaFuerte();
        cajaFuerte.cerrar();
        assertTrue(cajaFuerte.estaAbierta());
    }
    @Test
    void dadaUnaCajaFuerteCambioElCodigoSiEstaAbierta(){
        CajaFuerte cajaFuerte = new CajaFuerte();
        cajaFuerte.abrir(1234);
        cajaFuerte.cambiarCodigo(4321);
        cajaFuerte.cerrar();
        cajaFuerte.abrir(4321);
        assertTrue(cajaFuerte.estaAbierta());
    }
    @Test
    void dadaUnaCajaFuerteNoPuedoCambiarElCodigoSiEstaCerrada(){
        CajaFuerte cajaFuerte = new CajaFuerte();
        cajaFuerte.cerrar();
        cajaFuerte.cambiarCodigo(4321);
        cajaFuerte.abrir(4321);
        assertTrue(!cajaFuerte.estaAbierta());
        cajaFuerte.abrir(1234);
        assertTrue(cajaFuerte.estaAbierta());    
    }
}