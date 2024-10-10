package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.SizeDto;
import net.enjoy.springboot.registrationlogin.entity.Size;
import net.enjoy.springboot.registrationlogin.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SizeService {
    public List<SizeDto> getAllSizes();
}