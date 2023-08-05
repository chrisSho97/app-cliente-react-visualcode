package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class DatabaseLoader implements CommandLineRunner { 

	private final AlumnoRepository repositoryA;
	private final CursoRepository repositoryC;

	@Autowired 
	public DatabaseLoader(AlumnoRepository repositoryA, CursoRepository repositoryC) {
		this.repositoryA = repositoryA;
		this.repositoryC = repositoryC;
	}

	@Override
	public void run(String... strings) throws Exception { 
		this.repositoryA.save(new Alumno("Roberto", "Gonzales Salazae", "Dia"));
		this.repositoryA.save(new Alumno("Nena", "Gonzales Salazae", "Dia"));
		this.repositoryA.save(new Alumno("Eduardo", "Gonzales Salazae", "Dia"));
		this.repositoryA.save(new Alumno("Matious", "Gonzales Salazae", "Dia"));
        this.repositoryC.save(new Curso("Algebra"));
		this.repositoryC.save(new Curso("Comunicacion"));
		this.repositoryC.save(new Curso("Ingles"));
		this.repositoryC.save(new Curso("Computación"));

	}
}