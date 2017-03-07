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
import becker.robots.Wall;

/**
 *
 * @author usuario
 */
public class recorrido {
    
    private City ciudad;
    private Robot robot;
    private Thing bloque;
    private Matriz matriz;
    private Thing comida[];
    private Wall muro[];
    
            
    public recorrido(City ciudad, Matriz matriz){
        this.ciudad=ciudad;
        this.robot= new Robot(ciudad, 10,1, Direction.NORTH);
        this.matriz=matriz;
    }

    public recorrido() {
        this.ciudad = new City();
        this.robot = new Robot(ciudad,6,7,Direction.NORTH);
        this.comida= new Thing[3];
        this.comida[0]= new Thing(ciudad,2,7);
        this.comida[1]= new Thing(ciudad, 3,5);
        this.comida[2]= new Thing(ciudad, 5, 4);
        this.muro = new Wall[50];
        this.muro[0] = new Wall(ciudad,1,3,Direction.NORTH);
        this.muro[1] = new Wall(ciudad,1,4,Direction.NORTH);
        this.muro[2] = new Wall(ciudad,1,5,Direction.NORTH);
        this.muro[3] = new Wall(ciudad,1,6,Direction.NORTH);
        this.muro[4] = new Wall(ciudad,1,7,Direction.NORTH);
        this.muro[5] = new Wall(ciudad,1,8,Direction.NORTH);
        this.muro[6] = new Wall(ciudad,1,9,Direction.NORTH);
        this.muro[7] = new Wall(ciudad,1,10,Direction.NORTH);
        this.muro[8] = new Wall(ciudad,1,2,Direction.NORTH);
        this.muro[9] = new Wall(ciudad,1,1,Direction.NORTH);
        this.muro[10] = new Wall(ciudad,1,10,Direction.EAST);
        this.muro[11] = new Wall(ciudad,2,10,Direction.EAST);
        this.muro[12] = new Wall(ciudad,3,10,Direction.EAST);
        this.muro[13] = new Wall(ciudad,4,10,Direction.EAST);
        this.muro[14] = new Wall(ciudad,5,10,Direction.EAST);
        
        
    }
    
    
    
    
    public void recorrer( ){
        int fila = 10;
        int col = 1;

        for (int i = 0; i < 5; i++) {
            robot.move();
        fila--;
        if (robot.canPickThing()==true){
           //(a, b) = // get positionrobot.getLabel();
           matriz.matriz[ fila - 5 ][ col - 1 ]=1;
        }
        else {
        matriz.matriz  [fila -5][col -1]=0;
        }
    }
    for (int i = 0; i < 3; i++) {
    robot.turnLeft();
    }
    robot.move();
    col++;
        if (robot.canPickThing()==true) {
            matriz.matriz[fila-5][col-1]=1;
        }
        else {
        matriz.matriz  [fila -5][col -1]=0;
        }
    for (int i = 0; i < 3; i++) {
    robot.turnLeft();
    }
    col++;
    for (int i = 0; i < 4; i++) {
    robot.move();    
    }
    robot.turnLeft();
    robot.move();
    robot.turnLeft();
    for (int i = 0; i < 4; i++) {
    robot.move();    
    }
    for (int i = 0; i < 3; i++) {
    robot.turnLeft();
    }
    robot.move();
        for (int i = 0; i < 3; i++) {
    robot.turnLeft();
    }
    for (int i = 0; i < 4; i++) {
    robot.move();    
    }
    robot.turnLeft();
    robot.move();
    robot.turnLeft();
    for (int i = 0; i < 4; i++) {
    robot.move();    
    }
}
    
    

}
