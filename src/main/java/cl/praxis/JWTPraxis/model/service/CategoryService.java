package cl.praxis.JWTPraxis.model.service;


import cl.praxis.JWTPraxis.model.entities.Category;

import java.util.List;

public interface CategoryService {
  List<Category> findAll();
  Category findOne(int id);
}
