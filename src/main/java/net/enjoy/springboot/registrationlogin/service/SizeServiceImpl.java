package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.ColorDto;
import net.enjoy.springboot.registrationlogin.dto.SizeDto;
import net.enjoy.springboot.registrationlogin.entity.Color;
import net.enjoy.springboot.registrationlogin.entity.Size;
import net.enjoy.springboot.registrationlogin.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    public List<SizeDto> getAllSizes() {
          List<Size> sizes = sizeRepository.findAll();
        return sizes.stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }
     private SizeDto convertEntityToDto(Size size) {
        return new SizeDto(size.getId(), size.getSizeName());
    }
}