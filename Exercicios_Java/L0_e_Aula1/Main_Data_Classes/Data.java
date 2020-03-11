class Data {
    public int mes;
    public int dia;
    public int hora;
    public int minuto;
    
    public void imprimeTudo(){
        System.out.println("Mes: " + this.mes + " Dia: " + this.dia + " Hora: " + this.hora + " Minuto: " + this.minuto);
    }
    public void imprimeampm(){
        if (this.hora > 12){
            System.out.println("PM");
        }else{
            if (this.hora < 12){
                System.out.println("AM");
            }  
        }  
    }
}