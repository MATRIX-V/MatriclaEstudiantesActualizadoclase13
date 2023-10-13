import java.util.Scanner;

public class Materia {

    //clases en publico todo:
    private String nombreMateria;
    private String codigo;
    private int numHoras;
    private Profesor profesor1;
    private Profesor profesor2;
    private Profesor profesor3;
    public String materia1;
    public String materia2;
    public String materia3;


    //constructor vacio:
    public Materia(){

    }


//constructor:

    public Materia(String nombreMateria, String codigo, int numHoras, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
        this.nombreMateria = nombreMateria;
        this.codigo = codigo;
        this.numHoras = numHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3 = profesor3;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public Profesor getProfesor1() {
        return profesor1;
    }

//getter y setter:

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }

    public Profesor getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        this.profesor3 = profesor3;
    }

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }


    //metodos:


    public void ingresarDatosMAT(int i){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese el nombre de la materia: "+i);
        nombreMateria=scanner.nextLine();
        System.out.print("Ingrese el codigo NRC de la materia: "+i);
        codigo=scanner.nextLine();
        System.out.print("Ingrese el numero de horas: "+i);

    }

    public void ingresarProfesor(int i){
//para instanciar usaremos SOLO la siguiente linea: (soluciona el error: null pointer exception)
        profesor1=new Profesor();
        if (i==1){
            profesor1.ingresarDatos(i);
        }
        else if (i==2){
            profesor1=new Profesor();
            profesor2.ingresarDatos(i);
    }
        else{
            profesor1=new Profesor();
            profesor3.ingresarDatos(i);
        }
            
        }

    }
