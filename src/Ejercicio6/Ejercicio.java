/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Estudiante
 */
public class Ejercicio {
    private City ciudad;
    private Robot robot;
    private Thing comida[];
    private Wall muro;

    public Ejercicio() {
        this.ciudad = new City(10,10);
        this.robot = new Robot(ciudad,9,9,Direction.WEST);
        this.comida= new Thing[3];
        this.comida[0]= new Thing(ciudad,3,3);
        this.comida[1]= new Thing(ciudad, 5,4);
        this.comida[2]= new Thing(ciudad, 3, 2);
        this.muro = new Wall(ciudad, 5, 5, Direction.NORTH);
    }
    

    public void jugar(){
    this.advance();
    }
    private void advance(){
    this.robot.move();
    }
}
