package cine.repositorios.repositorioJPA;

import cine.entidad.Empleado;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

//Jparepository: Extiende las clases para conectarse a la base de datos,
//con la finalidad de gestionar la información, es decir, nos permite relizar busquedas, eliminar,
//actualizar e insertar registros en la base de datos.
// Al extender JpaRepository, Spring crea automáticamente:
// - findAll()      → obtener todos los usuarios
// - findById(id)   → obtener un usuario por ID
// - save(usuario)  → crear o actualizar un usuario
// - deleteById(id) → borrar un usuario
// No es necesario escribir código adicional para CRUD básico.
@Repository
public interface EmpleadoRepositorioJPA extends JpaRepository<Empleado, Long>{}
