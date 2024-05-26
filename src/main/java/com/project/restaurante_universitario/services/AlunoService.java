package com.project.restaurante_universitario.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.restaurante_universitario.dto.AlunoDTO;
import com.project.restaurante_universitario.entities.Aluno;
import com.project.restaurante_universitario.entities.Endereco;
import com.project.restaurante_universitario.repositories.AlunoRepository;
import com.project.restaurante_universitario.repositories.EnderecoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Transactional(readOnly = true)
    public AlunoDTO findById(Integer id) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aluno não encontrado com o ID: " + id));
        return new AlunoDTO(aluno);
    }

    @Transactional(readOnly = true)
    public List<AlunoDTO> findAll() {
        List<Aluno> result = alunoRepository.findAll();
        return result.stream().map(x -> new AlunoDTO(x)).toList();
    }

    @Transactional
    public AlunoDTO create(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno();
        aluno.setMatricula(alunoDTO.getMatricula());
        aluno.setNomeCompleto(alunoDTO.getNomeCompleto());
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setCurso(alunoDTO.getCurso());

        // Buscar Endereco pelo ID
        Endereco endereco = enderecoRepository.findById(alunoDTO.getEnderecoId())
                .orElseThrow(() -> new ResourceNotFoundException("Endereço não encontrado com o ID: " + alunoDTO.getEnderecoId()));
        aluno.setEndereco(endereco);

        aluno = alunoRepository.save(aluno);
        return new AlunoDTO(aluno);
    }

    @Transactional
    public AlunoDTO update(Integer id, AlunoDTO alunoDTO) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Aluno não encontrado com o ID: " + id));

        aluno.setMatricula(alunoDTO.getMatricula());
        aluno.setNomeCompleto(alunoDTO.getNomeCompleto());
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setCurso(alunoDTO.getCurso());

        // Buscar Endereco pelo ID
        Endereco endereco = enderecoRepository.findById(alunoDTO.getEnderecoId())
                .orElseThrow(() -> new ResourceNotFoundException("Endereço não encontrado com o ID: " + alunoDTO.getEnderecoId()));
        aluno.setEndereco(endereco);

        aluno = alunoRepository.save(aluno);
        return new AlunoDTO(aluno);
    }

    @Transactional
    public void delete(Integer id) {
        alunoRepository.deleteById(id);
    }

}
