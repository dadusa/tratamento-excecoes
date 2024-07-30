public class CepInvalidException extends Exception{
    public static void main(String[] args) {
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              //simulando um cep formatado
              return "23.765-064";
        }
    }
}
