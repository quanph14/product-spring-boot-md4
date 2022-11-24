package com.codegym.productspringboot.service.category;

import com.codegym.productspringboot.model.Category;
import com.codegym.productspringboot.model.Product;
import com.codegym.productspringboot.repository.IProductRepository;
import com.codegym.productspringboot.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface ICategoryService extends IGeneralService<Category> {
}
