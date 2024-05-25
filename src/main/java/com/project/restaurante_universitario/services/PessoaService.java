package com.project.restaurante_universitario.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.restaurante_universitario.dto.PessoaDTO;
import com.project.restaurante_universitario.entities.Pessoa;
import com.project.restaurante_universitario.repositories.PessoaRepository;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional(readOnly = true)
    public PessoaDTO findById(Integer id) {
        Pessoa pessoa = pessoaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrado com o ID: " + id));
        return new PessoaDTO(pessoa);
    }

    @Transactional(readOnly = true)
    public List<PessoaDTO> findAll(){
        List<Pessoa> pessoaDTO = pessoaRepository.findAll();
        return pessoaDTO.stream().map(x -> new PessoaDTO(x)).toList();
    }
    
    @Transactional
    public PessoaDTO create(PessoaDTO pessoaDTO){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setCpf(pessoaDTO.getCpf());
        pessoa.setTelefoneWhatsapp(pessoaDTO.getTelefoneWhatsapp());
        pessoa.setEmail(pessoaDTO.getEmail());

        pessoa = pessoaRepository.save(pessoa);
        return new PessoaDTO(pessoa);        
    }

    @Transactional
    public PessoaDTO update(Integer id, PessoaDTO pessoaDTO){
        Pessoa pessoa = pessoaRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrado com o ID: " + id));
        
        pessoa.setNome(pessoaDTO.getNome());
        pessoa.setCpf(pessoaDTO.getCpf());
        pessoa.setTelefoneWhatsapp(pessoaDTO.getTelefoneWhatsapp());
        pessoa.setEmail(pessoaDTO.getEmail());

        pessoa = pessoaRepository.save(pessoa);
        return new PessoaDTO(pessoa);        
    }

    @Transactional
    public void delete(Integer id) {
        pessoaRepository.deleteById(id);
    }
    
}