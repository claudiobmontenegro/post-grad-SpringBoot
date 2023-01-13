package dev.claudioBessa.java.avancado.web.service;

import dev.claudioBessa.java.avancado.web.model.Professor;
import dev.claudioBessa.java.avancado.web.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

    public List<Professor> listarProfessor(){
        return professorRepository.findAll();
    }

    public List<Professor> listarPorNome(){
        return professorRepository.listarOrdernadoPorNome();
    }

    public List<Professor> listarPorFaculdade(){
        return professorRepository.listarOrdenadoPorFaculdade();
    }

    public List<Professor> listarPorDisciplina(){
        return professorRepository.listarOrdenadoPorDisciplina();
    }

    public Professor consultarPorId(int id){
        return professorRepository.findById(id).orElseThrow();
    }

    public void excluir(int id){
        professorRepository.deleteById(id);
    }

    public Professor alterar(Professor professor){
        if(Objects.isNull(professor.getId())){
            throw new RuntimeException("ID não preenchido");
        }
        return professorRepository.save(professor);
    }

    public List<Professor> buscarProfessorLike(String nome){
        return professorRepository.buscarProfessorPorNomeLike(nome);
    }


}
