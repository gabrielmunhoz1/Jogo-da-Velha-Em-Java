/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AC1;

/**
 *
 * @author Gabriel Munhoz
 */
public class JogodaVelha {
    int matriz[][] = {{'1', '2', '3'},
                      {'4', '5', '6'},
                      {'7', '8', '9'}};
        
    
    // Função para exibir uma matriz.
    public String Exibir(String matriz[][]) {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.println(matriz[i][j] + "  ");
            }
            System.out.println("-----------");
            }
        return null;
        }
    // Valida se o numero digitado pelo jogador é valido. 
    public boolean Validacao(String numero) {
        for(int i=0; i<3; i++){
            for(int j = 0; j<3; j++){
                if (matriz[i][j].equals(numero)){
                    return true;
                }
            }
        }
        return false;
    }
           
    // Coloca o simbolo do jogador(x ou o) no lugar desejado.
    public void fazerJogada(String numero; String s){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if (numero.equals(matriz[i][j])){
                    matriz[i][j] = s;
                }
            }
        }
    }
    // 
    public String Venceu(int jogadas){
        String [] C = new String[0];
        String resultado = "null";
        if(jogadas == 9){
            resultado = "Empatou";
        }
        // Posições na horizontal.
        C[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
        C[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
        C[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];
        
        // Posições na vertical.
        C[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];
        C[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
        C[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];
        
        // Posições na diagonal.
        C[6] = matriz[0][0] + matriz[1][1] + matriz[2][2];
        C[7] = matriz[0][2] + matriz[1][1] + matriz[2][0];
        
        // Loop para verificar qual número e a posição selecionada pelo jogador.
        for(int i=0; i<3; i++){
            if(C[i].equals("XXX")){
                resultado = "Jogador 1";
            
                }
            else if(C[i].equals("OOO")){
                resultado = "Jogador 2";
            }
        }
        return resultado;
    }
        
    
}
