package Coords;
import Coords.MyCoords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Point;

import com.sun.javafx.geom.AreaOp.AddOp;
import com.sun.javafx.geom.PickRay;

import Coords.MyCoords;
import Geom.Point3D;

public class main {

	public static void main(String[] args) {
	
		MyCoords mc = new MyCoords();
		Point3D p = new Point3D(35.209039, 32.103315,650 );
		
		Point3D p1 = new Point3D(35.205225, 32.106352);
		
		Point3D v = new Point3D(-359.2492069,337.6989921,20);

		
		System.out.println(mc.add(p,v).toString());
		
//		System.out.println(mc.add(p,pp).toString());
////	
//		
//		System.out.println("1: "+p.toString());
// 
//		p = p.gpsToMeterf();
//		 System.out.println("2 : "+p.toString());
//		p=p.meterToGpsf();
//		System.out.println("3: " +p.toString());
//		
//		
//		Point3D local_vector_in_meter  =new Point3D(0,50,0);
//		p = mc.add(p, local_vector_in_meter);
//		System.out.println("4: " +p.toString());
//
//		System.out.println(Math.PI);
		
				
		
	}

}
