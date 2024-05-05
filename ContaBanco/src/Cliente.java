/**
 * <h1>Cliente</h1>
 * A classe Cliente possui os atributos necessários para salvar os dados do cliente.   
 * Dados que foram descritos na sintaxe do desafio.
 * <p>
 * <b>Nota: </b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
* @author AndersonReiner
* @version 1.0
* @since 05/05/2024
*/
public class Cliente {
    
    /**
   * Os métodos criados para manipular os atributos dos objetos são padrões.
   * A classe não possui nada mais que um Construtor vazio, os Getters e Setters.
   * @nomeCliente recebe tipo Texto. exemplo: MARIO ANDRADE
   * @numeroConta recebe tipo Inteiro. exemplo:	1021
   * @numeroAgencia  recebe tipo Texto. exemplo: 067-8
   * @saldo recebe um tipo Decimal. exemplo: 237.48 
   * Observação: o @saldo, parametro que recebe numeros decimais separado por ponto.
   * @return retorna um atributos descrito no método.
   */

    private String nomeCliente;
    private int numeroConta;
    private String numeroAgencia;
    private double saldo;

    /**
     * Construtor vazio, os dados seram passados ao atributo
     * pelos setters, obtidos pelos getters.
     */
    public Cliente() {
    }

    //Geters and Seters
    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    
    





    

}
