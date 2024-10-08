package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.CategoryDto;
import net.enjoy.springboot.registrationlogin.dto.UserDto;
import net.enjoy.springboot.registrationlogin.entity.Category;
import net.enjoy.springboot.registrationlogin.entity.User;
import net.enjoy.springboot.registrationlogin.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override   
    public List<CategoryDto> getAllCategory() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    private CategoryDto convertEntityToDto(Category category) {
        return new CategoryDto(category.getId(), category.getCategoryName());
    }


//    private CategoryDto convertEntityToDto(CategoryDto categoryDto) {
//        return new CategoryDto(categoryDto.getId(), categoryDto.getName(), categoryDto.getStatus());
//    }
//    @Override
//    public String findCategoryNameById(Long categoryId) {
//        return categoryRepository.findById(categoryId)
//                .map(Category::getName)
//                .orElse("No category");
//    }
}
