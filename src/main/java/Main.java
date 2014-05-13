/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) {
        Pratica34 retorno = new Pratica34();
        long a = 7, b = 5;
        int c = 20;
        System.out.println("Resultado MDC: " + retorno.mdc(a, b));
        System.out.println("Resultado Fatorial: " + retorno.fatorial(c));
        
        
        
    }
}
