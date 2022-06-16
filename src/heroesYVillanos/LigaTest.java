package heroesYVillanos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LigaTest {

	@Test
	public void devuelveElEquipoQueTieneLaLigaYElCombatiente() {
		HashSet<Combatiente> combatientes = new HashSet<Combatiente>();
		Combatiente c1 = new Heroe("Batman","Bruce Wayne", 1, 2, 7, 4);
		Combatiente c2 = new Villano("Superman","Clark Kent", 5, 3, 4, 2);
		Combatiente c3 = new Villano("WonderWoman","Diana", 3, 1, 6, 3);
		Liga liga = new Liga("Liga", Equipo.VILLANO, 0, 0, 0, 0, combatientes);
		liga.agregarCombatiente(c1);
		liga.agregarCombatiente(c2);
		liga.agregarCombatiente(c3);		
		
		Assert.assertEquals(c2.getEquipo(), liga.getEquipo());
	}
	
	@Test
	public void devuelveElEquipoQueTieneElCombatiente() {
		HashSet<Combatiente> combatientes = new HashSet<Combatiente>();
		Combatiente c1 = new Heroe("Batman","Bruce Wayne", 1, 2, 7, 4);
		Combatiente c2 = new Villano("Superman","Clark Kent", 5, 3, 4, 2);
		Combatiente c3 = new Villano("WonderWoman","Diana", 3, 1, 6, 3);
		Liga liga = new Liga("Liga", Equipo.VILLANO, 0, 0, 0, 0, combatientes);
		liga.agregarCombatiente(c1);
		liga.agregarCombatiente(c2);
		liga.agregarCombatiente(c3);

		ArrayList<Combatiente> lista = new ArrayList<Combatiente>();
		for(Combatiente comb : combatientes) {
			lista.add(comb);
		}

		Assert.assertEquals(Equipo.VILLANO, lista.get(0).getEquipo());
	}
	
	@Test
	public void devuelveErrorAquellosCombatientesQueNOEstanEnElMismoEquipoDeLiga() {
		HashSet<Combatiente> combatientes = new HashSet<Combatiente>();
		Combatiente c1 = new Heroe("Batman","Bruce Wayne", 1, 2, 7, 4);
		Combatiente c2 = new Villano("Superman","Clark Kent", 5, 3, 4, 2);
		Combatiente c3 = new Villano("WonderWoman","Diana", 3, 1, 6, 3);
		Liga liga = new Liga("Liga", Equipo.VILLANO, 0, 0, 0, 0, combatientes);
		liga.agregarCombatiente(c1);
		liga.agregarCombatiente(c2);
		liga.agregarCombatiente(c3);		
		
		Assert.assertEquals(c1.getEquipo(), liga.getEquipo());
	}
	
	@Test
	public void devuelveListaDeCombatienteOrdenadosDeSuVelocidad() {
		HashSet<Combatiente> combatientes = new HashSet<Combatiente>();
		Combatiente c1 = new Villano("Batman","a", 1, 2, 7, 4);
		Combatiente c2 = new Villano("Superman","a", 5, 3, 4, 2);
		Combatiente c3 = new Villano("WonderWoman","a", 3, 1, 6, 3);
		Liga liga = new Liga("Liga", Equipo.VILLANO, 0, 0, 0, 0, combatientes);
		liga.agregarCombatiente(c1);
		liga.agregarCombatiente(c2);
		liga.agregarCombatiente(c3);
		liga.listarCombatienteOrdenado(Caracteristica.VELOCIDAD);
		liga.compare(c1, c2);
		
		int[] resultadoOrdenado = {1,3,5};
		Assert.assertEquals(resultadoOrdenado, liga.listarCombatienteOrdenado(Caracteristica.VELOCIDAD));
		
	}
	
	@Test
	public void devuelvePromedioCorrecto() {
		HashSet<Combatiente> combatientes = new HashSet<Combatiente>();
		Combatiente c1 = new Villano("Batman","a", 1, 2, 7, 4);
		Combatiente c2 = new Villano("Superman","a", 5, 3, 4, 2);
		Combatiente c3 = new Villano("WonderWoman","a", 3, 1, 6, 3);
		Liga liga = new Liga("Liga", Equipo.VILLANO, 0, 0, 0, 0, combatientes);
		liga.agregarCombatiente(c1);
		liga.agregarCombatiente(c2);
		liga.agregarCombatiente(c3);
	}

}