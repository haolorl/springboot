package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.CategoryDto;
import net.enjoy.springboot.registrationlogin.dto.ColorDto;
import net.enjoy.springboot.registrationlogin.entity.Category;
import net.enjoy.springboot.registrationlogin.entity.Color;
import net.enjoy.springboot.registrationlogin.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    public List<ColorDto> getAllColors() {
         List<Color> colors = colorRepository.findAll();
        return colors.stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }
     private ColorDto convertEntityToDto(Color color) {
        return new ColorDto(color.getId(), color.getColorName());
    }
}