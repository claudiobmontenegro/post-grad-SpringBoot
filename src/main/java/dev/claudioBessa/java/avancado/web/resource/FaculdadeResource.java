package dev.claudioBessa.java.avancado.web.resource;

import dev.claudioBessa.java.avancado.web.model.Faculdade;
import dev.claudioBessa.java.avancado.web.service.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculdade")
public class FaculdadeResource {

    @Autowired
    private FaculdadeService faculdadeService;

    @PostMapping
    public ResponseEntity<Faculdade> salvar(@RequestBody Faculdade faculdade){
        return ResponseEntity.ok(faculdadeService.salvar(faculdade));
    }

   @GetMapping
   public ResponseEntity<List<Faculdade>> getFaculdades(){
        return ResponseEntity.ok(faculdadeService.listarFaculdades());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Faculdade> consultaPorId(@PathVariable int id){
        return ResponseEntity.ok(faculdadeService.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Faculdade> deletePorId(@PathVariable int id){
        faculdadeService.excluir(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<Faculdade> alterar(@RequestBody Faculdade faculdade){
        return ResponseEntity.ok(faculdadeService.alterar(faculdade));
    }


    @GetMapping("/like/{nome}")
    public ResponseEntity<List<Faculdade>> listarPorLike(@PathVariable String nome){
        return ResponseEntity.ok(faculdadeService.buscarFaculdadeLike(nome));
    }

    @GetMapping("/orderByLocalidade")
    public ResponseEntity<List<Faculdade>> listarPorLocalidade(){
        return ResponseEntity.ok(faculdadeService.listarPorLocalidade());
    }


}
