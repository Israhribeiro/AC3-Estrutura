package Parenteses;


import java.util.Stack;

public class Parenteses {

    private String expressao;
    public String validarFormacao(String expressao) {
        Stack controle = new Stack();
        for (int i = 0; i < expressao.length(); i++) {
            System.out.println(controle);
            if (expressao.charAt(i) == '{' || expressao.charAt(i) == '[' || expressao.charAt(i) == '(') {
                controle.push(expressao.charAt(i));
            } else if (expressao.charAt(i) == ')' || expressao.charAt(i) == ']' || expressao.charAt(i) == '}') {
                if (controle.isEmpty()) {
                    return "Esta errado";
                } else if (expressao.charAt(i) == ')' && controle.peek().equals('(')) {
                    controle.pop();
                    //calcular
                    continue;
                } else if (expressao.charAt(i) == ']' && controle.peek().equals('[')) {
                    controle.pop();
                    //calcular
                    continue;
                } else if (expressao.charAt(i) == '}' && controle.peek().equals('{')) {
                    controle.pop();
                    //calcular
                    continue;
                }
                return "Esta errado";
            }
        }
        System.out.println(controle);
        if(controle.isEmpty()) return "Esta correto";
        return "Esta incorreto";
    }

    public String getExpressao() {
        return expressao;
    }


}