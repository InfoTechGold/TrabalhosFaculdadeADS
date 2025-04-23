/* criando um sistema bancario para a faculdade*/

//importando a biblioteca scanner do java para podemos usar entradas de dados
import java.util.Scanner;

//criando a classe publica gerenciarBanco
public class gerenciarBanco {
    public static void main(String[]args){
        
        //criando um novo objeto chamado input com a instância do Scanner
        Scanner input=new Scanner(System.in);
        
        //criando uma variavel do tipo inteiro para o menu
        int opcao=4;
        
        //criando as variaveis para criar nosso sistema
        String nome, nomeConta, sobrenome, sobrenomeConta, cpf, cpfConta;
        double saldo, deposito,saque;
        
        /* vamos supor que já temos uma conta no banco com esses dados
        que salvamos aqui embaixo nome da conta , sobrenome da conta
        cpf da conta, supondo que estão salvos em um banco de dados
        */
        saldo=4000;
        nomeConta="Nilton";
        sobrenomeConta="Sousa";
        cpfConta="12345678912";
        
        //dando inicio ao nosso laço de repetição para criar o menu e todo os sistemas
        while(opcao!=0){
            
            //criando o menu
            System.out.print("[0]=Sair \n[1]=Deposito \n[2]=Saque \n[3]=Consultar Saldo \n");
            
            //pegando o valor do menu que escolhemos e guardando em uma variavel
            opcao=input.nextInt();
            
            //condição para rodar caso escolher 1
            if(opcao==1){
                
                //pedindo para digitar seu nome
                System.out.println("digite seu nome : ");
                //salvando o valor na variavel
                nome=input.next();
                
                //pedindo para digitar seu sobrenome
                System.out.println("digite seu sobrenome : ");
                //salvando o valor na variavel
                sobrenome=input.next();
                
                //pedindo para digitar seu cpf
                System.out.println("digite seu cpf : ");
                //salvando o valor na variavel
                cpf=input.next();
                
                //condição para verificar se os dados batem com a conta informada
                if(nome.equals(nomeConta) && sobrenome.equals(sobrenomeConta) && cpf.equals(cpfConta)){
                    
                    //pedindo para informar o valor que deseja depositar na conta
                    System.out.print("quanto deseja depositar ? ");
                    //salvando o valor na variavel
                    deposito=input.nextDouble();
                    
                    //Sistema para calcular o novo saldo
                    saldo+=deposito;
                    
                    //mostrar na tela o valor do deposito e meu saldo atual
                    System.out.println("você depositou : R$: " + deposito + " seu saldo atual é de R$: " + saldo);
                }
                
                //caso o valor for invalido mostrar na tela valor invalido usando 
                //uma operação ternaria
                else System.out.println("valor invalido"); 
                
            }
            // caso a opcao escolhida for 2
            if(opcao==2){
                
                //pedindo para digitar seu nome
                System.out.println("digite seu nome : ");
                //salvando o valor na variavel nome
                nome=input.next();
                
                //pedindo para digitar seu sobrenome
                System.out.println("digite seu sobrenome : ");
                //salvando o valor na variavel sobrenome
                sobrenome=input.next();
                
                //pedindo para digitar seu cpf
                System.out.println("digite seu cpf : ");
                //salvando o valor na variavel cpf
                cpf=input.next();
                
                //condição para verificar se os dados batem com a conta informada
                if(nome.equals(nomeConta) && sobrenome.equals(sobrenomeConta) && cpf.equals(cpfConta)){
                    
                    //pedindo para digitar quantos deseja sacar
                    System.out.print("quanto deseja Sacar ? ");
                    //salvando o valor na variavel saque
                    saque=input.nextDouble();
                    
                    //condição para checar se o valor do saque é menor ou igual
                    //ao valor que eu tenho na minha conta
                    if(saque<=saldo){
                        
                      //caso sim eu faço o sistema de saque
                      saldo-=saque;  
                      //mostrando na tela o valor do saque e o valor atual da minha conta
                     System.out.println("você sacou : R$: " + saque + " seu saldo atual é de R$: " + saldo); 
                    }
                    //caso não eu mostro na tela valor invalido usando uma 
                    //operação ternaria
                    else System.out.println("valor invalido");
                    
                    
                }
                
                //caso inserir número invalido mostro na tela valor invalido
                //usando uma operação ternaria
                else System.out.println("valor invalido");   
            }
             // caso a opcao escolhida for 3
            if(opcao==3){
                   //pedindo para digitar seu nome
                System.out.println("digite seu nome : ");
                //salvando o valor na variavel 
                nome=input.next();
                
                   //pedindo para digitar seu sobrenome
                System.out.println("digite seu sobrenome : ");
                //salvando o valor na variavel 
                sobrenome=input.next();
                
                   //pedindo para digitar seu cpf
                System.out.println("digite seu cpf : ");
                //salvando o valor na variavel 
                cpf=input.next();
                //condição para saber se os dados batem
                if(nome.equals(nomeConta) && sobrenome.equals(sobrenomeConta) && cpf.equals(cpfConta)){
                    
                   //mostrando na tela o valor atual do meu saldo no banco
                     System.out.println(" seu saldo atual é de R$: " + saldo); 
                }
                //caso inserir número invalido mostro na tela valor invalido
                //usando uma operação ternaria
                else System.out.println("valor invalido"); 
                
            }
              if(opcao==0){
                   System.out.println("muito obrigado por sua preferência até mais !");
              }
            //caso inserir número invalido mostro na tela valor invalido
                //usando uma operação ternaria
            else System.out.println("Valor invalido");
        }
      
        
        //encerrando o nosso objeto input 
        input.close();
    }
}
