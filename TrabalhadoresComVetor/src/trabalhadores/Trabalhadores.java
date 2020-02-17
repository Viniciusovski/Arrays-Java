package trabalhadores;

import javax.swing.*;

public class Trabalhadores {

    public static void main(String[] args) {        
       new Empresa();
    }
    
}

class Empresa {
    
    private Trabalhador trab[];
    private int N;
    
    Empresa () {  //este método construtor da classe Empresa será executado no main
        /*
        //leitura dos dados de N Trabalhadores:
        N = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite qtde. de trabalhadores da empresa:", "Quantidade", JOptionPane.INFORMATION_MESSAGE));
        trab = new Trabalhador[N];        
        for (int i=0; i<N; i++) {
            trab[i] = lerNovoTrabalhador(i+1);
        }
        */
        
        // Para um teste rápido poderíamos considerar dados de 4 trabalhadores fixos,
        // mas na versão final real efetuaríamos a leitura dos dados de N trabalhadores,
        // utilizando, por exemplo, a lógica mostrada acima.
        N = 4;
        trab = new Trabalhador[4];
        trab[0] = new Trabalhador("123.456", "João", 25, 'M', "Rua X, 234", 2000f);
        trab[1] = new Trabalhador("99.456", "Luiza", 22, 'F', "Rua Y, 111", 4000f);
        trab[2] = new Trabalhador("885.456", "Ana", 29, 'F', "Rua Z, 345", 5000f);
        trab[3] = new Trabalhador("222.456", "Pedro", 51, 'M', "Rua T, 231", 1000f);
        
        //média dos salários dos N trabalhadores:
        float soma = 0.0f; 
        for (int i=0; i<N; i++) {
            soma += trab[i].getSalario();
        }        
        System.out.println("A média dos salários dos " + N + " trabalhadores é R$ " + soma/N);
        
        //média dos salários das mulheres:
        int qt = 0; 
        soma = 0.0f; 
        for (int i=0; i<N; i++) {
            if(trab[i].getSexo()=='F') {
                soma += trab[i].getSalario();
                qt++;
            }
        }        
        if(qt!=0)System.out.println("A média dos salários das mulheres é R$ " + (soma/qt) );
        
        //determinar e visualizar os dados do trabalhador que tenha o maior salário na empresa:
        Trabalhador trM = null;
        float maior = 0.0f;
        for (int i=0; i<N; i++) {
            if(trab[i].getSalario() > maior) {
                maior = trab[i].getSalario();
                trM = trab[i];
            }
        }         
        System.out.println("O trabalhador com maior salário na empresa é: \n" + trM.toString() );
        
        /* 
           Contar e visualizar a quantidade de homens da empresa e também a 
           quantidade de mulheres. Também, mostre uma mensagem comentando qual 
           é o sexo predominante na empresa (maior quantidade).
        */
        int qh = 0, qm = 0;  //qh - qtde de homens; qm - qtde de mulheres
        for (int i=0; i<N; i++) {
            if(trab[i].getSexo()=='M') qh++ ; //contamos homens
            if(trab[i].getSexo()=='F') qm++; //contamos as mulheres             
        }        
        System.out.println("A qtde. de homens da empresa é " + qh );
        System.out.println("A qtde. de mulheres da empresa é " + qm );
        if (qh > qm) {
            System.out.println("A empresa tem mais homens que mulheres");
        } 
        else if (qm > qh) {
            System.out.println("A empresa tem mais mulheres que homens");
        }
        else{
             System.out.println("A empresa tem iguais qtdes. de homens e mulheres");
        }
        
        //Determinar o salário médio das mulheres com menos de 25 anos e 
        //visualizar este resultado.
        float somaMulh = 0.0f;
        int qmm = 0;
        for( int j=0; j< trab.length; j++) {   //usamos trab.lenght ou N
            if(trab[j].getSexo() == 'F' && trab[j].getIdade() < 25) {
                  somaMulh += trab[j].getSalario();
                  qmm++;
            }
        }
        JOptionPane.showMessageDialog(null, 
                "A média dos salários das mulheres com menos de 25 anos é R$ " + somaMulh/qmm);
        
    }
    
    public Trabalhador lerNovoTrabalhador(int num)  {
        String cpf, nome, endereco; 
        int idade;  float salario;  char sexo;
 
        cpf = JOptionPane.showInputDialog (null, "Digite o CPF", "CPF - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE);
        nome = JOptionPane.showInputDialog (null, "Digite o nome", "Nome - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE);
	idade = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite a idade", "Idade - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE));
        sexo = JOptionPane.showInputDialog (null, "Digite o sexo (F ou M)", "Sexo - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE).toUpperCase().charAt(0);
        endereco = JOptionPane.showInputDialog (null, "Digite o endereço", "Endereço - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE);
        salario = Float.parseFloat(JOptionPane.showInputDialog (null, "Digite o salário", "Salário - trabalhador " + num, JOptionPane.INFORMATION_MESSAGE));
        
        Trabalhador trab = new Trabalhador(cpf, nome, idade, sexo, endereco, salario);
        return trab;
    }
    
}
