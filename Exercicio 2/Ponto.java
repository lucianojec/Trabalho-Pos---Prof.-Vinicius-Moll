package com.iniciantes.java.Exercicio2;

public class Ponto 
{ 
   protected int x, y;
   public Ponto() 
   { 
     setPonto( 0, 0 ); 
   }
   public Ponto( int a, int b ) 
   { 
     setPonto( a, b ); 
   }
   public void setPonto( int a, int b ) 
   { 
     x = a; 
     y = b; 
   }

}