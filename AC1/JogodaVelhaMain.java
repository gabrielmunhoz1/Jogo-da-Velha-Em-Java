/*
 * 1) Vamos representar o nosso tabuleiro como uma matriz de caracteres 3x3. Sua primeira
função deverá devolver uma matriz de caracteres 3x3, com algum valor preenchido para
indicar que uma posição não foi ocupada.

 * 2) Implemente uma função que receba uma matriz do jogo da velha, uma posição (linha,
coluna) e o código do jogador (X ou O) e devolva a matriz com a posição preenchida com o
código do jogador, caso esteja livre. Se a posição conseguiu ser preenchida, step deve
retornar true e, caso não puder ser preenchida, false.

 * 3) Implemente uma função que receba uma matriz do jogo da velha e verifique o
estado do jogo: alguém venceu, ocorreu um empate ou o jogo deve continuar. Vamos usar
o seguinte código: -1 (o jogo pode continuar), 0 (ocorreu um empate), 1 (O venceu) e 2 (X
venceu).

 * 4) Implemente um procedimento para executar a lógica deste jogo. Suponha que o jogador O
sempre começa. A cada jogada, a matriz do jogo deverá ser exibida na tela. Ao final do jogo,
seu procedimento deve mostrar o estado a que se chegou (vitória ou empate). Teste o seu
jogo.
 */
package AC1;
import java.util.Scanner;
/**
 *
 * @author Gabriel Munhoz
 */
public class JogodaVelhaMain {
    public static void main(String[] args){
       Scanner leitura = new Scanner(System.in);
       String posicao;
       JogodaVelha jogo = new JogodaVelha();
       int valida = 0;
       int numeroDeJogadas = 0;
       while(true){
        System.out.println("-----JOGO DA VELHA-----");
        jogo.Exibir();
        
        do{
            System.out.print("Jogador 1, informe uma posição: ");
            posicao = leitura.next();
            while(!jogo.Validacao(posicao))
                System.out.println("Jogada inválida, tente novamente!");
                System.out.print("Jogador 1: informe sua posição: ");
                posicao = leitura.next();
                valida = 0;
            }
            jogo.fazerJogada(posicao, "X");
            valida = 1;
        
        }while(valida == 0);
        numerodeJogadas++;
        
        

    
    
   
        
   
    


