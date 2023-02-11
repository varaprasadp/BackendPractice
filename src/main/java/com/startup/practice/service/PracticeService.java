package com.startup.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.practice.dao.PracticeDAO;
import com.startup.practice.dto.PracticeDTO;
import com.startup.practice.entity.UserEntity;
import com.startup.practice.repository.PracticeUserRepository;

@Service
public class PracticeService {
	
	@Autowired
	PracticeDAO pd;
	
	public Optional<PracticeDTO> getName(Integer id) {
		return pd.getName(id);
	}
	public List<PracticeDTO> getAllNames() {
		return pd.getAllNames();
	}
	public PracticeDTO addName(PracticeDTO pe) {
		return pd.insertRecord(pe);
	}
}
