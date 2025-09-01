import java.util.Scanner;
class Validadora {
    static boolean validar_rango(int valor, int min, int max){
        if (valor >= min && valor <= max) {
            return true;
        } else {
            return false;
        }
    }
    static boolean validarS_N(String valor){
        valor = valor.toUpperCase();
        System.out.println(valor);
        if (valor.equals("S")){
            return true;
        } else if (valor.equals("N")){
            return false;
        } else {
            System.out.println("Valor no valido, se tomara como ´N´");
            return false;
        }
    }
}
class Calculadora {
    public static double calcular(double a, double b, String operacion) {
        if (operacion.equals("+")){
            return a+b;
        } else if (operacion.equals("-")){
            return a-b;
        } else if (operacion.equals("*")){
            return a*b;
        } else if (operacion.equals("/")){
            if (validar(b)){
                return a/b;
            } else {
                System.out.println("Operacion no valida");
                return 0;
            }
        } else {
            System.out.println("Operacion no valida");
            return 0;
        }
    }
    private static boolean validar(double b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero");
            return false;
        } else {
            return true;
        }
    }
    public static int factorial(int n){
        if (n < 0) {
            System.out.println("No se puede calcular el factorial de un numero negativo");
            return -1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
class Conversora {
    public static String decimalBinario(double numero){
        int n = (int) numero;
        if (n == 0) return "0";
        String binario = "";
        while (n > 0) {
            binario = (n % 2) + binario;
            n = n / 2;
        }
        return binario;
    }
    public static double binarioDecimal(String binario){
        double decimal = 0;
        int longitud = binario.length();
        for (int i = 0; i < longitud; i++) {
            char digito = binario.charAt(longitud - i - 1);
            if (digito == '1') {
                decimal += Math.pow(2, i);
            }
        }
        return decimal;
    }
}
class CalculadoraDeArea {
    public static double calcularAreaCuadrado(double longitudLado) {
        if (longitudLado <= 0) {
            System.out.println("La longitud del lado no puede ser negativa ni 0");
            return 0;
        } else {
            return longitudLado * longitudLado;
        }
    }
    public static double calcularAreaTriangulo(double base, double altura){
        if (base <= 0 || altura <= 0) {
            System.out.println("La base y la altura no pueden ser negativas ni 0");
            return 0;
        } else {
            return (base * altura) / 2;
        }
    }
    public static double calcularAreaCirculo(double radio){
        if (radio <= 0) {
            System.out.println("El radio no puede ser negativo ni 0");
            return 0;
        } else {
            return Math.PI * radio * radio;
        }
    }
    public static double calcularPitagoras( double a, double b) {
        if (a <= 0 ||b <= 0) {
            System.out.println("Los catetos no pueden ser negativos ni 0");
            return 0;
        } else {
            return Math.pow(a,2) + Math.pow(b,2);
        }
    }
}
public class Main {
    public static void main(String[] args) {
//      VALIDADOR DE RANGOS
        //        Scanner sc = new Scanner(System.in);
//        System.out.println("Validadora de numeros");
//        int num;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        int suma = 0;
//        int i = 0;
//        while (i < 10) {
//            System.out.println("Introduce un numero del -100 al 100: ");
//            num = sc.nextInt();
//            if (Validadora.validar_rango(num,-100,100)){
//                if (num < min) {
//                    min = num;
//                }
//                if (num > max) {
//                    max = num;
//                }
//                suma += num;
//                i++;
//            } else {
//                System.out.println("Numero no valido");
//            }
//        }
//        System.out.println("El numero minimo es: " + min);
//        System.out.println("El numero maximo es: " + max);
//        System.out.println("El promedio de los numeros ingresados es: " + (suma / 10));

//        VALIDADOR S/N
//        boolean validador = true;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Suma de numeros indeterminada");
//        int suma = 0;
//        while (validador) {
//            System.out.println("Introduce un numero: ");
//            int num = sc.nextInt();
//            suma += num;
//            System.out.println("La suma actual es: " + suma);
//            System.out.println("Queres seguir sumando? Introduce ´S´ para si o ´N´ para no: ");
//            String respuesta = sc.next();
//            System.out.println(respuesta);
//            validador = Validadora.validarS_N(respuesta);
//        }
//      CALCULADORA
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Calculadora basica");
//        System.out.println("Introduce el primer numero: ");
//        double a = sc.nextDouble();
//        System.out.println("Introduce el segundo numero: ");
//        double b = sc.nextDouble();
//        System.out.println("Introduce la operacion a realizar (+, -, *, /): ");
//        String operacion = sc.next();
//        double resultado = Calculadora.calcular(a, b, operacion);
//        if (resultado != 0) {
//            System.out.println("El resultado de la operacion es: " + resultado);
//        }
//      CONVERSORA
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Conversora de numeros");
//        System.out.println("Introduce un numero decimal: ");
//        double decimal = sc.nextDouble();
//        String binario = Conversora.decimalBinario(decimal);
//        System.out.println("El numero binario es: " + binario);
//        System.out.println("Introduce un numero binario: ");
//        String binario2 = sc.next();
//        double decimal2 = Conversora.binarioDecimal(binario2);
//        System.out.println("El numero decimal es: " + decimal2);
//      FACTORIAL
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Calculadora de factoriales");
//        System.out.println("Introduce un numero entero no negativo: ");
//        int n = sc.nextInt();
//        int resultado = Calculadora.factorial(n);
//        if (resultado != -1) {
//            System.out.println("El factorial de " + n + " es: " + resultado);
//        }
//      PITAGORAS
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de Pitagoras");
        System.out.println("Introduce el valor de un cateto: ");
        double a = sc.nextDouble();
        System.out.println("Introduce el valor del otro cateto: ");
        double b = sc.nextDouble();
        double resultado = CalculadoraDeArea.calcularPitagoras(a, b);
        System.out.println("El valor de la hipotenusa al cuadrado es: " + resultado);
    }
}