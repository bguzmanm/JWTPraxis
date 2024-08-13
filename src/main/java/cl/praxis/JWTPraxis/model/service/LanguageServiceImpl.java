package cl.praxis.JWTPraxis.model.service;

import cl.praxis.JWTPraxis.model.entities.Language;
import cl.praxis.JWTPraxis.model.repository.LanguageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

  private final LanguageRepository repository;

  public LanguageServiceImpl(LanguageRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Language> findAll() {
    return repository.findAll();
  }

  @Override
  public Language findOne(int id) {
    return repository.findById(id).orElse(null);
  }
}
