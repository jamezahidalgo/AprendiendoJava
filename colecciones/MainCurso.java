/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalyoutube.colecciones;

/**
 *
 * @author Jazna
 */
public class MainCurso {

    public static void main(String[] args) {
        Curso c = new Curso(620433, "Programación orientada a objetos");
        try {
            Estudiante ex = new Estudiante("Mario Bros", (float) 5.6);
            Estudiante ey = new Estudiante("Mario Bros", (float) 2.6);

            /* Agregamos al curso */
            if (c.agregarEstudiante(ex)) {
                System.out.println(ex.getNombre() + " ha sido agregado al curso");
            } else {
                System.out.println(ex.getNombre() + " NO ha sido agregado al curso");
            }

            System.out.println(ey.getNombre() + (c.agregarEstudiante(ey) ? " " : " NO ") + "ha sido agregado al curso");

        } catch (ErrorNegocio mi_error) {
            System.out.println(mi_error.getDescripcion());
        }
        /* Imprimir los integrantes del curso */
        for (Estudiante alguien : c.getEstudiantes()) {
            System.out.println(alguien.getNombre() + " " + alguien.getNota());
        }
        /* Probar el método de bonificación */
        try {
            c.bonificarNota(0.1f);
            System.out.println("Después de la bonificación ");
            for (Estudiante alguien : c.getEstudiantes()) {
                System.out.println(alguien.getNombre() + " " + alguien.getNota());
            }
        } catch (ErrorNegocio mi_error) {
            System.out.println(mi_error.getDescripcion());
        }

        /* Probar la eliminación */
        System.out.println("Se eliminaron " + c.eliminarEstudiantes(4));
        System.out.println("Después de eliminar");
        for (Estudiante alguien : c.getEstudiantes()) {
            System.out.println(alguien.getNombre() + " " + alguien.getNota());
        }
    }
}
