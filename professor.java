public class Data{
    String admissao;
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano){
    
        if(dia> 0 && dia<=31){
            this.dia = dia;
        } else{
            System.out.println("dia invalido")
        }
        if(mes > 0 && mes<=12){
            this.mes = mes;
        } else{
            System.out.println("mes invalido")
        }
        if(ano> 0){
            this.ano = ano;
            System.out.println("data valida")
        }else{
            System.out.println("ano invalido")
        }
    }
}

class Professor{
    String nome;
    String departamento;
    String registro;
    Data admissao;


    public static void main(String[] args){

    }
}