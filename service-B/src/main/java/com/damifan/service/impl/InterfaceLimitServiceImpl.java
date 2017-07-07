package com.damifan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damifan.entity.InterfaceLimit;
import com.damifan.mapper.InterfaceLimitMapper;
import com.damifan.service.InterfaceLimitService;

@Service
public class InterfaceLimitServiceImpl implements InterfaceLimitService {
	
	@Autowired
	private InterfaceLimitMapper interfaceLimitMapper;

	@Override
	public InterfaceLimit getEntityByPri(Integer id) {
		return interfaceLimitMapper.selectByPrimaryKey(id);
	}

}
