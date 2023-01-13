package dev.claudioBessa.java.avancado.web.repository;

import dev.claudioBessa.java.avancado.web.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    @Query("select a from Professor a order by a.nome ASC")
    public List<Professor> listarOrdernadoPorNome();
    public List<Professor> findAllByOrderByNomeAsc();

    @Query("select a from Professor a order by a.faculdade ASC")
    public List<Professor> listarOrdenadoPorFaculdade();

    @Query("select a from Professor a order by a.disciplina ASC")
    public List<Professor> listarOrdenadoPorDisciplina();

    @Query("select a from Professor a where a.nome like %:nome% ")
    public List<Professor> buscarProfessorPorNomeLike(@Param("nome") String nome);
    public Professor findByFaculdade(String faculdade);

    public Professor findByDisciplina(String disciplina);

    public Professor findByNome(String nome);

}
