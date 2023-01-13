package dev.claudioBessa.java.avancado.web.service;

import dev.claudioBessa.java.avancado.web.model.Faculdade;
import dev.claudioBessa.java.avancado.web.repository.FaculdadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class FaculdadeService {

    @Autowired
    private FaculdadeRepository faculdadeRepository;

    public Faculdade salvar(Faculdade faculdade){
        return faculdadeRepository.save(faculdade);
    }

    public List<Faculdade> listarFaculdades(){
        return faculdadeRepository.findAll();
    }

    public List<Faculdade> listarPorLocalidade(){
        return faculdadeRepository.listarOrdenadoPorLocalidade();
    }

    public Faculdade consultarPorId(int id){
        return faculdadeRepository.findById(id).orElseThrow();
    }

    public void excluir(int id){
        faculdadeRepository.deleteById(id);
    }

    public Faculdade alterar(Faculdade faculdade){
        if(Objects.isNull(faculdade.getId())){
            throw new RuntimeException("ID não preenchido");
        }
        return faculdadeRepository.save(faculdade);
    }

    public List<Faculdade> buscarFaculdadeLike(String nome){
        return faculdadeRepository.buscarFaculdadePorNomeLike(nome);
    }


}
