package br.com.emendes;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

  private final Scanner input = new Scanner(System.in);

  /**
   * Solicita o o nome do cliente.
   */
  public String getClientName() {
    System.out.println("Por favor, digite o nome do cliente!");
    return input.nextLine();
  }

  /**
   * Solicita o número da agência.
   */
  public String getBranchNumber() {
    System.out.println("Por favor, digite o número da agência!");
    return input.nextLine();
  }

  /**
   * Solicita o número da conta.
   */
  public int getAccountNumber() {
    System.out.println("Por favor, digite o número da conta!");
    return Integer.parseInt(input.nextLine());
  }

  /**
   * Solicita o saldo da conta.
   */
  public BigDecimal getBalanceValue() {
    System.out.println("Por favor, digite o saldo da conta!");
    return new BigDecimal(input.nextLine());
  }

  /**
   * Método main para execução da aplicação.
   */
  public static void main(String[] args) {
    ContaTerminal contaTerminal = new ContaTerminal();
    String clientName = contaTerminal.getClientName();
    String branchNumber = contaTerminal.getBranchNumber();
    int accountNumber = contaTerminal.getAccountNumber();
    BigDecimal balanceValue = contaTerminal.getBalanceValue();

    String messageTemplate = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.%n";

    System.out.printf(messageTemplate, clientName, branchNumber, accountNumber, balanceValue);
  }

}