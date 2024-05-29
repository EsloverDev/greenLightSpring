package co.edu.sena.controllerT;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import co.edu.sena.controller.PersonaController;
import co.edu.sena.models.entity.Persona;
import co.edu.sena.models.service.PersonaService;
/*
//La anotación @ExtendWith sirve para configurar la extensión de Mockito, lo que permite el uso de Mockito en las pruebas.
@ExtendWith(MockitoExtension.class)
public class PerfilControllerTest {
	
	//La anotación @InjectMocks sirve para crear una instancia del controlador PerfilController y se asegura de que las dependencias simuladas se inyecten en él. Esto permite que el controlador realice operaciones con las dependencias simuladas en las pruebas.
	@InjectMocks
	private PerfilController perfilController;
	
	//La anotación @Mock sirve para crear una instancia simulada del servicio PerfilService. El servicio simulado se utilizará en las pruebas en lugar de la implementación real.
	@Mock
	private PerfilService perfilService;
	
	//La anotación @Test sirve para especificar que éste método contiene una prueba que verifica el comportamiento de esta porción específica de código.
	@Test
	//Aquí se define un método llamado pruebaGuardar, que es un método de prueba. Los métodos de prueba deben ser públicos, no tener un valor de retorno (void), y no aceptar argumentos. Estos métodos se encargarán de realizar pruebas unitarias en el código.
	public void pruebaGuardar() {
		
		//Perfil perfilSimulado = new Perfil(); sirve para crear una instancia de la clase Perfil llamada perfilSimulado
		Perfil perfilSimulado = new Perfil();
		// perfilSimulado.setId(1); Establece el valor del atributo id de perfilSimulado en 1.
		perfilSimulado.setId(1);
		// perfilSimulado.setNombre("Juana"); Establece el valor del atributo nombre de perfilSimulado en "Juana".
		perfilSimulado.setNombre("Juana");
		perfilSimulado.setPassword("123456");
		perfilSimulado.setEmail("juana@mail.com");
		perfilSimulado.setTelefono("789012");
		perfilSimulado.setPais("Colombia");
		perfilSimulado.setCiudad("Bogota");
		perfilSimulado.setLocalidad("Antonio Nariño");
		perfilSimulado.setDocumento("345678");
		
		// Aquí se está configurando el comportamiento del servicio perfilService. Se le dice que cuando se llame al método save con perfilSimulado como argumento, debe retornar perfilSimulado. Esto simula el comportamiento del servicio en la prueba.
		when(perfilService.save(perfilSimulado)).thenReturn(perfilSimulado);
		
		// Aquí se invoca el método guardar del controlador perfilController con perfilSimulado como argumento, y el resultado se almacena en la variable resultado.
		Perfil resultado = perfilController.guardar(perfilSimulado);
		
		// Este es un paso de verificación. Se verifica si resultado no es nulo. En caso de ser nulo, la prueba fallaría.
		assertNotNull(resultado);
		
		// Este paso de verificación compara si perfilSimulado y resultado son iguales. Si son iguales, la prueba pasa; de lo contrario, falla.
		assertEquals(perfilSimulado, resultado);
	}
	
	@Test
	public void pruebaListar() {
		
		// Aquí Se crea una lista llamada perfilesSimulados que contendrá objetos de tipo Perfil. Esta lista se utiliza para simular una colección de perfiles.
		List<Perfil> perfilesSimulados = new ArrayList<>();
		
		// Aquí se agregan dos objetos Perfil a la lista perfilesSimulados. Estos objetos representan perfiles simulados con diferentes valores.
		perfilesSimulados.add(new Perfil(1, "Juana", "123456", "juana@mail.com", "789012", "Colombia", "Bogota", "Antonio Nariño", "345678"));
		perfilesSimulados.add(new Perfil(2, "David", "789012", "david@mail.com", "345678", "Colombia", "Bogota", "Usme", "901234"));
		
		// Aquí se configura el comportamiento del servicio perfilService. Se le dice que cuando se llame al método findAll, debe retornar la lista perfilesSimulados. Esto simula el comportamiento del servicio en la prueba.
		when(perfilService.findAll()).thenReturn(perfilesSimulados);
		
		// Aquí se invoca el método listarTodos del controlador perfilController y se almacena el resultado en la variable perfilesListados.
		List<Perfil> perfilesListados = perfilController.listarTodos();
		
		assertNotNull(perfilesSimulados);
		
		// Aquí se compara si la lista perfilesSimulados es igual a la lista perfilesListados. Si son iguales, la prueba pasa; de lo contrario, falla.
		assertEquals(perfilesSimulados, perfilesListados);
	}
	
	@Test
	public void pruebaBuscarPorEmail() {
	
		// Aquí se crea un objeto Perfil llamado perfilSimulado y se le asignan valores ficticios. Esto representa un perfil simulado que se utilizará en la prueba.
		Perfil perfilSimulado = new Perfil();
		perfilSimulado.setId(1);
		perfilSimulado.setNombre("Juana");
		perfilSimulado.setPassword("123456");
		perfilSimulado.setEmail("juana@mail.com");
		perfilSimulado.setTelefono("789012");
		perfilSimulado.setPais("Colombia");
		perfilSimulado.setCiudad("Bogota");
		perfilSimulado.setLocalidad("Antonio Nariño");
		perfilSimulado.setDocumento("345678");
		
		
		// Aquí se configura el comportamiento del servicio perfilService. Se indica que cuando se llame al método findByEmail con el argumento "juana@mail.com", debe devolver un objeto Optional que contiene el perfil simulado perfilSimulado. Esto simula el comportamiento del servicio en la prueba.
		when(perfilService.findByEmail("juana@mail.com")).thenReturn(Optional.of(perfilSimulado));
		
		// Aquí Se llama al método buscarPorEmail del controlador perfilController, que busca un perfil por su correo electrónico. El resultado se almacena en la variable perfilBuscado.
		Optional<Perfil> perfilBuscado = perfilController.buscarPorEmail("juana@mail.com");
		
		// Aquí se verifica si el objeto perfilSimulado no es nulo, osea que efectivamente se creó con los datos del perfil simulado y no está vacío.
		assertNotNull(perfilSimulado);
		
		// Aquí se verifica si el objeto perfilBuscado contiene un valor presente. En otras palabras, se verifica si el perfil fue encontrado. Si perfilBuscado no contiene un perfil presente, la prueba fallará.
		assertTrue(perfilBuscado.isPresent());
	}
	
	@Test
	public void pruebaActualizarPerfil() {
		
		// Aquí se crea una variable email que contiene la dirección de correo electrónico que se utilizará en la prueba.
		String email = "juana@mail.com";
		
		// Aquí se crea un objeto Perfil llamado perfilExistente que representa un perfil existente en la base de datos con valores iniciales.
		Perfil perfilExistente = new Perfil(1, "Juana", "123456", "juana@mail.com", "789012", "Colombia", "Bogota", "Antonio Nariño", "345678");
		
		// Aquí se crea un objeto Perfil llamado perfilActualizado que representa al mismo perfil creado anteriormente, debido a que tienen el mismo id, pero ahora con datos actualizados.
		Perfil perfilActualizado = new Perfil(1, "Juana Actualizado", "123456", "juana@mail.com", "789012", "Colombia", "Bogota", "Antonio Nariño", "345678");
		
		//Aquí se indica que cuando se llame al método findByEmail con el argumento email, debe devolver un objeto Optional que contiene el perfil existente perfilExistente. Esto simula el comportamiento del servicio en la prueba.		
		when(perfilService.findByEmail(email)).thenReturn(Optional.of(perfilExistente));
		
		// Aquí se configura el servicio para que, cuando se llame al método update con el perfil existente perfilExistente, devuelva el perfil actualizado perfilActualizado.
		when(perfilService.update(perfilExistente)).thenReturn(perfilActualizado);
		
		// Aquí se llama al método actualizar del controlador perfilController, que actualiza el perfil existente con los datos de perfilActualizado. El resultado se almacena en la variable actualizacionDePerfil.
		Perfil actualizacionDePerfil = perfilController.actualizar(perfilActualizado, email);
		
		assertNotNull(perfilExistente);
		
		// Aquí se verifica si el perfil actualizado perfilActualizado es igual al perfil obtenido después de la actualización actualizacionDePerfil. Si no son iguales, la prueba fallará.
		assertEquals(perfilActualizado, actualizacionDePerfil);
	}
	
	@Test
	public void pruebaEliminarPerfil() {
		
		String email = "juana@mail.com";
		
		Perfil perfilExistente = new Perfil(1, "Juana", "123456", "juana@mail.com", "789012", "Colombia", "Bogota", "Antonio Nariño", "345678");
		
		// Aquí se indica que cuando se llame al método findByEmail con el argumento email, debe devolver un objeto Optional que contiene el perfil existente perfilExistente. Esto simula el comportamiento del servicio en la prueba.
		when(perfilService.findByEmail(email)).thenReturn(Optional.of(perfilExistente));
		
		// Aquí se llama al método eliminarPorEmail del controlador perfilController, que elimina el perfil correspondiente al correo electrónico email. Sin embargo, este método no tiene un valor de retorno.
		perfilController.eliminarPorEmail(email);
		
		// Aquí se utiliza Mockito para verificar si el método deleteById del servicio perfilService se llamó con el ID del perfil existente perfilExistente. Si no se llamó, la prueba fallará.
		verify(perfilService).deleteById(perfilExistente.getId());
		
		// Esta línea verifica que el método deleteById se llamó exactamente una vez (times(1)) con el ID del perfil existente perfilExistente. Si se llamó más o menos veces, la prueba fallará.
		verify(perfilService, times(1)).deleteById(perfilExistente.getId());
	}

}
*/