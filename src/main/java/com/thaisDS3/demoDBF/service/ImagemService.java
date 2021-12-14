package com.thaisDS3.demoDBF.service;

import com.thaisDS3.demoDBF.domain.Imagem;
import com.thaisDS3.demoDBF.repository.ImagemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class ImagemService {
    private final Logger log = LoggerFactory.getLogger(ImagemService.class);

    private final ImagemRepository imagemRepository;

    public ImagemService(ImagemRepository imagemRepository) {
        this.imagemRepository = imagemRepository;
    }

    public List<Imagem> findAllList(){
        log.debug("Request to get All Imagem");
        return imagemRepository.findAll();
    }

    public Optional<Imagem> findOne(Long id) {
        log.debug("Request to get Imagem : {}", id);
        return imagemRepository.findById(id);
    }

    public void delete(Long id) {
        log.debug("Request to delete Imagem : {}", id);
        imagemRepository.deleteById(id);
    }

    public Imagem save(Imagem imagem) {
        log.debug("Request to save Imagem : {}", imagem);
        imagem = imagemRepository.save(imagem);
        return imagem;
    }

    public List<Imagem> saveAll(List<Imagem> imagens) {
        log.debug("Request to save Imagem : {}", imagens);
        imagens = imagemRepository.saveAll(imagens);
        return imagens;
    }
}
