# <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> Condições, Loops e Exceções na Prática com Java
www.dio.me


#### Desenvolvido na linguagem Java por:
- [Marcos Shirafuchi](https://github.com/marcosfshirafuchi)
# Desafio 02 / 05 - Verificação de Número de Conta Bancária
## Descrição
Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.


## Entrada


* O programa solicitará ao usuário que digite o número da conta bancária.


## Saída

* O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.

* Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
* Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e informará que o número da conta é inválido.
  
## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.
<table>
  <thead>
    <tr align="left">
      <th>Entrada</th>
      <th>Saída</th>
    </tr>
  </thead>
  <tbody align="left">
    <tr>
      <td>01020304
      </td>
      <td>Numero de conta valido.
      </td>
    </tr>
    <tr>
      <td>1234568
      </td>
      <td>Erro: Numero de conta invalido. Digite exatamente 8 digitos.</td>
    </tr>
    <tr>
      <td>3231</td>
      <td>Erro: Numero de conta invalido. Digite exatamente 8 digitos.</td>   
    </tr>
  </tbody>
  <tfoot></tfoot>
</table>





