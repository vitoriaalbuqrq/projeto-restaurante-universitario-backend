package com.project.restaurante_universitario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.restaurante_universitario.dto.EnderecoDTO;
import com.project.restaurante_universitario.entities.Endereco;
import com.project.restaurante_universitario.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Transactional(readOnly = true)
    public EnderecoDTO findById(Integer id) {
        Endereco endereco = enderecoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("endereco não encontrado com o ID: " + id));
        return new EnderecoDTO(endereco);
    }

    @Transactional(readOnly = true)
    public List<EnderecoDTO> findAll(){
        List<Endereco> result = enderecoRepository.findAll();
        return result.stream().map(x -> new EnderecoDTO(x)).toList();
    }

    @Transactional
    public EnderecoDTO create(EnderecoDTO enderecoDTO){
        Endereco endereco = new Endereco();
        endereco.setRua(enderecoDTO.getRua());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setCep(enderecoDTO.getCep());
        endereco.setCidade(enderecoDTO.getCidade());
        endereco.setEstado(enderecoDTO.getEstado());
        endereco.setPais(enderecoDTO.getPais());

        endereco = enderecoRepository.save(endereco);
        return new EnderecoDTO(endereco);
    }

    @Transactional
    public EnderecoDTO update(Integer id, EnderecoDTO enderecoDTO){
        Endereco endereco = enderecoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Endereco não encontrado com o ID: " + id));

        endereco.setRua(enderecoDTO.getRua());
        endereco.setNumero(enderecoDTO.getNumero());
        endereco.setCep(enderecoDTO.getCep());
        endereco.setCidade(enderecoDTO.getCidade());
        endereco.setEstado(enderecoDTO.getEstado());
        endereco.setPais(enderecoDTO.getPais());

        endereco = enderecoRepository.save(endereco);
        return new EnderecoDTO(endereco);
    }

    @Transactional
    public void delete(Integer id) {
        enderecoRepository.deleteById(id);
    }
}
