package dev.claudioBessa.java.avancado.web.repository;

import dev.claudioBessa.java.avancado.web.model.Faculdade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaculdadeRepository extends JpaRepository<Faculdade, Integer> {

    @Query("select a from Faculdade a order by a.nome ASC")
    public List<Faculdade> listarOrdernadoPorNome();
    public List<Faculdade> findAllByOrderByNomeAsc();

    @Query("select a from Faculdade a order by a.localidade ASC")
    public List<Faculdade> listarOrdenadoPorLocalidade();

    @Query("select a from Faculdade a where a.nome like %:nome% ")
    public List<Faculdade> buscarFaculdadePorNomeLike(@Param("nome") String nome);
    public Faculdade findByLocalidade(String localidade);

    public Faculdade findByDescricaoAndNome(String descricao, String nome);

}
