package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {

        // Creamos el objeto del coche
        Car mazda5 = new Car("Mazda", "5", "Diesel");

// Un método booleano que verifique si el valor del tacómetro es cero
        System.out.println("Detenido: " + isStopped(mazda5));

// Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        mazda5.start();

// Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        mazda5.start();

// Apagar el coche comprobando que el valor del tacómetro es correcto
        mazda5.stop();

// Acelerar el coche
        System.out.println("ACELERANDO: ");
        for (int i = 0; i < 5; i++) {
            mazda5.accelerate();
        }
        System.out.println();

// Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        mazda5.stop();

// Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        System.out.println("ACELERANDO AL MÁXIMO:");
        for (int i = 0; i < 26; i++) {
            mazda5.accelerate();
        }
        System.out.println();

// Frenar la velocidad
        System.out.println("FRENANDO:");
        for (int i = 0; i < 8; i++) {
            mazda5.brake();
        }
        System.out.println();

// Frenar hasta un valor negativo (y comprobar que no se puede)
        System.out.println("FRENANDO AL MÍNIMO: ");
        for (int i = 0; i < 5; i++) {
            mazda5.brake();
        }

// Girar el volante 20 grados
        System.out.println("GIRANDO 20 GRADOS: ");
        mazda5.turnAngleOfWheels(20);

// Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        System.out.println("PROBANDO LÍMITES DEL VOLANTE:");
        mazda5.turnAngleOfWheels(60);
        mazda5.turnAngleOfWheels(-100);

// Detener el coche y poner marcha atrás
        System.out.println("PONIENDO EL COCHE MARCHA ATRÁS");
        mazda5.setReverse(true);
        System.out.println("Marcha atrás: " + mazda5.isReverse());

// Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        System.out.println("RESTAURANDO MARCHA ADELANTE: ");
        mazda5.setReverse(false);
        System.out.println("Marcha atrás: " + mazda5.isReverse());
        System.out.println("ACELERANDO, Y PROBANDO A METER MARCHA ATRÁS:");
        for (int i = 0; i < 35; i++) {
            mazda5.accelerate();
        }
        System.out.println();
        System.out.println("PRUEBO A METER MARCHA ATRÁS EN MOVIMIENTO: ");
        mazda5.setReverse(true);
        System.out.println("Marcha atrás: " + mazda5.isReverse());

    }

        static boolean isStopped(Car car){
        return car.speedometer == 0;
    }

}