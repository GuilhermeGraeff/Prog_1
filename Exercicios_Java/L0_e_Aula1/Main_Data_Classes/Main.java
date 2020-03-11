public class Main {
    public static void main(String args[]){
        Data dataNascimento = new Data();
        dataNascimento.mes = 12;
        dataNascimento.dia = 8;
        dataNascimento.hora = 8;
        dataNascimento.minuto = 23;
        dataNascimento.imprimeTudo();
        dataNascimento.imprimeampm();
    }
}