package proyecto;

import java.util.Scanner;

public class Proyecto1 
{
    public static void main(String...jhon)
    {
        float ph;
        float temp;
        float den;
        float pgras;
        String anm;
        
        
        Scanner epson=new Scanner (System.in);
        System.out.println("Elija animal de origen de la leche vaca, bufala o cabra\t");
        anm=epson.next();
        
        System.out.println("Evaluemos las caracteristicas fisicoquimicas de la leche\t ");
        System.out.println("Temperatura de llegada ");
        temp=epson.nextFloat();
        
        System.out.println("ph ");
        ph=epson.nextFloat();
        
        System.out.println("% de grasa");
        pgras=epson.nextFloat();
        
        System.out.println("densidad");
        den=epson.nextFloat();
        
        
        
        if ("vaca".equals(anm))
        {
            if (temp>=4 && temp<=10)
            {
                if (ph>=6.5f && ph<=6.7f)
                {
                    if (pgras>=3.2f && pgras<=3.9f)
                    {
                        if (den>=1.028f && den<=1.033f)
                        {
                            System.out.println("Estandares aceptados ");
                            System.out.println("Producto recomendado: Yogur o Mantequilla "
                                    + "(excelente balance graso y rendimiento general).");
                        }else{
                            System.out.println("densidad no valida ");
                        }
                       
                    }else{
                        System.out.println("% de grasa no valida ");
                    }
                }else{
                    System.out.println("ph no valido ");
                }
            }else{
                System.out.println("temperatura no valida ");
            }
        }else if ("bufala".equals(anm))
            {
            if (temp>=4 && temp<=10)
            {
                if (ph>=6.5f && ph<=6.8f)
                {
                    if (pgras>=6.5f && pgras<=8.5f)
                    {
                        if (den>=1.030f && den<=1.034f)
                        {
                            System.out.println("Estandares aceptados\t ");
                            System.out.println("Producto recomendado: Queso (ideal por su alto porcentaje de grasa y "
                                    + "sólidos totales).");
                        }else{
                            System.out.println("densidad no valida ");
                        }
                       
                    }else{
                        System.out.println("% de grasa no valida ");
                    }
                }else{
                    System.out.println("ph no valido ");
                }
            }else{
                System.out.println("temperatura no valida ");
            }
        }else if ("cabra".equals(anm))
            {
            if (temp>=4 && temp<=6)
            {
                if (ph>=6.4f && ph<=6.7f)
                {
                    if (pgras>=3.5f && pgras<=5.5f)
                    {
                        if (den>=1.029f && den<=1.034f)
                        {
                            System.out.println("Estandares aceptados ");
                            System.out.println("producto recomendado: Queso (excepcional "
                                   + "para quesos madurados o frescos de cabra).");
                        }else{
                            System.out.println("densidad no valida ");
                        }
                       
                    }else{
                        System.out.println("% de grasa no valida ");
                    }
                }else{
                    System.out.println("ph no valido ");
                }
            }else{
                System.out.println("temperatura no valida ");
            }
        }else{
             System.out.println("Animal no reconocido. Ingrese vaca, bufala o cabra.");
        }
           
            
            
    }
}
