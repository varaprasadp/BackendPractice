package com.startup.practice.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.startup.practice.dto.PracticeDTO;
import com.startup.practice.entity.LocationEntity;
import com.startup.practice.entity.UserEntity;
import com.startup.practice.repository.PracticeLocationRepository;
import com.startup.practice.repository.PracticeUserRepository;

@Component
public class PracticeDAOImpl implements PracticeDAO{
	@Autowired
	PracticeUserRepository pur;
	@Autowired
	PracticeLocationRepository plr;

	@Override
	public Optional<PracticeDTO> getName(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<UserEntity> ue = pur.findById(id);
		Optional<PracticeDTO> pd = ue.map(user -> 
			Optional.of(createPracticeDTO(user, plr.getById(user.getLocId()))).orElse(null));
		return pd;
	}

	@Override
	public List<PracticeDTO> getAllNames() {
		// TODO Auto-generated method stub
		List<PracticeDTO> res = new ArrayList<>();
		List<UserEntity> userList = pur.findAll();
		for(UserEntity user: userList) {
			res.add(createPracticeDTO(user, plr.getById(user.getLocId())));
		}
		
		return res;
	}

	@Override
	public PracticeDTO insertRecord(PracticeDTO p) {
		// TODO Auto-generated method stub
		
		LocationEntity le = plr.saveAndFlush(new LocationEntity(p.getLocation()));
		UserEntity ue = pur.saveAndFlush(new UserEntity(p.getName(), le.getLocId()));
		
		return createPracticeDTO(ue, le);
	}

	private PracticeDTO createPracticeDTO(UserEntity ue, LocationEntity le ) {
		return new PracticeDTO(ue.getName(), le.getLocation());
	}
}
