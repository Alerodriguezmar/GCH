/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entidad.Equipo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class RegistroEquipoTest {
    
    private static ValidarRegistroEquipo RegistroEquipoTest = new ValidarRegistroEquipo();
    private String LONG_NOMBRE_INCORRECTA = "Longitud nombre incorrecta";
    private String LONG_MARCA_INCORRECTA = "Longitud marca incorrecta";
    private String IDENTIFICACION_INCORRECTO = "Identificación incorrecta";
    private String LONG_REGISTRO_SANITARIO_INCORRECTO = "Longitud Registro Sanitario incorrecta";
    private String LONG_DESCRIPCION_INCORRECTA = "Longitud descripcion incorrecta";
    private String REGISTRO_COMPLETO = "Datos ingresados correctamente";
    
    public RegistroEquipoTest() {
    }
    
       @Test

    public void RegistroEquipoExitoso() {
        Equipo c = new Equipo();
        c.setNombreEquipo("Tabocas N45  ");
        c.setMarca("3N");
        c.setRegistroSanitario("124997310122");
        c.setDescripcionEquipo("1000");
        c.setEstadoEquipo(true);
        c.setTipoUso("Equipo Tratamiento");

        assertEquals(RegistroEquipoTest.VerificarRegistroEquipo(c), REGISTRO_COMPLETO);

    }

    @Test

    public void LongitudNombre() {

        Equipo c = new Equipo();
        c.setNombreEquipo("J");
        c.setMarca("Bayer");
        c.setRegistroSanitario("98123102584986");
        c.setDescripcionEquipo("1000");
        c.setEstadoEquipo(true);
        c.setTipoUso("Equipo Tratamiento");

        assertEquals(RegistroEquipoTest.VerificarRegistroEquipo(c), LONG_NOMBRE_INCORRECTA);

    }

    @Test

    public void LongitudRegistroSanitario() {

        Equipo c = new Equipo();
        c.setNombreEquipo("Guantes");
        c.setMarca("Latex");
        c.setRegistroSanitario("9812");
        c.setDescripcionEquipo("100000000");
        c.setEstadoEquipo(true);
        c.setTipoUso("Quirirguca");

        assertEquals(RegistroEquipoTest.VerificarRegistroEquipo(c), LONG_REGISTRO_SANITARIO_INCORRECTO);

    }

    @Test

    public void LogitudDescipcionEquipo() {

        Equipo c = new Equipo();
        c.setNombreEquipo("Guantes");
        c.setMarca("Latex");
        c.setRegistroSanitario("981212236215");
        c.setDescripcionEquipo("");
        c.setEstadoEquipo(true);
        c.setTipoUso("Quirirguca");

        assertEquals(RegistroEquipoTest.VerificarRegistroEquipo(c), LONG_DESCRIPCION_INCORRECTA);
    }

    @Test

    public void LongitudNombreMarca() {

        Equipo c = new Equipo();
        c.setNombreEquipo("Guantes");
        c.setMarca("L");
        c.setRegistroSanitario("981212236215");
        c.setDescripcionEquipo("2658");
        c.setEstadoEquipo(true);
        c.setTipoUso("Quirirguca");

        assertEquals(RegistroEquipoTest.VerificarRegistroEquipo(c), LONG_MARCA_INCORRECTA);

    }

    
}
