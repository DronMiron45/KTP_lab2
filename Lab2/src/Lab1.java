import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab1 
{
    public static void main(String[] args) throws IOException 
    {
        Point3d p1 = new Point3d();
        Point3d p2 = new Point3d(3.0, 4.0, 1.0);

        System.out.printf("Расстояние между двумя точками: %.2f", p1.distanceTo(p2));
        System.out.println("\n\nВведите по отдельности 3 координаты точки x,y,z");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());;
        double c = Double.parseDouble(reader.readLine());;
        Point3d p3 = new Point3d(a,b,c);
        

        if (p1 == p2 || p2 == p3 || p3 == p1)
        {
        	System.out.println("Одна из точек треугольника равны");            
        } 
        	else
        	{
        	System.out.printf("Площадь треугольника равна:%.2f", computeArea(p1,p2,p3));
        	}
    }
    
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3)
    {    	
    	double a = p1.distanceTo(p2);
    	double b = p2.distanceTo(p3);
    	double c = p3.distanceTo(p1);
    	double p = ( a + b + c ) / 2;
    	return ( Math.sqrt ( p * ( p - a ) * ( p - b ) * ( p - c ) ) );
    }
}
