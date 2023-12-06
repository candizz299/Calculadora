
public class CalculadoraTestes {
	
	 public static void main(String[]args){
	        Calculadora calc = new Calculadora();
	        
	        System.out.println("ADIÇÃO");
	        //CENARIO DE TESTE 1: SOMA DE DOIS VALORES
	        int soma = calc.soma(3,7);
	        System.out.println(soma);
	        
	        //CENARIO DE TESTE 2: SOMA DE DOIS VALORES SENDO UM ZERO
	        soma = calc.soma(10,0);
	        System.out.println(soma);
	        
	        //CENARIO DE TESTE 3: SOMA DE DOIS VALORES SENDO AMBOS ZERO
	        soma = calc.soma(0,0);
	        System.out.println(soma);
	        
	        //CENARIO DE TESTE 4: SOMA DE DOIS VALORES SENDO UM NEGATIVO
	        soma = calc.soma(10,-7);
	        System.out.println(soma);
	        
	        
	        
	        
	        System.out.println("SUBTRAÇÃO");
	        //CENARIO DE TESTE 1: SUBTRAÇÃO DE DOIS VALORES
	        int sub = calc.subtrair(15,7);
	        System.out.println(sub);
	        
	        //CENARIO DE TESTE 2: SUBTRAÇÃO DE DOIS VALORES SENDO UM ZERO
	        sub = calc.subtrair(10,0);
	        System.out.println(sub);
	        
	        //CENARIO DE TESTE 3: SUBTRAÇÃO DE DOIS VALORES SENDO AMBOS ZERO
	        sub = calc.subtrair(0,0);
	        System.out.println(sub);
	        
	        //CENARIO DE TESTE 4: SUBTRAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
	        sub = calc.subtrair(30,-7);
	        System.out.println(sub);
	        
	       
	        
	        
	        System.out.println("DIVISÃO");
	        //CENARIO DE TESTE 1: DIVISÃO DE DOIS VALORES
	        int div = calc.dividir(21,7);
	        System.out.println(div);
	        
	        //CENARIO DE TESTE 2: DIVISÃO DE DOIS VALORES SENDO DOIS NEGATIVOS
	        div = calc.dividir(-10,-2);
	        System.out.println(div);
	        
	        //CENARIO DE TESTE 3: DIVISÃO DE DOIS VALORES SENDO AMBOS 10
	        div = calc.dividir(10,10);
	        System.out.println(div);
	        
	        //CENARIO DE TESTE 4: DIVISÃO DE DOIS VALORES SENDO UM NEGATIVO
	        div = calc.dividir(-10,2);
	        System.out.println(div);
	        
	        
	        
	        
	        System.out.println("MULTIPLICAÇÃO");
	        //CENARIO DE TESTE 1: MULTIPLICAÇÃO DE DOIS VALORES
	        int mult = calc.multiplicar(21,7);
	        System.out.println(mult);
	        
	        //CENARIO DE TESTE 2: MULTIPLICAÇÃO DE DOIS VALORES SENDO UM ZERO
	        mult = calc.multiplicar(10,0);
	        System.out.println(mult);

	        //CENARIO DE TESTE 3: SUBTRAÇÃO DE DOIS VALORES SENDO AMBOS ZERO
	        mult = calc.multiplicar(0,0);
	        System.out.println(mult);

	        //CENARIO DE TESTE 4: SUBTRAÇÃO DE DOIS VALORES SENDO UM NEGATIVO
	        mult = calc.multiplicar(-10,5);
	        System.out.println(mult);

	        
	        
}
}