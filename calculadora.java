package calculadora;

public class Calculadora {
    public static void main(String[] args){
        //args recebe os argumentos passando para linha de comando
       int n1 = Integer.parseInt(args[0]); //converte string para inteiro
       int n2 = Integer.parseInt(args[1]);
       
       System.out.println("soma: "+ (n1 + n2));
       System.out.println("subtracao: "+ (n1 - n2));
       System.out.println("multiplicacao: "+ (n1 * n2));
       System.out.println("adivisao: "+ (n1 / n2));

       if (n1 > n2){
            System.out.println(n1 + "N1 é maior");
        }
       else if (n1 == n2){
            System.out.println("numeros iguais");
        }   
       else{
           System.out.println(n2 + "N2 é maior");
        }

    }
}