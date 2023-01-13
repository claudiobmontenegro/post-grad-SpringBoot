package dev.claudioBessa.java.avancado.web.repository;

import dev.claudioBessa.java.avancado.web.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

    @Query("select a from Disciplina a order by a.nome ASC")
    public List<Disciplina> listarOrdernadoPorNome();
    public List<Disciplina> findAllByOrderByNomeAsc();

    @Query("select a from Disciplina a order by a.cargaHoraria ASC")
    public List<Disciplina> listarOrdenadoPorCargaHoraria();

    @Query("select a from Disciplina a where a.nome like %:nome% ")
    public List<Disciplina> buscarDisciplinaPorNomeLike(@Param("nome") String nome);
    public Disciplina findByCargaHoraria(Integer cargaHoraria);

    public Disciplina findByDescricaoAndNome(String descricao, String nome);

}
