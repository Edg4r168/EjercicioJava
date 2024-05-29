import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var empleados = new ArrayList<Empleado>();
        var scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el id del empleado");
            int id = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Ingrese el nombre del empleado");
            var nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido del empleado");
            var apellido = scanner.nextLine();

            System.out.println("Ingrese el departamento del empleado");
            var departamento = scanner.nextLine();

            System.out.println("Ingrese el salario del empleado");
            var salario = scanner.nextDouble();
            scanner.nextLine();

            var newEmpleado = new Empleado(id, nombre, apellido, departamento, salario);

            empleados.add(newEmpleado);

            System.out.println("¿Desea registrar otro empleado? (s/n)");
            String res = scanner.nextLine();

            if (!res.equalsIgnoreCase("s"))
            {
                continuar = false;
            }
        }

        System.out.println("Empleados registrados: ");

        for (var empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
