package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.ColorDto;
import net.enjoy.springboot.registrationlogin.entity.Color;
import net.enjoy.springboot.registrationlogin.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ColorService {
    public List<ColorDto> getAllColors();
}