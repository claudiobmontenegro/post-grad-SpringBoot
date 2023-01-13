package dev.claudioBessa.java.avancado.web.resource;

import dev.claudioBessa.java.avancado.web.model.Professor;
import dev.claudioBessa.java.avancado.web.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorResource {

    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public ResponseEntity<Professor> salvar(@RequestBody Professor professor){
        return ResponseEntity.ok(professorService.salvar(professor));
    }

   @GetMapping
   public ResponseEntity<List<Professor>> getProfessor(){
        return ResponseEntity.ok(professorService.listarProfessor());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> consultaPorId(@PathVariable int id){
        return ResponseEntity.ok(professorService.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Professor> deletePorId(@PathVariable int id){
        professorService.excluir(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<Professor> alterar(@RequestBody Professor professor){
        return ResponseEntity.ok(professorService.alterar(professor));
    }


    @GetMapping("/like/{nome}")
    public ResponseEntity<List<Professor>> listarPorLike(@PathVariable String nome){
        return ResponseEntity.ok(professorService.buscarProfessorLike(nome));
    }

    @GetMapping("/orderByFaculdade")
    public ResponseEntity<List<Professor>> listarPorFaculdade(){
        return ResponseEntity.ok(professorService.listarPorFaculdade());
    }

    @GetMapping("/orderByDisciplina")
    public ResponseEntity<List<Professor>> listarPorDisciplina(){
        return ResponseEntity.ok(professorService.listarPorDisciplina());
    }


}
