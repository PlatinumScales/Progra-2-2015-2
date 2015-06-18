/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;


public class Triangulo implements ITriangulo {
    private double altura = 0.0;
    
    private double semiperimeter = 0;
    
    private double SumarLados ()
    {
        double resultado = 0;
        for (int i = 0; i <= cantidadLados(); i++)
            resultado +=getLado (i);
        return (resultado);
    }
    
       @Override
    public double Perimetro ()
    {
        double resultado = 0;
        resultado = SumarLados ();
        return (resultado);
    }    
    
    private double getSemiperimeter ()
    {
        return this.semiperimeter;
    }
    
    private void setSemiperimeter ()
    {
        this.semiperimeter = Perimetro()/ 2.0;
    }
    
        public void setAltura (double altura)
        {
            if (altura > 0.0)
                this.altura = altura; 
        }
        
    public double getAltura ()
    {
        return (altura);
    }
    
    public double [] getLados ()
    {
        return MedidasLados;
    }
    
public double getLado (int indice)    
{
    return (MedidasLados [indice]);
}
    public void getLados (double lado1, double lado2, double lado3)
    {
        lado1 = MedidasLados [0];
        lado2 = MedidasLados [1];
        lado3 = MedidasLados [2];
    }

    
    private int cantidadLadosTriangulo = 3;
    private double[] MedidasLados;
    
    private void AsignarValoresAlTriangulo (double catetoMenor, double catetoMayor, 
                                double hipotenusa)
    {
        if (catetoMenor + catetoMayor < hipotenusa)
        {
            MedidasLados [0] = catetoMenor;
            MedidasLados [1] = catetoMayor;
            MedidasLados [2] = hipotenusa;
            setSemiperimeter();
        }      
        // ToDo:  caso de error cuando el triángulo no es válido
    }
    
    public Triangulo (double lado)
    {
        AsignarValoresAlTriangulo (lado, lado, lado);
    }
    
    public Triangulo (double catetoMenor, double catetoMayor, double hipotenusa)
    {
        AsignarValoresAlTriangulo (catetoMenor, catetoMayor, hipotenusa);
    }
     public Triangulo (double ladosIguales, double ladoDiferente)
    {
        AsignarValoresAlTriangulo (ladosIguales, ladosIguales, ladoDiferente);
    }
    
   
    @Override
    public double[] ObtenerMedidas ()
    {
        return MedidasLados;
    }

    @Override
    public double altura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantidadLados() {
        return (cantidadLadosTriangulo);
    }

    @Override
    public double Area() {
        double resultado = 0;
        resultado = Math.sqrt(getSemiperimeter() * (getSemiperimeter() - getLado(0)) *
                (getSemiperimeter() - getLado(1)) * (getSemiperimeter() - getLado(2)));
        return (resultado);
    }

    @Override
    public double Volumen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
