
package pacotejava;

import java.util.Date;


public class Funcionario {

    
      public String Nome;
      public String Departamento;
      public double Salario;
      public Date DataEntrada;
      public String RG;
       
      public Funcionario (String nome, double Salario) {
          this.Nome = nome;
          this.Salario = Salario;
      }
      
      public void aumentosalario (double aumento) {
          this.Salario = this.Salario + aumento;
      }
      

      
      
    

