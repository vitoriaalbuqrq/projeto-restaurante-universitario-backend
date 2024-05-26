package com.project.restaurante_universitario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.restaurante_universitario.dto.RestauranteDTO;
import com.project.restaurante_universitario.entities.Endereco;
import com.project.restaurante_universitario.entities.Pessoa;
import com.project.restaurante_universitario.entities.Restaurante;
import com.project.restaurante_universitario.repositories.EnderecoRepository;
import com.project.restaurante_universitario.repositories.PessoaRepository;
import com.project.restaurante_universitario.repositories.RestauranteRepository;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Transactional(readOnly = true)
    public RestauranteDTO findById(Integer id){
        Restaurante restaurante = restauranteRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Restaurante não encontrado com o ID: " + id));
        return new RestauranteDTO(restaurante);
    }
        
    @Transactional(readOnly = true)
    public List<RestauranteDTO> findAll(){
        List<Restaurante> restaurante = restauranteRepository.findAll();
        return restaurante.stream().map(x -> new RestauranteDTO(x)).toList();
    }

    @Transactional
    public RestauranteDTO create(RestauranteDTO restauranteDTO) {

        Restaurante restaurante = new Restaurante();

        Endereco endereco = enderecoRepository.findById(restauranteDTO.getEnderecoId())
                .orElseThrow(() -> new ResourceNotFoundException("Endereço não encontrado com o ID: " + restauranteDTO.getEnderecoId()));
        restaurante.setEndereco(endereco);

        Pessoa pessoaResponsavel = pessoaRepository.findById(restauranteDTO.getPessoaResponsavelId())
                .orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrada com o ID: " + restauranteDTO.getPessoaResponsavelId()));
        restaurante.setPessoaResponsavel(pessoaResponsavel);

        restaurante.setNomeRestaurante(restauranteDTO.getNomeRestaurante());
        //restaurante.setEndereco(restauranteDTO.getEndereco());
        //restaurante.setPessoaResponsavel(restauranteDTO.getPessoaResponsavel());
        restaurante.setCapacidadeRefeicao(restauranteDTO.getCapacidadeRefeicao());
        restaurante.setHorarioCafeDaManha(restauranteDTO.getHorarioCafeDaManha());
        restaurante.setHorarioAlmoco(restauranteDTO.getHorarioAlmoco());
        restaurante.setHorarioJantar(restauranteDTO.getHorarioJantar());
        restaurante.setDiasFuncionamento(restauranteDTO.getDiasFuncionamento());

        restaurante = restauranteRepository.save(restaurante);
        return new RestauranteDTO(restaurante);
    }

    @Transactional
    public RestauranteDTO update(Integer id, RestauranteDTO restauranteDTO) {
        Restaurante restaurante = restauranteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurante não encontrado com o ID: " + id));
        
        Endereco endereco = enderecoRepository.findById(restauranteDTO.getEnderecoId())
                .orElseThrow(() -> new ResourceNotFoundException("Endereço não encontrado com o ID: " + restauranteDTO.getEnderecoId()));
        restaurante.setEndereco(endereco);

        Pessoa pessoaResponsavel = pessoaRepository.findById(restauranteDTO.getPessoaResponsavelId())
                .orElseThrow(() -> new ResourceNotFoundException("Pessoa não encontrada com o ID: " + restauranteDTO.getPessoaResponsavelId()));
        restaurante.setPessoaResponsavel(pessoaResponsavel);

        restaurante.setNomeRestaurante(restauranteDTO.getNomeRestaurante());
        restaurante.setCapacidadeRefeicao(restauranteDTO.getCapacidadeRefeicao());
        restaurante.setHorarioCafeDaManha(restauranteDTO.getHorarioCafeDaManha());
        restaurante.setHorarioAlmoco(restauranteDTO.getHorarioAlmoco());
        restaurante.setHorarioJantar(restauranteDTO.getHorarioJantar());
        restaurante.setDiasFuncionamento(restauranteDTO.getDiasFuncionamento());

        restaurante = restauranteRepository.save(restaurante);
        return new RestauranteDTO(restaurante);
    }

    @Transactional
    public void delete(Integer id) {
        restauranteRepository.deleteById(id);
    }
}
