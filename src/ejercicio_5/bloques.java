/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author usuario
 */
public class bloques {
private City ciudad;
private Robot robot;
private Thing bloque[];

public bloques(){
this.ciudad= new City();
this.robot= new Robot(ciudad,10,1,Direction.NORTH);
this.bloque= new Thing [8];
this.bloque[0]=new Thing(ciudad,8,1);
this.bloque[1]=new Thing(ciudad,6,1);
this.bloque[2]=new Thing(ciudad,5,2);
this.bloque[3]=new Thing(ciudad,5,4);
this.bloque[4]=new Thing(ciudad,6,5);
this.bloque[5]=new Thing(ciudad,8,5);
this.bloque[6]=new Thing(ciudad,9,4);
this.bloque[7]=new Thing(ciudad,9,2);



}


}
