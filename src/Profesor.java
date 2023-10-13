import java.sql.SQLOutput;
import java.util.Scanner;

public class Profesor {
    private String nombre;
    private int codigo;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;


    public Profesor(){

    }

    public Profesor(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //getter y setter van aca


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }

    public void imprimirTodosProfesores(){
        String nomProfesor1 = materia1.getProfesor1().getNombre();
        System.out.println("");


    }
    public void ingresarDatos(int i){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor : " +i);
        this.nombre=sc.next();

        System.out.println("Ingrese la cedula del profesor: " +i);
        this.nombre=sc.next();

        System.out.println("Ingrese el IDBanner del profesor : " +i);
        this.nombre=sc.next();



    }

}