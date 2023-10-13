import java.util.Scanner;
public class Estudiante {
    /*clases:(todo en privado)*/
    private String nombre;
    private String cedula;
    private String numMatricula;
    private String materia1;
    private String materia2;
    private String materia3;

    public Estudiante(String nombre, String cedula, String numMatricula, String materia1, String materia2, String materia3) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numMatricula = numMatricula;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }
    // creación de métodos solicitados:(todos públicos)
    public String getNombre(){
        return nombre;
    }
    public String getMateria1(){
        return materia1;
    }
    public String getMateria2(){
        return materia2;
    }
    public String getMateria3(){
        return materia3;
    }



    //GETTER AND SETTER:


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

    // scanner de datos:
    public void ingresarDatosEST(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre=scanner.nextLine();
        System.out.print("Ingrese la cedula del estudiante: ");
        cedula=scanner.nextLine();
        System.out.print("Ingrese la matricula del estudiante: ");
        numMatricula=scanner.nextLine();

    }

}
