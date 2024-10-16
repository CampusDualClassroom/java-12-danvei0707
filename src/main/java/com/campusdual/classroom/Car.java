package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;

    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {}

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if (speedometer < 120) this.speedometer += 10;
        if (this.speedometer < 120) System.out.print("..." + this.speedometer + "km/h ");
        if (this.speedometer == 120) System.out.printf("\nVelocidad máxima");
    }

    public void brake() {
        if (speedometer > 0) this.speedometer -= 10;
        if (this.speedometer > 0) System.out.print(this.speedometer + "km/h" + "... ");
        if (this.speedometer == 0) System.out.printf("\nVehículo detenido");
    }

    public void turnAngleOfWheels(int angle) {
        if (angle < 0){
            for (int i = 0; i < Math.abs(angle); i++) {
                if (this.wheelsAngle > -45) this.wheelsAngle--;
            }
        }
        else if (angle > 0){
            for (int i = 0; i < angle; i++) {
                if (this.wheelsAngle < 45) this.wheelsAngle++;
            }
        }
        System.out.println("Volante a " + this.wheelsAngle + " grados");
    }

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero(){
        return this.tachometer == 0;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        if (speedometer == 0){
            this.reverse = reverse;
            if (reverse == true){
                this.gear = "R";
            }
            else {
                this.gear = "N";
            }
        }
    }

    public void showDetails() {}

    public static void main(String[] args) {}
}

