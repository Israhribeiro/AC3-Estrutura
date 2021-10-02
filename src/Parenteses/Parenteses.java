package Parenteses;

import LSE_TADPilha.NodeStack;

public class Parenteses {
    public void MatSimbolos(String math){
        NodeStack<Character> pilha = new NodeStack<Character>();
        for (int i = 0;i < math.length();i++){
            if(math.charAt(i) == '(' || math.charAt(i) == '[' || math.charAt(i) == '{'){
                pilha.push(math.charAt(i));
            }
            if(math.charAt(i) == ')' || math.charAt(i) == ']' || math.charAt(i) == '}'){
                pilha.push(math.charAt(i));
            }
        }
    }
}
