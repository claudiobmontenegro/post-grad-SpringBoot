package dev.claudioBessa.java.avancado.web.service;

import dev.claudioBessa.java.avancado.web.model.Disciplina;
import dev.claudioBessa.java.avancado.web.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public Disciplina salvar(Disciplina disciplina){
        return disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> listarDisciplinas(){
        return disciplinaRepository.findAll();
    }

    public List<Disciplina> listarPorCargaHoraria(){
        return disciplinaRepository.listarOrdenadoPorCargaHoraria();
    }

    public Disciplina consultarPorId(int id){
        return disciplinaRepository.findById(id).orElseThrow();
    }

    public void excluir(int id){
        disciplinaRepository.deleteById(id);
    }

    public Disciplina alterar(Disciplina disciplina){
        if(Objects.isNull(disciplina.getId())){
            throw new RuntimeException("ID não preenchido");
        }
        return disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> buscarDisciplinaLike(String nome){
        return disciplinaRepository.buscarDisciplinaPorNomeLike(nome);
    }


}
