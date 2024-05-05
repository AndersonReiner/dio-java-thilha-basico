import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Cria a instância de um  objeto apartir da classe Cliente.
        Cliente cliente = new Cliente();

        //Cria a instância de um objeto apartir da classe Scanner e usa o método Locate.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibe uma mesagem acima da entrada de dados, especificando os dados a serem inseridos
        //Recebe os dados e atribuindo ao objeto.
        System.out.println("\n Por favor, digite o nome do Cliente: ");
        cliente.setNomeCliente(scanner.nextLine());

        System.out.println("\n Por favor, digite o numero da Conta: ");
        cliente.setNumeroConta(scanner.nextInt());

        System.out.println("\n Por favor, digite o numero da Agência ");
        cliente.setNumeroAgencia(scanner.next());

        System.out.println("\t ATENÇÃO: ");
        System.out.println(" \n Por favor, digite o Saldo do Cliente, separando as casas decimais por ponto!");
        cliente.setSaldo(scanner.nextDouble());

        //Fecha o objeto scanner liberando recurso.
        scanner.close();
        
        // Exibe uma mensagem com todas as informações inseridas.
        System.out.println(" \n Olá " + cliente.getNomeCliente() + ", Obrigado por criar uma conta em nosso banco, sua agência é " +  cliente.getNumeroAgencia() +  ", Conta " + cliente.getNumeroConta() + " e seu saldo " + cliente.getSaldo() + " já está disponível para saque. \n");
    }

}