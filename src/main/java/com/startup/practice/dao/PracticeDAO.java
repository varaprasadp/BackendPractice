package com.startup.practice.dao;

import java.util.List;
import java.util.Optional;

import com.startup.practice.dto.PracticeDTO;

public interface PracticeDAO {

	Optional<PracticeDTO> getName(Integer id);

	List<PracticeDTO> getAllNames();
	
	PracticeDTO insertRecord(PracticeDTO p);

}
