package cl.praxis.JWTPraxis.model.service;

import cl.praxis.JWTPraxis.model.entities.Language;

import java.util.List;

public interface LanguageService {
  List<Language> findAll();
  Language findOne(int id);
}
