import cine.entidad.Empleado;
import cine.service.EmpleadoService;
import cine.ArrancarAplicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDate;
import java.util.List;


@SpringBootTest (classes = ArrancarAplicacion.class)
public class EmpleadoTest {
    @Autowired
    EmpleadoService api;
        @Test
        void TestFindAll(){
            List<Empleado> emp;
            emp = api.getAll();
            for (Empleado e : emp){
                System.out.println(e.getId_empleado()+"-"+e.getNombre()+"-"+e.getTipo_jornada());
            }
        }
        @Test
        void updateEmpleadoTest(){
            Empleado emp = api.getOne(3L);
            if (emp != null){
                emp.setId_empleado(3L);
                emp.setNombre("David");
                emp.setPuesto("jefe");
                emp.setTipo_jornada("Jornada completa");
                emp.setEmail("david@gmail.com");
                emp.setTelefono("621756216");
                emp.setFecha_contratacion(LocalDate.ofEpochDay(25-05-2024));
                emp.setSalario_hora(15);
                emp.setActivo(true);
                api.update(3L, emp);
                System.out.println("Modificado");
            }
        }
        @Test
        void deleteEmpleadoTest(){
            api.delete(3L);
            System.out.println("Eliminado");
        }
        @Test
        void insertEmpleadoTest(){
            Empleado emp = new Empleado();
            emp.setId_empleado(3L);
            emp.setNombre("Baja");
            emp.setPuesto("Baja");
            emp.setTipo_jornada("Baja");
            emp.setEmail("Baja@gmail.com");
            emp.setTelefono("Baja");
            emp.setFecha_contratacion(LocalDate.ofEpochDay(25-05-2024));
            emp.setSalario_hora(0);
            emp.setActivo(false);
            api.insert(emp);
            System.out.println("Insertado");
        }
        @Test
        void TestFindAll2(){
            List<Empleado> emp;
            emp = api.getAll();
            for (Empleado e : emp){
                System.out.println(e.getId_empleado()+"-"+e.getNombre()+"-"+e.getTipo_jornada());
            }
        }
}
