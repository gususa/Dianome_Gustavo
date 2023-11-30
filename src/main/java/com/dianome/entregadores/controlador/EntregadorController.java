package com.dianome.entregadores.controlador;

import com.dianome.entregadores.modelo.Entregador;
import com.dianome.entregadores.repositorio.EntregadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entregadores")
public class EntregadorController {

    @Autowired
    private EntregadorRepository repository;

    // Adicionar Entregador
    @PostMapping
    public Entregador adicionarEntregador(@RequestBody Entregador entregador) {
        return repository.save(entregador);
    }

    // Listar Todos os Entregadores
    @GetMapping
    public List<Entregador> listarTodos() {
        return repository.findAll();
    }

    // Detalhes do Entregador
    @GetMapping("/{cpf}")
    public ResponseEntity<Entregador> obterEntregador(@PathVariable String cpf) {
        Optional<Entregador> entregador = repository.findById(cpf);
        return entregador.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Atualizar Entregador
    @PutMapping("/{cpf}")
    public ResponseEntity<Entregador> atualizarEntregador(@PathVariable String cpf, @RequestBody Entregador detalhesEntregador) {
        return repository.findById(cpf)
                .map(entregadorExistente -> {
                    entregadorExistente.setNome(detalhesEntregador.getNome());
                    entregadorExistente.setCapacidadeDoVeiculo(detalhesEntregador.getCapacidadeDoVeiculo());
                    Entregador entregadorAtualizado = repository.save(entregadorExistente);
                    return ResponseEntity.ok(entregadorAtualizado);
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Deletar Entregador
    @DeleteMapping("/{cpf}")
    public ResponseEntity<?> deletarEntregador(@PathVariable String cpf) {
        return repository.findById(cpf)
                .map(entregador -> {
                    repository.delete(entregador);
                    return ResponseEntity.ok().build();
                }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
