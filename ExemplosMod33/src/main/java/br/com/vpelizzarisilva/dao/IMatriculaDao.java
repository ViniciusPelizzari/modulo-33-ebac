/**
 * 
 */
package br.com.vpelizzarisilva.dao;

import br.com.vpelizzarisilva.domain.Curso;
import br.com.vpelizzarisilva.domain.Matricula;

/**
 * @author Vinícius Pelizzari
 *
 */
public interface IMatriculaDao {

	Matricula cadastrar(Matricula mat);
	
	Matricula buscarPorCodigoCurso(String codigoCurso);
	
	Matricula buscarPorCurso(Curso curso);
	
	Matricula buscarPorCodigoCursoCriteria(String codigoCurso);
	
	Matricula buscarPorCursoCriteria(Curso curso);

}
