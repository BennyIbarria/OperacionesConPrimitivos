public class ConversionDeTipos {
    public static void main(String[] args) {

        String numeroStr="50";
        int numeroInte=Integer.parseInt(numeroStr);

        System.out.println("Numero de String a Entero = " + numeroInte);

        String realStr="98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroint=100;
        System.out.println("otroNumeroint = " + otroNumeroint);

        String otroNumeroString = Integer.toString(otroNumeroint);
        System.out.println("otroNumeroString = " + otroNumeroString);

        //Convirtiendo con sobrecarga de metodos (Valueof)

        otroNumeroString = String.valueOf(otroNumeroint);
        System.out.println("otroNumeroString = " + otroNumeroString);

        Double otroRealDouble=1.23456;
        String otroRealstr = Double.toString(otroRealDouble);
        System.out.println("otroRealstr = " + otroRealstr);

        otroRealstr = String.valueOf(otroRealDouble);
        System.out.println("otroRealstr = " + otroRealstr);
        otroRealstr = String.valueOf(1.23456f);
        System.out.println("otroRealstr = " + otroRealstr);

        //Casteando entre primitivos

        int i = 1000;
        short s = (short)i;
        System.out.println("s = " + s);
        long l=i;
        System.out.println("l = " + l);
        
        
    }
}
